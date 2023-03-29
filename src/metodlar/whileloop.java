package metodlar;

public class whileloop {

    public static void main(String[] args) {
        System.out.println(ters("erdal"));


    }

    public static String ters(String yazi){

        String ters="";
        int i=yazi.length()-1;

        while(i>=0){
            ters+=yazi.charAt(i);
            i--;
        }
        return ters;


      }



}
