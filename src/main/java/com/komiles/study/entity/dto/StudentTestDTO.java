package com.komiles.study.entity.dto;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

/**
 * @author komiles@163.com
 * @date 2020-04-28 18:08
 */
@Data
@Builder
public class StudentTestDTO implements Serializable {

    private Integer id;

    private String name;

    private Integer age;
}
