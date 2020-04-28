package com.komiles.study.entity.dto;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author komiles@163.com
 * @date 2020-04-28 17:52
 */
@Data
@Accessors(chain = true)
@RequiredArgsConstructor(staticName = "of")
public class TestDTO {

    private Integer userId;

    @NonNull
    private String username;

    private Integer age;

}
