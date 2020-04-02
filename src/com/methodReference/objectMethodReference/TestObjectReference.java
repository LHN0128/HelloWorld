package com.methodReference.objectMethodReference;

public class TestObjectReference {
    private static void printString(Printable p){
        p.print("Hello");
    }

    public static void main(String[] args) {

        printString((p)->{
            //创建对象
            ObjectRef or = new ObjectRef();
            or.printUpperCase(p);
        });
        //使用对象引用来优化Lambda
//        对象是存在的，成员函数也是存在的，可以使用对象引用
//        但是使用前提必须是有一个函数式接口，只是代替lambda
        ObjectRef or = new ObjectRef();
        printString(or::printUpperCase);
    }
}
