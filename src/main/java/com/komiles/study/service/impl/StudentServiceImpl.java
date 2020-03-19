package com.komiles.study.service.impl;

import com.komiles.study.domain.Student;
import com.komiles.study.mapper.StudentMapper;
import com.komiles.study.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getStudentById(Integer id) {
        return studentMapper.findUserById(id);
    }
}
