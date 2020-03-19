package com.komiles.study.domain;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
public class User {
    private Integer id;

    private String username;

    private String password;
}
