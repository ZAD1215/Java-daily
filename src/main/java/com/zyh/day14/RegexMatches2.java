package com.zyh.day14;

import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName RegexMatches2
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/2
 **/
public class RegexMatches2 {
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        int count = 0;

        while (m.find()) {
            count++;
            System.out.println("Match number " + count);
            System.out.println("start():" + m.start());
            System.out.println("end():" + m.end());
        }
    }
}
