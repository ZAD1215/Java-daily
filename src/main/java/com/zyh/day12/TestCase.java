package com.zyh.day12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName TestCase
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/31
 **/
public class TestCase {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(new Student("路飞", 22,175),
                new Student("红发",40,180),
                new Student("白胡子",50,185)).collect(Collectors.toList());
        System.out.println(studentList);
    }
}
