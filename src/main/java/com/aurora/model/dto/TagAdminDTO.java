package com.aurora.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author yuqiong
 * @date 2023/2/26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TagAdminDTO {
    private Long id;

    private String tagName;

    private Long articleCount;

    private LocalDateTime createTime;
}
