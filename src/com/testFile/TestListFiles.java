package com.testFile;

import java.io.File;

public class TestListFiles {
    public static void main(String[] args) {
        File file = new File("D:\\PostgreSQL\\10");
        File[] file_list = file.listFiles(((dir, name) -> name.endsWith(".txt")));
        for(File i :file_list){
            System.out.println(i.toString()+"\n");
        }
    }
}
