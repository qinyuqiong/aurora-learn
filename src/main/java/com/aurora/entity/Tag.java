package com.aurora.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author yuqiong
 * @date 2022/11/29
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_tag")
public class Tag {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    private Long id;

    private String tagName;

    @CreatedDate
    private LocalDateTime createTime;

    @UpdateTimestamp
    private LocalDateTime updateTime;
}
