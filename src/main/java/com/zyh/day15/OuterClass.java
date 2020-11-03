package com.zyh.day15;

/**
 * @ClassName OuterClass
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/3
 **/
public class OuterClass {
    public OuterClass() {
        System.out.println("OuterClass Init.");
    }
    protected static class InnerClass {
        public void sayHi() {
            System.out.println("Hi, InnerClass.");
        }
    }
}
class InnerClassTest {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.sayHi();
    }
}
