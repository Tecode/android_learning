package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        File file = new File("book.txt");
        String fileName = file.getName();
        System.out.println(fileName);
        boolean canRead = file.canRead();
        if (!file.exists()) {
            System.out.println("文件不存在");
            final boolean newFile = file.createNewFile();
            if (newFile) {
                System.out.println("文件创建成功");
            }
        }
        if (canRead) {
            try {
                FileReader fileReader = new FileReader("book.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String value;
                while ((value = bufferedReader.readLine()) != null) {
                    System.out.println(value);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
