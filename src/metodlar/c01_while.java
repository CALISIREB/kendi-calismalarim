package metodlar;

import java.util.Scanner;

public class c01_while {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bir tam sayi giriniz");

        int sayi= scan.nextInt();

       int toplam=0;
       int tamBolenler=1;

       while (tamBolenler<=sayi){

           if(sayi %tamBolenler==0){

               System.out.println(sayi + " sayisi "+ tamBolenler);

               toplam+=tamBolenler;

           }
           tamBolenler++;
       }
        System.out.println(toplam);



    }
}
