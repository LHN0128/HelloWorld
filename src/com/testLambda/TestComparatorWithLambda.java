package com.testLambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 使用Lambda表达式代替函数式接口的返回值类型
 * Comparator接口只有compare方法，因此是一个函数式接口
 */
public class TestComparatorWithLambda {
    public static void main(String[] args) {
        String[] arr = {"a","ccc","bb","dddd"};
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));


    }
    private static Comparator<String> getComparator(){
        return ((o1, o2) -> o2.length()-o1.length());
    }

}
