package com.testStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * 各种方式获取Stream流
 */
public class GetStream {
    public static void main(String[] args) {
        //获取stream单列集合的stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
        Map<String,String> map = new HashMap<>();
        //获取map的键的集合的stream流
        Stream<String> stream2 = map.keySet().stream();
//        获取map的值的集合的stream流
        Stream<String> stream3 = map.values().stream();
//        通过可变参数来获取stream
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        String[] arr = new String[10];
//        通过可变参数（底层数组，可以传递数组）来获取一个stream流对象
        Stream<String> arr1 = Stream.of(arr);
    }
}
