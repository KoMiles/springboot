package com.komiles.study.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author komiles@163.com
 * @date 2020-06-16 11:56
 */
@Data
@Component
@ConfigurationProperties(prefix = "mafengwo")
public class MafengwoConfig {

    private String appId;

    private String appSecret;


}
