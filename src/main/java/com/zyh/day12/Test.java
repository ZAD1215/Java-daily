package com.zyh.day12;


import java.math.BigDecimal;
import java.util.function.*;

/**
 * @ClassName Test
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/31
 **/
public class Test {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 185;
        Student student = new Student("9龙", 23, 175);
        System.out.println(
                "9龙的身高高于185？：" + predicate.test(student.getStature()));
        Consumer<String>consumer=System.out::println;
        consumer.accept("命运由我不由天");

        Function<Student, String> function = student::getName;
        String name = function.apply(student);
        System.out.println(name);

        Supplier<Integer> supplier =
                () -> Integer.valueOf(BigDecimal.TEN.toString());
        System.out.println(supplier.get());

        UnaryOperator<Boolean> unaryOperator = uglily -> !uglily;
        Boolean apply2 = unaryOperator.apply(true);
        System.out.println(apply2);

        BinaryOperator<Integer> operator = (x, y) -> x * y;
        Integer integer = operator.apply(2, 3);
        System.out.println(integer);

        test(() -> "我是一个演示的函数式接口");
    }

    public static void test(Worker worker) {
        String work = worker.work();
        System.out.println(work);
    }

    public interface Worker {
        String work();
    }

}