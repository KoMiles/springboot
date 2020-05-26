package com.komiles.study.pattern.filter;

import java.util.List;

/**
 * 组合条件-或
 * @author komiles@163.com
 * @date 2020-05-26 11:38
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(personList);
        List<Person> otherCriteriaItmes = otherCriteria.meetCriteria(personList);

        for(Person person:firstCriteriaItems) {
            if(!firstCriteriaItems.contains(person)) {
                otherCriteriaItmes.add(person);
            }
        }
        return otherCriteriaItmes;
    }
}
