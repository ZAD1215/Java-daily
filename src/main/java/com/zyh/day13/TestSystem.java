package com.zyh.day13;

import javax.sql.rowset.FilteredRowSet;
import javax.xml.bind.SchemaOutputResolver;


/**
 * @ClassName TestSystem
 * @Description: System类测试
 * @Author ZAD
 * @Date 2020/11/1
 **/
public class TestSystem {
    private static final int Max = 10000;

    public static void main(String[] args) {
        //获取当前时间毫秒值
        System.out.println(System.currentTimeMillis());
        //验证for循环打印数字1-9999所需要使用的时间（毫秒）
        long start = System.currentTimeMillis();
        for (int i = 0; i < Max; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时毫秒：" + (end - start));
    }
}
