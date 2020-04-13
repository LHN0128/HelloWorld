package com.testStream;

import java.util.stream.Stream;

public class TestStreamMethod {//注意Stream有类型Stream<>来定义stream是什么类型的流
    public static void main(String[] args) {
        String[] friends = {"张三","李四","王五","赵六"};
        Stream<String> stream1 = Stream.of(friends);
//      使用foreach方法遍历流中的元素。注意consumer接口中accept方法有一个参数，用于消费这个参数
        stream1.forEach(name->System.out.print(name+" "));
        Stream<String> stream2 = Stream.of("123","234","345","10");
//        使用filter方法过滤1开头的元素
        stream2.filter((String e)->{return e.startsWith("1");});
        Stream<String> stream3 = Stream.of("1","2","3","4");
//        使用map方法将String类型的Stream映射为int类型的Stream
        Stream<Integer> stream4 = stream3.map((String i)->{return Integer.parseInt(i);});
//          使用count方法来统计流中元素个数
        System.out.println(stream4.count());//4
        Stream<Integer> stream5 = Stream.of(1,2,3,4,5,6,7,8);
//        使用count方法截取前3个元素并打印输出
        stream5.limit(3).forEach((Integer i)->{
            System.out.print(i+" ");
        });
        System.out.println();
//        使用limit获取前n个元素，返回一个新流
        Stream<Integer> stream6 = Stream.of(11,22,33,44,55).limit(2);
        stream6.forEach((Integer i )->{
            System.out.print(i+" ");
        });
        Stream<Integer> stream7 = Stream.of(111,222,333,444,555).skip(3);
        stream7.forEach((Integer i )->{
            System.out.print(i+" ");
        });
        //用于组合两个流。抛出异常。流已经使用完。（应该新建两个流）
        Stream<Integer> s = Stream.concat(stream6,stream7);
    }
}
