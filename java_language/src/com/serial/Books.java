package com.serial;

import java.io.Serializable;

public class Books implements Serializable {
    String name;
    int count;
    String description;

    public Books(String name, int count, String description) {
        this.name = name;
        this.count = count;
        this.description = description;
    }
}
