package com.testLambda;

public class TestLambda {
    public static void main(String[] args) {

        Operation add = (a,b) -> a+b;
        Operation subtract = (a,b) -> a-b;
        System.out.println(add.operation(12,5));
        System.out.println(subtract.operation(12,5));
        new Thread(() -> System.out.println("创建第一个线程"));//Thread中的其实是Runnable接口的对象，Runnable接口中只有一个run方法
    }
}
