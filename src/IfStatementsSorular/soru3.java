package IfStatementsSorular;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

        //Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");

        int yas= scan.nextInt();
        if(yas >=65){
            System.out.println("emekli olabilirisn");
        }else {
            System.out.println("emekli olmam icin :" + (65-yas) +" calisman lazim");

        }
    }
}
