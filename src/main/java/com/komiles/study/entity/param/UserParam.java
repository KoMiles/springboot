package com.komiles.study.entity.param;

import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserParam {
    private Integer id;

    @NotNull(message = "用户名不能为空")
    private String username;

    @NotNull(message = "密码不能为空")
    private String password;
}
