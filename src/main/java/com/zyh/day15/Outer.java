package com.zyh.day15;

/**
 * @ClassName Outer
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/3
 **/
class Outer {
    public Outer() {
        System.out.println("Outer Class.");
    }
    class Inner {
        public void sayHi() {
            System.out.println("Hi, Inner.");
        }
    }
}