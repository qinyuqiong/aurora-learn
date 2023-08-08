package com.aurora.repository;

import com.aurora.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 17273
 * @date 2023/6/17
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
}
