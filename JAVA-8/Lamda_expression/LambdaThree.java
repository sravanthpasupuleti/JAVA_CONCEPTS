package Lamda_expression;

import java.util.function.Function;

public class LambdaThree {
    public static void main(String[] args) {
        Function<Integer, Integer> obj1 = (a) -> a * a;
        System.out.println(obj1.apply(7));
    }
}