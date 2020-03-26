package com.testThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        es.submit(()-> {while(true){
            System.out.println("Thread1");
            Thread.sleep(10);//让他们交互
        }});
        es.submit(()->{while(true){
            System.out.println("Thread2");
            Thread.sleep(10);//让线程睡眠，可以让线程交替执行
        }});
        while(true){
            System.out.println("mainThread");
            Thread.sleep(10);
        }
    }
}
