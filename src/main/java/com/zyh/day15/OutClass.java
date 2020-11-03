package com.zyh.day15;

/**
 * @ClassName OutClass
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/3
 **/
public class OutClass {
    public void sayHi() {
        class InnerClass {
            InnerClass(String name) {
                System.out.println("InnerClass:" + name);
            }
        }
        System.out.println(new InnerClass("Three"));
        System.out.println("Hi, OutClass");
    }
}
class OutTest {
    public static void main(String[] args) {
        new OutClass().sayHi();
    }
}
