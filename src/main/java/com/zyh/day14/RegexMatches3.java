package com.zyh.day14;

import javax.lang.model.element.NestingKind;
import java.util.PrimitiveIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName RegexMatches3
 * @Description TODO
 * @Author ZAD
 * @Date 2020/11/2
 **/
public class RegexMatches3 {
    private static final String REGEX = "foo";
    private static final String INPUT = "foooooooooooooooooo";
    private static final String INPUT2 = "oooooofoooooooo";
    private static Pattern pattern;
    private static Matcher matcher;
    private static Matcher matcher2;

    public static void main(String[] args) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);
        matcher2 = pattern.matcher(INPUT2);

        System.out.println("Current REGEX is:" + REGEX);
        System.out.println("Current INPUT is:" + INPUT);
        System.out.println("Current INPUT2 is:"+INPUT2);

        System.out.println("lookingAT()：" + matcher.lookingAt());
        System.out.println("matches():" + matcher.matches());
        System.out.println("lookingAt():" + matcher2.lookingAt());
    }
}
