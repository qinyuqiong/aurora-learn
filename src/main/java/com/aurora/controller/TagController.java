package com.aurora.controller;

import com.aurora.model.dto.TagAdminDTO;
import com.aurora.model.dto.TagDTO;
import com.aurora.model.vo.ConditionVO;
import com.aurora.model.vo.ResultVO;
import com.aurora.model.vo.TagVo;
import com.aurora.service.TagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 标签
 *
 * @author yuqiong
 * @date 2022/11/30
 */
@Api(tags = "标签模块")
@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    /**
     * 获取所有标签
     *
     * @return
     */
    @ApiOperation("获取所有标签")
    @GetMapping("/all")
    public ResultVO<List<TagDTO>> getAll() {
        List<TagDTO> list = tagService.getAll();
        return ResultVO.ok(list);
    }

    @ApiOperation("获取前十个标签")
    @GetMapping("/topTen")
    public ResultVO<List<TagDTO>> getTopTenTags() {
        return ResultVO.ok(tagService.listTopTenTags());
    }

    // TODO: 2023/2/26
    //@ApiOperation(value = "查询后台标签列表")
    //@GetMapping("/admin")
    //public ResultVO<PageResultDTO<TagAdminDTO>> listTagsAdmin(ConditionVO conditionVO) {
    //    return ResultVO.ok(tagService.listTagsAdmin(conditionVO));
    //}

    @ApiOperation(value = "搜索文章标签")
    @PostMapping("/find")
    public ResultVO<List<TagAdminDTO>> listTagsAdminBySearch(@RequestBody ConditionVO conditionVo) {
        return ResultVO.ok(tagService.listTagsAdminBySearch(conditionVo));
    }

    @ApiOperation("添加或修改")
    @PostMapping("/save")
    public ResultVO<Void> saveOrUpdate(@Valid @RequestBody TagVo tagVo) {
        tagService.saveOrUpdate(tagVo);
        return ResultVO.ok();
    }

    @ApiOperation("删除标签")
    @DeleteMapping("/delete")
    public ResultVO<Void> deleteTag(@RequestBody List<Long> tagIds) {
        tagService.deleteTag(tagIds);
        return ResultVO.ok();
    }
}
