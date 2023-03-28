package sorular_veriables.c06_6;

import java.util.Scanner;

public class soru {
    public static void main(String[] args) {

        //Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("yari cap giriniz");

        double yaricap= scan.nextDouble();

        System.out.println("cemberin cevresi :" + 2*3.14* yaricap);
        System.out.println("cemberin alani :"+yaricap*yaricap*3.14);
    }
}
