import java.sql.SQLOutput;

public class AK_07_precedence {
    public static void main(String[] args) {
        int a= 34*3-55/5;
        /*
            =102-11
            =92
         */
        System.out.println(a);
        int b= 30/3-12*3;
        /*
            =10-36
            =-26
         */
        System.out.println(b);
    }
}
