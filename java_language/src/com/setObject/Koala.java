package com.setObject;

public class Koala {
    public String name;
    public int age;
    public String species;

    public Koala(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Koala{" +
                "名字：'" + name + '\'' +
                ", 年龄：" + age +
                ", 品种：'" + species + '\'' +
                '}';
    }
}
