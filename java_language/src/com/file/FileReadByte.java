package com.file;

import java.io.FileInputStream;
import java.io.IOException;

// 字节流读取文件
public class FileReadByte {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("book.txt");
            byte[] b = new byte[35];
            fileInputStream.read(b,0, 35);
            System.out.print(new String(b));
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
