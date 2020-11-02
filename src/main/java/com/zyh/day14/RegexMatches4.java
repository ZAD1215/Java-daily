package com.zyh.day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName RegexMatches4
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/2
 **/
public class RegexMatches4 {
    private static String REGEX = "dog";
    private static String INPUT = "The dog says meow. " + "All dogs say meow.";
    private static String REPLACE = "cat";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        //get a matcher object
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }
}
