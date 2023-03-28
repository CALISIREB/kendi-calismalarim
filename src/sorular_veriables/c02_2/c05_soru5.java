package sorular_veriables.c02_2;

import java.util.Locale;
import java.util.Scanner;

public class c05_soru5 {
    public static void main(String[] args) {



    //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
    //girilen bilgiler : J Doe, 44

    Scanner scan=new Scanner(System.in);
        System.out.println(" isminiz");

    String isim= scan.next();

     System.out.println("Soy isminiz");
    String soyisim= scan.next();


    System.out.println("yasiniz");
    int yas= scan.nextInt();

        System.out.println("girilen bilgiler : " +isim.toUpperCase(Locale.ROOT).charAt(0) + " "
                + soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase()  + ", " +yas);

    }
}
