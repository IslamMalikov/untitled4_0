package com.company;

public abstract class GrandFather implements Printable {
    protected String name;
    protected String surname;
    protected String age;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public GrandFather(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public void draw() {
        System.out.println();
    }

    public String getInfo() {
        return "Age:" + age +
                "\nname" + name +
                "\nsurname" + surname;

    }

}





