package com.komiles.study.test.publish;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import lombok.Data;

/**
 * @author komiles@163.com
 * @date 2020-07-23 19:54
 */
@Data
public class DataParam implements Serializable {
    @JSONField(name = "content_id")
    private String contentId;

    @JSONField(name = "content_type")
    private Integer contentType;
}
