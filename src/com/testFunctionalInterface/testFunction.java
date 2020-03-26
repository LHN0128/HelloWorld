package com.testFunctionalInterface;

import java.util.function.Function;

/**
 * 使用Function接口的apply方法和andThen方法（将一个类型的数据转换为另一个类型的数据）
 * 对于一个字符串："赵丽颖,20"
 * 要求：取出20，变为整数，+100
 */
public class testFunction {//使用三个Function接口，转换前后类型可以相同。
    private static Integer change(String str, Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3){
        return fun1.andThen(fun2).andThen(fun3).apply(str);
    }

    public static void main(String[] args) {
        String s = "赵丽颖,20";
        Integer age = change(s,(String str)->
            str.split(",")[1]
        ,(String str2)->Integer.parseInt(str2),
                (Integer i)->i+100);
        System.out.println(age);
    }
}
