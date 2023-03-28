package IfStatementsSorular;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {

        //Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scan=new Scanner(System.in);
        System.out.println("harf giriniz");

        char krk=scan.next().charAt(0);

        if(krk=='o' || krk=='O' ){
            System.out.println("ocak");


    }
}
}

