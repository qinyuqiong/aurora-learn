package com.aurora.service;

import com.aurora.entity.UserInfo;
import com.aurora.model.vo.UserInfoVO;
import com.aurora.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuqiong
 * @date 2023/3/1
 */
@Service
public class UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Autowired
    private UserInfoMapper userInfoMapper;


    public void updateUserInfo(UserInfoVO userInfoVO) {
        UserInfo
    }
}
