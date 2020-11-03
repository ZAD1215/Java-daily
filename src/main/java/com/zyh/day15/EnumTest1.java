package com.zyh.day15;

/**
 * @ClassName EnumTest1
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/3
 **/
enum ColorsEnum {
    RED("红色", 1),
    BLUE("蓝色", 2),
    YELLOW("黄色", 3),
    GREEN("绿色", 4);
    ColorsEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }
    private String name;
    private int index;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
}
public class EnumTest1 {
    public static void main(String[] args) {
        System.out.println(ColorsEnum.RED.getName());
        System.out.println(ColorsEnum.RED.getIndex());
    }
}
