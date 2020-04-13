package com.methodReference.thisReference;

/**
 * 通过this引用本类的成员方法
 *
 */
public class Husband {
    public void buyHouse(){
        System.out.println("北京买房");
    }
    public void marry(Richable rich){
        rich.buy();
    }
    public void soHappy1(){//使用Lambda表达式
       marry(()->{
           this.buyHouse();
       });
    }
    public void soHappy2(){//使用方法引用
        //this已经存在，本类的方法buyHouse也存在
        //直接使用方法引用代替Lambda表达式
        marry(this::soHappy2);
    }
    public static void main(String[] args) {
        Husband husband = new Husband();
        husband.soHappy1();
        husband.soHappy2();
    }
}
