package com.methodReference.ArrayMethodReference;

public class TestArrayConsRef {
    public static int[] createArray(int length,ArrayBuilder ab){
        return ab.buildArray(length);
    }

    public static void main(String[] args) {
        //使用Lambda表达式创建数组
        int[] a =  createArray(10,(length)->new int[length]);
        System.out.println(a.length);
        //使用数组的构造器引用来创建数组
        int[] b = createArray(10,int[]::new);
        System.out.println(b.length);
    }
}
