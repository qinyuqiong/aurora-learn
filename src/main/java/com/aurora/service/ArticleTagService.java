package com.aurora.service;

import com.aurora.repository.ArticleTagRepository;
import org.springframework.stereotype.Service;

/**
 * @author yuqiong
 * @date 2023/2/26
 */
@Service
public class ArticleTagService {

    private final ArticleTagRepository articleTagRepository;

    public ArticleTagService(ArticleTagRepository articleTagRepository) {
        this.articleTagRepository = articleTagRepository;
    }

    public Long countTag(Long tagId) {
        return articleTagRepository.count((root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("tagId"), tagId));
    }

}
