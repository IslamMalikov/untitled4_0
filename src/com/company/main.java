package com.company;

public class main {
    public static void main(String[] args) {
        System.out.println(createObject("Son"));
        System.out.println(createObject("Mother"));
        System.out.println(createObject("Dad"));

    }

    public static Object createObject(String ClassName) {
        switch (ClassName) {
            case "sister":
                return new sister("Anna", "Ismailova", "14");
            case "mom":
                return new mom("Katy", "Ismailova", "40");
            case "GrandSister":
                return new GrandSister("Nady", "Ismailova", "44");
            case "Father":
                return new Father("Danil", "Nasyrov", "43");
            case "Son":
                return new Son("Ron", "Nasyrov", "15");
            case "GrandSon":
                return new GrandSon("Robin", "Nasyrov", "56");
        }
        return null;
    }
}




