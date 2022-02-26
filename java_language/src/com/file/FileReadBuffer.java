package com.file;

import java.io.*;

// 缓冲区写入文件
public class FileReadBuffer {
    public static void main(String[] args) {
        try {
//            写数据
            FileOutputStream fileOutputStream = new FileOutputStream("bookWrite.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write('H');
            bufferedOutputStream.write(888);
            bufferedOutputStream.flush();
//            读数据
            FileInputStream fileInputStream = new FileInputStream("book.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] b = new byte[35];
            int a = bufferedInputStream.read(b, 0, 35);
            System.out.println("输出结果" + new String(b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
