package com.komiles.study.controller;

import com.komiles.study.domain.ContentRequestParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author komiles@163.com
 * @date 2020-07-23 15:51
 */
@RestController
@RequestMapping("/publish")
@Slf4j
public class PublishController {

    @PostMapping("save")
    public ContentRequestParam  save(@RequestBody ContentRequestParam contentParam){
        log.info("content_id:{},content_type:{}",contentParam.getContentId(),contentParam.getContentType());
        return contentParam;
    }

    @GetMapping("test")
    public String test(@RequestParam(value = "name") String name)
    {
        return name;
    }
}
