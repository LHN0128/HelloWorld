package com.testFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class TestProperties {
    public static void main(String[] args) throws IOException {
//        匿名对象的流自己关闭
//        Properties集合就是用来方便读写一些字符串键值对到文件中，相当于一个字符串Map
        Properties prop = new Properties();
        prop.setProperty("柳浩楠","23");
        prop.setProperty("zx","24");
        //存储集合中的键值对元素到文件中
        prop.store(new FileWriter("E:\\IDEA Projects\\HelloWorldRepo\\HelloWorld\\files\\test.properties"),"");
        //读取文件中的键值对到集合中
        prop.load(new FileReader("E:\\IDEA Projects\\HelloWorldRepo\\HelloWorld\\files\\test.properties"));
        Set<String> keyset = prop.stringPropertyNames();//相当于Map中的keySet方法，获取所有的key
        for(String i:keyset){//遍历集合
            System.out.println(prop.getProperty(i));
        }
    }
}
