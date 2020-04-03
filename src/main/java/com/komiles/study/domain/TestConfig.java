package com.komiles.study.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author komiles@163.com
 * @date 2020-04-03 17:36
 */
@Component
@Data
@ConfigurationProperties(prefix = "weixin")
public class TestConfig {
    private String appId;

    private String appSecret;
}
