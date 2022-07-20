package com.company;

public abstract class Farm {
    private double weight;
    private int age;
    private String gender;
    private String nickNameme;
    private String OwnerName;
    private String addres;


    public Farm(double weight, int age, String gender, String nickNameme, String ownerName, String addres) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickNameme = nickNameme;
        OwnerName = ownerName;
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender +
                ", nickNameme='" + nickNameme +
                ", OwnerName='" + OwnerName +
                ", addres='" + addres;
    }


}

