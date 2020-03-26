package com.testFile;

import java.io.*;

public class TestConvertStream {
    public static void main(String[] args) throws IOException {
        //测试转换流.utf-8一个汉字3字节，GBK一个汉字2字节
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\IDEA Projects\\HelloWorldRepo\\HelloWorld\\files\\GBKencodedFile.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\IDEA Projects\\HelloWorldRepo\\HelloWorld\\files\\GBKencodedFile.txt"),"utf-8");
        int len = 0;
        while ((len = isr.read())!=-1){
            osw.write(len);
        }
        osw.flush();
        osw.close();
        isr.close();
    }
}
