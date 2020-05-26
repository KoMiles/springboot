package com.komiles.study.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤性别-女性
 * @author komiles@163.com
 * @date 2020-05-26 11:16
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femaleList = new ArrayList<Person>();
        for(Person person : personList){
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femaleList.add(person);
            }
        }
        return femaleList;
    }
}
