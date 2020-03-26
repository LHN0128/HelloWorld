package com.testFile;
/**
 * 读取文件中的内容并输出到另一个文件
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReaderAndWriter {
    public static void main(String[] args) {
        FileReader fr = null;//必须赋值，对象在创建时可以不赋值，但是使用时必须有值。后面有使用
        FileWriter fw = null;
        try {
            fr = new FileReader("E:\\IDEA Projects\\HelloWorldRepo\\HelloWorld\\files\\f.txt");
            fw = new FileWriter("E:\\IDEA Projects\\HelloWorldRepo\\HelloWorld\\files\\e.txt",true);//续写开关
            //读取并输出单个字符
//            int len = 0;
//            while((len=fr.read())!=-1){
//                fw.write(len);
//            }
            char[] ch = new char[1024];//用于定义每次读取的字符个数，存入这个数组。
            // 和字节流不同的是，字节定义的byte数组是用来定义每次读取的字节数
            int len = 0;//读取的有效字符个数
            while((len=fr.read(ch))!=-1){
                fw.write(ch);
//                fw.write(new String(ch));//或拼接成String输出
            }
            fw.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fw!=null)
                    fw.close();
                if(fr!=null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
