package org.example;

public abstract class Character {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
    }
    public Character(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
