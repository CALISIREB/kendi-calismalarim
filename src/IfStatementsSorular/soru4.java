package IfStatementsSorular;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {

        //Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char krk=scan.next().charAt(0);

        if('A'<= krk && krk<='Z' ){

            System.out.println("giriln harf buyuk");
        } else {
            System.out.println("girilen harf kucuk");
        }

    }
}
