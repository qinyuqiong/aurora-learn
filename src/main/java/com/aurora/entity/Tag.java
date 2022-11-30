package com.aurora.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author yuqiong
 * @date 2022/11/29
 */
@Data
@TableName("t_tag")
public class Tag {

    @TableId
    private Long id;
    private String tagName;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
