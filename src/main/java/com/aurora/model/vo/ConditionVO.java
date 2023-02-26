package com.aurora.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yuqiong
 * @date 2023/2/26
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "查询条件")
public class ConditionVO {
    @ApiModelProperty(name = "name", value = "页码")
    private Long current;

    @ApiModelProperty(value = "条数")
    private Long size;

    @ApiModelProperty(value = "搜索内容")
    private String keyword;

    @ApiModelProperty(value = "分类id")
    private Integer categoryId;

    @ApiModelProperty(value = "标签id")
    private Integer tagId;

}
