package com.komiles.study.pattern.filter;

import java.util.List;

/**
 * @author komiles@163.com
 * @date 2020-05-26 11:13
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> personList);
}
