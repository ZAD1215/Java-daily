package com.zyh.day12;

/**
 * @ClassName Student
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/31
 **/
public class Student {
    private String name;
    private int age;
    private int stature;
    private SpecialityEnum specialities;

    public Student(String name1, int age1, int stature1) {
        super();
        this.name = name1;
        this.age = age1;
        this.stature = stature1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getStature() {
        return stature;
    }
    public void getStature(int stature) {
        this.stature = stature;
    }
    public SpecialityEnum getSpecialities() {
        return specialities;
    }

    public void setSpecialities(SpecialityEnum specialities) {
        this.specialities = specialities;
    }

    public String getName(Student student) {
        return name;
    }


    public enum SpecialityEnum{
        SING,DANCE,SWINNING,RUNNING
    }
}
