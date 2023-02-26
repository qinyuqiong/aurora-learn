package com.aurora.repository;

import com.aurora.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.lang.NonNull;

import java.util.List;

/**
 * @author yuqiong
 * @date 2023/2/26
 */
public interface TagRepository extends JpaRepository<Tag, Long>, JpaSpecificationExecutor<Tag> {
    List<Tag> findByTagNameLikeOrderById(@NonNull String tagName);
}
