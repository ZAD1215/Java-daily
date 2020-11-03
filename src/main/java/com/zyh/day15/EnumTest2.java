package com.zyh.day15;

/**
 * @ClassName EnumTest2
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/3
 **/
enum ColorEnum2 {
    RED,
    BLUE
}
public class EnumTest2 {
    public static void main(String[] args) {
        ColorEnum2 redColor = ColorEnum2.RED;
        ColorEnum2 redColor2 = ColorEnum2.RED;
        System.out.println(redColor == redColor2);
        System.out.println(redColor.equals(redColor2));
    }
}
