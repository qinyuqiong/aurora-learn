package com.aurora.controller;

import com.aurora.entity.Tag;
import com.aurora.mapper.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yuqiong
 * @date 2022/11/30
 */
@RestController
@RequestMapping("/test")
public class TagController {

    @Autowired
    private TagMapper tagMapper;

    @GetMapping("/save")
    public void save() {
        System.out.println(("----- selectAll method test ------"));
        List<Tag> tags = tagMapper.selectList(null);
        tags.forEach(System.out::println);
    }

}
