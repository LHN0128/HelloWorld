package com.testFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * 使用predicate接口来过滤字符串数组中的元素
 * 要求：1、名字是4个字
 *      2、必须是女生
 * String[] arr = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男","赵丽颖,女"};
 */
public class TestPredicate {
    private static ArrayList<String> filter(String[] arr, Predicate<String> pre1,Predicate<String> pre2){
        ArrayList<String> list = new ArrayList<>();
        for (String s:arr){
            if(pre1.and(pre2).test(s))
                list.add(s);
        }
        return list;
    }

    public static void main(String[] args) {
        //注意，判断条件只有在调用时给出
        String[] arr = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男","赵丽颖,女"};
        ArrayList<String> list = filter(arr,
                (String s)->s.split(",")[0].length()==4
        ,
                (String s)->s.split(",")[1].equals("女")
        );
        for (String s : list) {
            System.out.println(s);
        }
    }
}
