package com.LogOptimizeExample;

/**
 * 如果条件不满足，字符串不会拼接。只有满足条件时，才会调用接口中的方法，即lambda中的字符串拼接。
 * 这就是Lambda表达式的延迟加载特性。不满足条件不会调用接口方法。也没有创建接口对象
 */
public class TestLogOptimization {
    public static void showLog(int level,MessageBuilder mb){
        if(1==level){
            System.out.println(mb.buildMessage());
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1="hello";
        String msg2="World";
//        调用showLog方法
        showLog(1,()->msg1+msg2);
        new Thread(()-> System.out.println("创建线程")).start();
    }
}
