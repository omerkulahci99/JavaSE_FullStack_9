package com.omerkulahci.lesson2;

public class _4_Escape_System_Cast {

    public static void main(String[] args) {
        // _4_Escape_System_Cast

        // escape
        System.out.println("\"");

        // System
        //System.out // Çıktı almak
        //System.in // Veri almak
        //System.err.println("hata");
        //System.exit(0); //logout
        //System.gc(); //garbarage collection
        //String str=null;

        // CAST
        String str1 = "14";
        int intr1 = Integer.valueOf(str1);
        int intr2 = Integer.parseInt(str1);

        System.out.println(intr1+26);
        System.out.println(intr2+26);
        System.out.println(str1+26);

    }
}
