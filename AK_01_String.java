import java.util.Scanner;
public class AK_01_String {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String name= obj.next();// next () take only single word
         System.out.println(name);
        String ful_name=obj.nextLine();
        System.out.println(ful_name);
//        String a= new String("hellow");
//        System.out.println(a);
//
//        String b= "hellow";System.out.println(b);
//        // different way to print statement
//        int a1=20 ;
//        float b1=2;
//       System.out.println(b1);// this will be make new line
//       System.out.print(a1);// not make new line
//          System.out.printf("   %d",a1);
//        System.out.format("%d,%f",a1,b1);

    }
}
