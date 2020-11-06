package com.zyh.day18;

import java.text.DecimalFormat;

/**
 * @ClassName AA
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/6
 **/
    interface AA {
    public abstract void showA();
    public default void show10B() {
        show10("BBBB");
    }
    public default void show10C() {
        show10("CCCC");
    }

    static void show10(String str) {
        for (int i = 0; i < 10; i++) {
            System.out.print(str+" ");
        }
        System.out.println();
    }
}
