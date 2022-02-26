package com.file;

import java.io.FileInputStream;
import java.io.IOException;

// 字符读取文件
public class FileReadChar {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("book.txt");
            int n = 0;
            while ((n = fileInputStream.read()) != -1){
                System.out.print((char) n);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
