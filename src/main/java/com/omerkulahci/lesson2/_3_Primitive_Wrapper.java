package com.omerkulahci.lesson2;

public class _3_Primitive_Wrapper {

    public static void main(String[] args) {
        // Primitive Type (ilkel Tipler)
        // stack hafızayı kullanır
        // null alamaz

        // tam sayı
        byte b1 = 127;
        short s1 = 130;
        int i1 = 454545454;
        long l1 = 4545454545454545454L;

        // virgüllü sayı
        float f2 = 14.53F;
        double d2 = 1515151515.51515151;

        //boolean
        boolean b3 = true;

        // karakter
        char c4 = '\u4124';
        System.out.println(c4);

        //////////////////////////////////////////


        // Wrapper Type (Gelişmiş Tipler)
        // heap hafızayı kullanır.
        // null alabilir

        // tam sayı
        Byte w_b1 = 127;
        Short w_s1 = 130;
        Integer w_i1 = 4151515;
        Long w_l1 = 4545454545111111111L;

        // virgüllü sayı
        Float w_f2 = 14.53F;
        Double w_d2 = 1515151515.151515151;

        //boolean
        Boolean wb3 = 3>1;

        //karakter
        Character w_c4 = '\u4121';
        System.out.println(c4);

        /////////////////////////////////

        int sayi2 = 14;
        Integer sayi3 = sayi2; //boxing
        sayi3 = null;
        

    }
}
