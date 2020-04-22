package com.testAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
  * @author lhn
  * @date 2020/4/22
  * @description 自定义注解，保留阶段一般为Runtime，目标作用于类
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    int value();
    String find();

}
