package com.testFile;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 在in.txt中读取乱序文本，在out.txt中输出正序文本
 6.岑夫子，丹丘生，将进酒，杯莫停。
 9.古来圣贤皆寂寞，惟有饮者留其名。
 1.君不见，黄河之水天上来，奔流到海不复回。
 5.烹羊宰牛且为乐，会须一饮三百杯。
 3.人生得意须尽欢，莫使金樽空对月。
 8.钟鼓馔玉不足贵，但愿长醉不复醒。
 2.君不见，高堂明镜悲白发，朝如青丝暮成雪。
 7.与君歌一曲，请君为我倾耳听。
 4.天生我材必有用，千金散尽还复来。
 */
//使用HashMap排序为正向，但是使用Properties排序为逆向！
public class TextSortExample {
    public static void main(String[] args) throws IOException {
//        Properties prop = new Properties();
//        BufferedReader br = new BufferedReader(new FileReader("HelloWorld/files/in.txt"));
//        BufferedWriter bw = new BufferedWriter(new FileWriter("HelloWorld/files/out.txt"));
//        String line = "";
//        while((line = br.readLine())!=null){
//            String[] arr = line.split("\\.");
//            prop.setProperty(arr[0],arr[1]);
//        }
//        for (String s:prop.stringPropertyNames()){
//             bw.write(s+"."+prop.getProperty(s));
//             bw.newLine();
//        }
//        bw.flush();
//        bw.close();
//        br.close();
        Map<String,String> prop = new HashMap<String,String>();
        BufferedReader br = new BufferedReader(new FileReader("E:\\IDEA Projects\\HelloWorldRepo\\HelloWorld\\files\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\IDEA Projects\\HelloWorldRepo\\HelloWorld\\files\\out.txt"));
        String line = "";
        while((line = br.readLine())!=null){
            String[] arr = line.split("\\.");
            prop.put(arr[0],arr[1]);
        }
        for (String s:prop.keySet()){
            bw.write(s+"."+prop.get(s));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
