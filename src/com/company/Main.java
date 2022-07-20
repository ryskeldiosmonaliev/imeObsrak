package com.company;

public class Main {
    public static void main(String[] args) {
        Farm [] farms ={new Sheep(19.5,6,"erkek","Polly","Biil","texas st1 "),
                new Sheep(23.3,5,"urgaachy","kashka","Biil","texas st1 "),
                new Sheep(24.3,3,"urgachu","mooly","Biil","texas st1 "),
        new Cow(80,4,"Уй","Dolly","Biil","texas st1 "),
        new Cow(87,6,"Уй","Anabel","Biil","texas st1 "),
        new Cow(90,7,"Бука","Buch","Biil","texas st1 "),
        new Cow(78,5,"Уй","Doolisia","Biil","texas st1 "),
        new Cow(76.5,6,"Уй","Elizabet","Biil","texas st1 "),
                new Hourse(90,5,"Бээ","Gulsarat","grow","Biil","texas st1 "),
                new Hourse(90,6,"Бээ","Кашкабээ","black","Biil","texas st1 ")
       };
        Farm [] farms1 = {new Sheep(23.3,5,"urgaachy","Nendi","Teddi","texas str 34"),
                new Cow(76.5,6,"Уй","Kendi","Teddi","texas str 34"),
                new Hourse(90,5,"Aйгыр","Торуайгыр","grow","Teddi","texas str 34"),
        };
        for (Farm s:farms) {
            System.out.println(s+" ");
        }
        for (Farm sc:farms1) {
            System.out.println(sc+ " ");
        }
    }
}