package com.methodReference.staticMethodReference;

public class TestStaticMethodRef {
    private static int printAbs(int num,Calculate cal){
        return cal.calcAbs(num);
    }
//使用类名引用静态方法来优化Lambda表达式

    public static void main(String[] args) {
       int number =  printAbs(-10,(i)->
            Math.abs(i)
        );
       int number2 = printAbs(-10,Math::abs);
        System.out.println(number);
        System.out.println(number2);
    }
}
