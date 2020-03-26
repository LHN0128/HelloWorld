package com.testFile;


import com.test1.Cat;

import java.io.*;

public class TestSerializableStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat("Tom",6);
//        创建序列化流写入对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\IDEA Projects\\HelloWorldRepo\\HelloWorld\\files\\cat.txt"));
        oos.writeObject(cat);
//        创建反序列化流读取对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\IDEA Projects\\HelloWorldRepo\\HelloWorld\\files\\cat.txt"));
        Object o = ois.readObject();
        Cat c = (Cat) o;
        System.out.println(c.getName()+"的年龄是"+c.getAge()+"岁");


    }
}
