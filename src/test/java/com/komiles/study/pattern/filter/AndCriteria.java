package com.komiles.study.pattern.filter;

import java.util.List;

/**
 * 组合条件-并且
 * @author komiles@163.com
 * @date 2020-05-26 11:20
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstPersonList = criteria.meetCriteria(personList);
        return otherCriteria.meetCriteria(firstPersonList);
    }
}
