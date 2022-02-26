package com.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationAndDeserialization {
    public static void main(String[] args) {
        Books books = new Books("Java", 90,"Java高级程序设计");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("serial.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(books);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
