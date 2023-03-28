package sorular_veriables;

import java.util.Scanner;

public class c01_soru1 {
    public static void main(String[] args) {
        //Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
        //yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bir double sayi girin");

        double sayi1= scan.nextByte();

        System.out.println("lutfen bir double sayi girin");
        int sayi2= scan.nextInt();

        System.out.println(sayi1+sayi2 + " - " + sayi1*sayi2);
    }
}
