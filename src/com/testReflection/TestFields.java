package com.testReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/**
  * @author lhn
  * @date 2020/4/16
  * @description 反射测试
 */
public class TestFields {
    private String field1;
    String field2;
    protected String field3;
    public int field4;

    public TestFields(String field1, String field2, String field3, int field4) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
    }

    public TestFields() {
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public int getField4() {
        return field4;
    }

    public void setField4(int field4) {
        this.field4 = field4;
    }

    @Override
    public String toString() {
        return "TestFields{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                ", field4=" + field4 +
                '}';
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException {
        //获取class对象的三种方法
        Class<TestFields> testFieldsClass1 = TestFields.class;
        Class<?> testFieldsClass2 = Class.forName("com.testReflection.TestFields");
        Class<? extends TestFields> testFieldsClass3 = new TestFields().getClass();
        //判断是同一个class对象
        System.out.println(testFieldsClass1==testFieldsClass2);//true
        System.out.println(testFieldsClass1==testFieldsClass3);//true
        //获取成员变量
        Field field4 = testFieldsClass1.getField("field4");
        Field[] fields = testFieldsClass1.getFields();//只能获取到public的成员变量
        for (Field field : fields) {//public int com.testReflection.TestFields.field4
            System.out.println(field);
        }
        Field[] declaredFields = testFieldsClass1.getDeclaredFields();
        for (Field declaredField : declaredFields) {//所有声明过的成员变量
            System.out.println(declaredField);
        }
        Constructor<?>[] declaredConstructors = testFieldsClass1.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {//获取所有声明过的构造器
            System.out.println(declaredConstructor);
        }
        //获取指定参数构造器,参数是类.class的可变参数
        Constructor<TestFields> constructor = testFieldsClass1.getConstructor(String.class, String.class, String.class, int.class);
        System.out.println(constructor);
        //获取指定成员方法,参数是类.class的可变参数
        Method setField1 = testFieldsClass1.getMethod("setField1", String.class);
        System.out.println(setField1);
        Method[] methods = testFieldsClass1.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        //暴力反射，修改对象的私有成员变量
        TestFields testFields = new TestFields();
        System.out.println(testFields);
        Field field1 = testFieldsClass1.getDeclaredField("field1");
        field1.setAccessible(true);
        field1.set(testFields,"123");
        System.out.println(testFields);
    }
}
