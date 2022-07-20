package com.company;

public class Hourse extends Farm {
    private String color;

    public Hourse(double weight, int age, String gender, String nickNameme,String color, String ownerName, String addres) {
        super(weight, age, gender, nickNameme, ownerName, addres);

        this.color = color;
    }
}
