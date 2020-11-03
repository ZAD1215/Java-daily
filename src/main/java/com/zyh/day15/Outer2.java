package com.zyh.day15;

/**
 * @ClassName Outer2
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/3
 **/
public class Outer2 {
    public void sayHi() {
        System.out.println(new Inner().name);
        System.out.println("Hi, Outer.");
    }
    private class Inner {
        String name = "InnerClass";
        public void sayHi() {
            System.out.println("Hi, Inner.");
        }
    }
}
class InnerTest2 {
    public static void main(String[] args) {
        new Outer2().sayHi();
    }
}
