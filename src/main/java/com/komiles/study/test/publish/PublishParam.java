package com.komiles.study.test.publish;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author komiles@163.com
 * @date 2020-07-23 19:53
 */
@Data
public class PublishParam extends GeetestVerifyParam {

    @JSONField(name = "session_id")
    private String sessionId;

    private PublishParam attr;
}
