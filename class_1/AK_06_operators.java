import java.util.Scanner;
public class AK_06_operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a>0 && a<10) // if any condition is false then its return false
        {
            System.out.println(a+" is greater 0 and "+a+"is less then 10");
        }
        else
        {
            System.out.println("false");
        }
        if(b>7 || b>10) // if any condition is true then its return true
        {
            System.out.println(b+" is greater then 7 and "+b+"is less then 10");
        }
        else
        {
            System.out.println("false");
        }

        }
    }

