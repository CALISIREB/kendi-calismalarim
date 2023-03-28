package sorular_veriables.c02_2;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {

        //Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //Isminiz : John
        //Soyisminiz : Doe
        //Yasiniz : 44
        //Kaydiniz basariyla tamamlanmistir

        Scanner scan=new Scanner(System.in);
        System.out.println("isminiz");
        String isim= scan.next();


        System.out.println("Soy isminiz");
        String soyisim= scan.next();


        System.out.println("yasiniz");
        int yas= scan.nextInt();

        System.out.println("Isminiz :  "+ isim +
                "\nSoy isminiz  : " + soyisim +
                "\nYasiniz :  " + yas +
                "\n====Kaydinuz basariyla saglanmistir" );


    }
}
