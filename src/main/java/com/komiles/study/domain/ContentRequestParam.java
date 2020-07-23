package com.komiles.study.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

/**
 * @author komiles@163.com
 * @date 2020-07-23 15:51
 */
@Data
public class ContentRequestParam implements Serializable {

    @NotNull
    @JsonProperty(value = "content_id")
    private String contentId;

    @NotNull
    @JsonProperty(value = "content_type")
    private Integer contentType;

    @NotNull
    @JsonProperty(value = "publish_uid")
    private Integer publishUid;

    @JsonProperty(value = "publish_time")
    @NotNull
    private String publishTime;

    @NotNull
    @JsonProperty(value = "session_id")
    private String sessionId;

    @NotNull
    private String scene;

    private String ip;

    private String phone;

    private String email;

    private String nickname;
}
