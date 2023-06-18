package com.omerkulahci.lesson2;

import javax.swing.*;

public class _7_Math {

    public static void main(String[] args) {

        // static : Math
        System.out.println(Math.min(-100,66));
        System.out.println(Math.max(-100,66));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(2,5));
        System.out.println(Math.floor(4.9));
        System.out.println(Math.ceil(4.1));
        System.out.println(Math.round(6.4));
        System.out.println(Math.round(6.5));
        System.out.println(Math.floor(Math.random()*9+1));

        // Math Random
        double random1 = Math.floor(Math.random() * 9 + 1);
        System.out.println(random1);



        // ÖDEV
        // hipotenüs
        // Kullanıcıdan alınan 2 sayı üçgenin dik kenarlarıdır hipotenüs uzunluğunu
        // bulalım
        // 1.dikkenar:3
        // 2.dikkenar:4
        // hipotenüs: 3*3+4*4 => karekökü
        // Formül x=Karekök(x1^2+x2^2)

        int kenar1 = Integer.parseInt(JOptionPane.showInputDialog("Lütfen üçgenin 1. dik kenarının uzunluğunu giriniz"));
        int kenar2 = Integer.parseInt(JOptionPane.showInputDialog("Lütfen üçgenin 2. dik kenarının uzunluğunu giriniz"));
        System.out.println("Hipotenüs="+Math.sqrt(Math.pow(kenar1,2)+Math.pow(kenar2,2)));
    }
}
