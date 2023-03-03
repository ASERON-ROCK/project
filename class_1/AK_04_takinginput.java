import java.util.Scanner;
public class AK_04_takinginput {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the pi vale");
        double pi=x.nextDouble();
        System.out.println("enter the redious");
        double r= x.nextDouble();
        double result=pi*r*r;
        System.out.println("the area of a circule"+result);

    }
}
