package com.komiles.study.entity.param;

import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author komiles@163.com
 * @date 2020-04-03 18:07
 */
@Data
public class UserInfoParam {

    private Long id;

//    @NotNull(message = "名字不能为空")
    private String name;

//    @NotNull(message = "年龄不能为空")
    private Integer age;

    /**
     * 排序字段
     */
    private String orderField;

    /**
     * 排序方式 ASC DESC
     */
    private String orderType;
}
