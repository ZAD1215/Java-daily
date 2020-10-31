package com.zyh.day12;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import jdk.nashorn.internal.ir.ReturnNode;

import java.io.OutputStream;

/**
 * @ClassName OutstandingClass
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/31
 **/
public class OutstandingClass {
    private String name;
    private Student students;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public OutstandingClass(String name, Student students) {

    }
}
