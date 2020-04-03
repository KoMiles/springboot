package com.komiles.study.entity.dto;

import lombok.Data;

/**
 * @author komiles@163.com
 * @date 2020-04-03 18:16
 */
@Data
public class UserInfoDTO {
    private Long id;

    private String name;

    private Integer age;

    public UserInfoDTO(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public UserInfoDTO(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public UserInfoDTO() {
    }
}
