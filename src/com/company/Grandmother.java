package com.company;

public abstract class Grandmother implements Printable {
    protected String name;
    protected String surname;
    protected int age;

    public Grandmother(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Grandmother(String name, String surname, String age) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void draw(){
        System.out.println();
    }
    public String getInfo() {
        return "Age:" + age +
                "\nname" + name +
                "\nsurname" + surname;

    }
}




