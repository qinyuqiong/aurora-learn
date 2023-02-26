package com.aurora.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yuqiong
 * @date 2022/12/3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("标签dto")
public class TagDTO {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("标签名")
    private String tagName;
    @ApiModelProperty("统计")
    private Long count;
}
