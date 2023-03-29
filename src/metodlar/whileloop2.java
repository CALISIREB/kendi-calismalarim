package metodlar;

import java.util.Scanner;

public class whileloop2 {
    public static void main(String[] args) {
        sayiUssu();


    }
    public static void sayiUssu(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println("lutfen ust deger gitiniz");
        int us=scan.nextInt();

        long sonuc=1;

        while (us !=0){
           sonuc *=sayi;
           us--;

        }

        System.out.println(sonuc);


    }
}
