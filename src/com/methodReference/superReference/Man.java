package com.methodReference.superReference;

public class Man extends Human{
    @Override
    public void sayHello(){
        System.out.println("Hello man?");
    }

    public void greetToOthers(Greet g){
        g.greet();
    }
    public void show1(){//传统方式通过创建父类对象来调用父类方法
        greetToOthers(()->{
            Human h = new Human();
            h.sayHello();
        });
    }
    public void show2(){//使用super关键字调用父类方法
        greetToOthers(()->{
           super.sayHello();
        });
    }
    public void show3(){//使用super引用来调用父类方法
        greetToOthers(super::sayHello);
    }
    public static void main(String[] args) {
        Man m = new Man();
        m.show1();
        m.show2();
        m.show3();
    }
}
