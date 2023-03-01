package com.aurora.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author yuqiong
 * @date 2022/12/3
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("标签入参")
public class TagVO {

    @ApiModelProperty(value = "标签id(更新传入)")
    private Long id;

    @NotBlank(message = "标签不可为空")
    @ApiModelProperty(value = "标签名", required = true)
    private String tagName;
}
