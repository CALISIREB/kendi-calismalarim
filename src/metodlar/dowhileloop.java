package metodlar;

import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen pozitif  tam sayi girniz");
        int sayi=scan.nextInt();
        int toplam=0;
        int i=0;

        do {
            if(i%2==0){
                toplam+=i;

            }
            i++;

        }while (i<=sayi);
        System.out.println(sayi + " " + toplam);
    }
}
