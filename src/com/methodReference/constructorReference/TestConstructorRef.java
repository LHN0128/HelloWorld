package com.methodReference.constructorReference;

public class TestConstructorRef {
    /**
     * 构造一个人，并设置名字
     * @param name
     * @param builder
     */
    public static void printName(String name,Builder builder){
        Person person = builder.buildPerson(name);
        System.out.println(person.getName());
    }

    /**
     * 1、使用Lambda表达式设置创建张三
     * 2、使用方法引用的构造器引用来创建李四，优化Lambda表达式
     * @param args
     */
    public static void main(String[] args) {
        printName("张三",(name)->new Person(name));
        printName("李四",Person::new);
    }
}
