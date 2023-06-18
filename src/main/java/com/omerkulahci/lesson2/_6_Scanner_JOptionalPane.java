package com.omerkulahci.lesson2;

import javax.swing.*;

public class _6_Scanner_JOptionalPane {

    public static void main(String[] args) {

        // 1.soru
        // 1.dereceden 2 bilinmeyenli denklem
        // y=3x+4k;
        // x=5;
        // k=3
        // y =?  (Cevap :27)

        // SCANNER
        /*int number1=0,number2=0,result1=0;
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen 1.sayıyı giriniz");
        number1=klavye.nextInt();
        System.out.println("Lütfen 2.sayıyı giriniz");
        number2=klavye.nextInt();
        result1=3*number1+4*number2;
        System.out.println(result1);*/

        int clientData1 = Integer.parseInt(JOptionPane.showInputDialog("Lütfen 1. sayıyı giriniz"));
        int clientData2 = Integer.parseInt(JOptionPane.showInputDialog("Lütfen 2. sayıyı giriniz"));
        System.out.println(clientData1+clientData2);

        // 2.soru
        // Dereceyi Fahrenhayt
        // (derece*9/5)+32
        // 0 derece kaç fahrenhayttır? (Cevap: 32 fahrenhayttır)

        double celsius=0.0, fahrenhayt=0.0;
        fahrenhayt = (celsius*9/5)+32;
        System.out.println(celsius+" derece "+fahrenhayt+" fahrenhaytır." );


        // 3.soru iki sayıda dört işlem
        // x1=4, x2=2;
        // Toplama =?
        // Çıkarma =?
        // Çarpması ?
        // Bölüm = ?
        // Bölümünde kalan ?

        // 4.soru VKI
        // VKI: Vücut Kitle Indeki hesaplayana algoritma yazınız ?
        // boy=181 CM
        // kilo: 92 KG
        // Erkek/ Bayan için Formül: VKI=kilo/boy*boy

    }
}
