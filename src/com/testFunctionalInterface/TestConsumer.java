package com.testFunctionalInterface;

import java.util.function.Consumer;

public class TestConsumer {
    /**
     * 将指定字符串数组中的元素处理，处理为姓名：xxx，年龄：xx。
     * 使用Consumer接口消费字符串。
     * 使用Consumer接口中的andThen方法指定两个Consumer的消费顺序
     */

    private static void reformat(String[] arr, Consumer<String> con1, Consumer<String> con2){
        for (String message: arr)//注意Consumer指定了String，则accept的类型也只能是String，因此参数传入的是数组中每一个元素
        con1.andThen(con2).accept(message);
    }

    public static void main(String[] args) {
        String[] arr = {"lhn,23","zx,24"};
            reformat(arr,
                    (name)->System.out.print("姓名："+name.split(",")[0]+"，")
                ,
                    (age)->System.out.println("年龄："+age.split(",")[1]+"。")
                    );
        }

}
