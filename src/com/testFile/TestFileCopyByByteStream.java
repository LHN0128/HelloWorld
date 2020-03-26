package com.testFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileCopyByByteStream {//复制文件，注意输出流文件对象不是输出的目录，而是即将复制过去的全文件名
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:\\1443143776555540.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\1443143776555540.jpg");
        byte[] bytes = new byte[1024];//创建字节数组byte，而不是包装类Byte
        int len = 0;//用于判断是否读取完，作为循环条件
        while((len=fis.read(bytes))!=-1){
           fos.write(bytes);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("文件复制时间为："+(e-s)+"毫秒");
    }
}
