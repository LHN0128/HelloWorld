package com.testAnnotation;

import java.lang.reflect.Method;
/**
  * @author lhn
  * @date 2020/4/22
  * @description  自定义注解；解析注解
 */
@MyAnno(value=1,find="classAnno")
public class TestMyAnno {
    @MyAnno(value=2,find="methodAnno")
    public static void main(String[] args) throws NoSuchMethodException {


        //1.获取类自定义注解的内容
        Class<TestMyAnno> testMyAnnoClass = TestMyAnno.class;//获取该注解位置的对象（类对象）
        MyAnno classAnno = testMyAnnoClass.getAnnotation(MyAnno.class);//获取该注解对象
        String find1 = classAnno.find();//调用注解中的find方法获取赋值内容
        int value1 = classAnno.value();//调用注解中的value方法获取赋值内容
        System.out.println(value1+"   "+find1);
        System.out.println("----------------");
        //2.获取方法自定义注解的内容
        Method main = TestMyAnno.class.getMethod("main", String[].class);//获取该注解位置的对象（方法对象）
        MyAnno methodAnno = main.getAnnotation(MyAnno.class);//获取该注解对象
        String find2 = methodAnno.find();//调用注解中的find方法获取赋值内容
        int value2 = methodAnno.value();//调用注解中的value方法获取赋值内容
        System.out.println(value2+"   "+find2);

    }
}
