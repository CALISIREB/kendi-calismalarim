package sorular_veriables;

import java.util.Scanner;

public class c03_soru3 {

    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
        //yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen kisa kenari girin");

        int kenar1= scan.nextInt();

        System.out.println("lutfen uzun kenar girin");
        int kenar2= scan.nextInt();

        System.out.println("alan : " + kenar1*kenar2);

    }
}
