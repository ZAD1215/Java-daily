package com.zyh.day15;

/**
 * @ClassName InnerTest
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/3
 **/
class InnerTest {
    public static void main(String[] args) {
        Outer out = new Outer();
        // 创建成员内部类
        Outer.Inner inner = out.new Inner();
        inner.sayHi();
    }

    static class Outer {
        public Outer() {
            System.out.println("Outer Class.");
        }

        class Inner {
            public void sayHi() {
                System.out.println("Hi, Inner.");
            }
        }
    }
}
