package sorular_veriables;

import java.util.Scanner;

public class c07_soru7 {

    public static void main(String[] args) {
        // Kullanicidan iki sayi alip ikisinin degerlerini degistirin
        //sayi1=sayi1+sayi2;
        //        sayi2=sayi1-sayi2; // sayi2 sayi1'in ilk girilen değerini aldı.
        //        sayi1=sayi1-sayi2;
        //        System.out.println("Sayı-1: "+sayi1+"\nSayı-2: "+sayi2);

        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("sayi1 : "+sayi1  +
                "\nsayi2  :"+ sayi2);
    }
}
