package com.aurora.service;

import com.aurora.entity.Tag;
import com.aurora.mapper.TagMapper;
import com.aurora.model.dto.TagAdminDTO;
import com.aurora.model.dto.TagDTO;
import com.aurora.model.vo.ConditionVO;
import com.aurora.model.vo.TagVo;
import com.aurora.repository.ArticleTagRepository;
import com.aurora.repository.TagRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

/**
 * @author yuqiong
 * {@code @date}  2022/11/29
 */
@Service
public class TagService {
    private final TagRepository tagRepository;

    private final TagMapper tagMapper;

    private final ArticleTagService articleTagService;
    private final ArticleTagRepository articleTagRepository;

    public TagService(TagMapper tagMapper, TagRepository tagRepository, ArticleTagService articleTagService,
                      ArticleTagRepository articleTagRepository) {
        this.tagMapper = tagMapper;
        this.tagRepository = tagRepository;
        this.articleTagService = articleTagService;
        this.articleTagRepository = articleTagRepository;
    }

    public void save(String tagName) {
        Tag tag = new Tag();
        tag.setTagName(tagName);
        tagRepository.save(tag);
    }

    // TODO: 2023/2/26 目前是直接全部查询，如果后面发现对数据库的压力大。再修改 
    public List<TagDTO> getAll() {
        //获取所有标签
        List<Tag> all = tagRepository.findAll();
        return all.stream().map(tag -> TagDTO.builder()
                .id(tag.getId())
                .tagName(tag.getTagName())
                .count(articleTagService.countTag(tag.getId()))
                .build()).toList();
    }

    // TODO: 2023/2/26 原作者使用的连表查询，个人不太喜欢联表。但这也不是个好做法 
    public List<TagDTO> listTopTenTags() {
        List<TagDTO> all = getAll();
        return all.stream()
                .sorted(Comparator.comparing(TagDTO::getCount))
                .limit(10).toList();
    }

    public List<TagAdminDTO> listTagsAdminBySearch(ConditionVO conditionVo) {
        String keyword = conditionVo.getKeyword();
        String findKey = "%" + keyword + "%";
        List<Tag> tags = tagRepository.findByTagNameLikeOrderById(findKey);
        return tags.stream()
                .map(tag -> TagAdminDTO.builder()
                        .id(tag.getId())
                        .tagName(tag.getTagName())
                        .createTime(tag.getCreateTime())
                        .articleCount(articleTagService.countTag(tag.getId()))
                        .build()).toList();
    }

    public void saveOrUpdate(TagVo tagVo) {
        Tag tag = tagMapper.toTag(tagVo);
        tagRepository.save(tag);
    }

    public void deleteTag(List<Long> tagIds) {
        tagRepository.deleteAllByIdInBatch(tagIds);
    }
}
