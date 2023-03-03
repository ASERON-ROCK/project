import java.util.Scanner;
public class AK_03_userinput
{
    public static void main(String[] args)
    {
        System.out.println(" taking user from user");
        Scanner a= new Scanner(System.in);
        int s= a.nextInt();
        System.out.println(s);
        System.out.println("Enter first value");
        int num1= a.nextInt();
        System.out.println("Enter second value");
        int num2= a.nextInt();
        int sum= num1+num2;
        System.out.println(sum);
    }

}

