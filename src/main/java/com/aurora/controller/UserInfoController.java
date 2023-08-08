package com.aurora.controller;

import com.aurora.model.vo.ResultVO;
import com.aurora.model.vo.UserInfoVO;
import com.aurora.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuqiong
 * @date 2023/3/1
 */
@Api(tags = "用户信息模块")
@RestController
@RequestMapping("/users")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @ApiOperation("更新用户信息")
    @PostMapping("/update")
    public ResultVO<Void> updateUserInfo(@RequestBody UserInfoVO userInfoVO) {
        userInfoService.updateUserInfo(userInfoVO);
        return ResultVO.ok();
    }

    /**
     * 更新用户信息
     * 更新用户头像
     * 绑定用户的订阅状态
     * 修改用户角色
     * 修改用户禁用状态
     * 查看在线用户
     * 下线用户
     * 根据id获取用户信息
     */
}
