package com.zyh.day18;

import javax.swing.event.MouseInputAdapter;

/**
 * @ClassName Test5
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/6
 **/
public class Test5 {
    public static void main(String[] args) {
        Star s = new Star();
        s.shine();
        System.out.println("=================");
        Universe universe = new Sun();
        universe.doAnything();
        Sun sun = (Sun) universe;
        sun.shine();

    }
}
