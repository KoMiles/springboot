package com.komiles.study.pattern.mvc;

/**
 * @author komiles@163.com
 * @date 2020-05-31 23:56
 */
public class StudentView {

    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }

}
