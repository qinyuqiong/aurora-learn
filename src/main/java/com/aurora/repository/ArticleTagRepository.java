package com.aurora.repository;

import com.aurora.entity.ArticleTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author yuqiong
 * @date 2023/2/26
 */
public interface ArticleTagRepository  extends JpaRepository<ArticleTag, Long>, JpaSpecificationExecutor<ArticleTag> {

}
