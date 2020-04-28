package com.komiles.study.entity.common;


import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * @author komiles@163.com
 * @date 2020-04-28 14:17
 */
@Data
public class PageDTO<T> implements Serializable {


    /**
     * 总数
     */
    private Long total;

    /**
     * 每页条数
     */
    private Integer pageSize;

    /**
     * 当前页
     */
    private Integer pageNum;

    /**
     * 数据
     */
    private List<T> list;
}
