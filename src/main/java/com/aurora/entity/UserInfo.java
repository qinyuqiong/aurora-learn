package com.aurora.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author yuqiong
 * @date 2023/3/1
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_user_info")
public class UserInfo {
    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    private Integer id;

    private String email;

    private String nickname;

    private String avatar;

    private String intro;

    private String website;

    private Integer isSubscribe;

    private Integer isDisable;

    @CreatedDate
    private LocalDateTime createTime;

    @UpdateTimestamp
    private LocalDateTime updateTime;

}
