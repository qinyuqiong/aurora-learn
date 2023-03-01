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
 * @date 2023/3/1
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户基本信息")
public class UserInfoVO {
    @NotBlank(message = "昵称不能为空")
    @ApiModelProperty(name = "nickname", value = "昵称", dataType = "String")
    private String nickname;

    @ApiModelProperty(name = "intro", value = "介绍", dataType = "String")
    private String intro;

    @ApiModelProperty(name = "webSite", value = "个人网站", dataType = "String")
    private String website;
}
