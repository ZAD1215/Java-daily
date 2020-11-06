package com.zyh.day18;

/**
 * @ClassName AAA
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/6
 **/
interface AAA {
    public abstract void showA();
    public static void showB() {
        System.out.println("static BBBB");
        show10("BBBB");
    }
    public static void showC() {
        System.out.println("static CCCC");
        show10("CCCC");
    }
    static void show10(String str) {
        for (int i = 0; i < 10; i++) {
            System.out.println(str+" ");
        }
        System.out.println();
    }
}
