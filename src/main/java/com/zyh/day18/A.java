package com.zyh.day18;

/**
 * @ClassName A
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/6
 **/
interface A {
    public abstract void showA();
    public default void showB() {
        System.out.println("BBBB");
    }
}
