package com.zyh.day15;

/**
 * @ClassName Outer1
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/3
 **/
public class Outer1 {
    private String name = "OuterClass";
    public void sayHi() {
        System.out.println("Hi, Outer.");
    }
    class Inner {
        public void sayHi() {
            // 内部类访问外部类
            Outer1.this.sayHi();
            System.out.println(Outer1.this.name);
            System.out.println("Hi, Inner.");
        }
    }
}
class InnerTest1 {
    public static void main(String[] args) {
        Outer.Inner inner =  new Outer().new Inner();
        inner.sayHi();
    }
}
