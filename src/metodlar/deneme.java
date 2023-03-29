package metodlar;

public class deneme {
    public static void main(String[] args) {

        carpim(5f,5);


    }

    public static int carpim(int a){return (a*a);}
    public static int carpim(int a,int b){return (a*b);}

    public static double carpim(double a,double b){ return (a*b);}

    public static void carpim(double a, int b){
        System.out.println(a*b);
    }
}
