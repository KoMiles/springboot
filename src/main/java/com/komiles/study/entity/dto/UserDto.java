package com.komiles.study.entity.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class UserDto implements Serializable {

    private int id;

    private String username;

    private String password;
}
