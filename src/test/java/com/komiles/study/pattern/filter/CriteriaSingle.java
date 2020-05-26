package com.komiles.study.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤婚姻状况-单身
 * @author komiles@163.com
 * @date 2020-05-26 11:18
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersonList = new ArrayList<Person>();
        for (Person person : personList){
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersonList.add(person);
            }
        }
        return singlePersonList;
    }
}
