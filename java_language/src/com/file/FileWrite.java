package com.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("bookWrite.txt");
            fileOutputStream.write('H');
            fileOutputStream.write(50);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
