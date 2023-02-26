package com.aurora.mapper;

import com.aurora.entity.Tag;
import com.aurora.model.dto.TagAdminDTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author yuqiong
 * @date 2023/2/26
 */
@Mapper(componentModel = "spring")
public interface TagMapper {

    List<TagAdminDTO> toTagAdminDtoList(List<Tag> tags);
}
