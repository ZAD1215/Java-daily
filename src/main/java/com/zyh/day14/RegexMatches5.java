package com.zyh.day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName RegexMatches5
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/2
 **/
public class RegexMatches5 {
    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooab";
    private static String REPLACE = "-";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        //获取matcher对象
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());

    }
}
