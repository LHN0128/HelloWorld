package com.testFunctionalInterface;

import java.util.function.Supplier;

/**
 * 使用Supplier接口结合Lambda表达式来获取数组中元素的最大值
 */
public class TestSupplier {
    private static Integer getMax(Supplier<Integer> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,800,-1};
       int maxValue = getMax(()->{
           int max = arr[0];
            for (int i : arr) {
                if(i>max)
                    max = i;
            }

           return max;
        });
        System.out.println(maxValue);
    }
}
