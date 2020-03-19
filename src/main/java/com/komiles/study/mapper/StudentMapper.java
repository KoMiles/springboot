package com.komiles.study.mapper;

import com.komiles.study.domain.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {

    Student findUserById(Integer id);
}
