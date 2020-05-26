package com.komiles.study.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤性别-男性
 * @author komiles@163.com
 * @date 2020-05-26 11:14
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {

        List<Person> malePersonList = new ArrayList<Person>();
        for (Person person : personList){
            if(person.getGender().equalsIgnoreCase("MALE")) {
                malePersonList.add(person);
            }
        }
        return malePersonList;
    }
}
