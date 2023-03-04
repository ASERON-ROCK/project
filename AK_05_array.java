import java.util.Scanner;
public class AK_05_array {
    public static void main(String[] args)
    {
        // 1) array declaration and memory allocation
        Scanner obj=new Scanner(System.in);
        int [] a1=new int[4];
//        a1[0]=100;
//        a1[1]=29;
//        a1[3]=45;
        for(int i=0;i<4;i++)
        {
            a1[i]=obj.nextInt();
        }
        System.out.println("display with for loop ");
       for (int j=0;j<4;j++)
        {
            System.out.println(a1[j]);
        }
        System.out.println("display with for each loop ");
       for (int val: a1)
       {
           System.out.println(val);
       }

//        // 2) array declaration
//        int [] a2;
//        a2=new int[3];// memory allocation
//        a2[0]=20; // initialization
//        a2[1]=30; // initialization
//        // 3) array declaration + memory allocation + initialization
//        int [] a3 ={12,34,56,768};
//        System.out.println(a3.length);// find array length
//
//        // array display
////        for (int i=0;i<a3.length;i++)
////        {
////            System.out.println(a3[i]);
////        }
//        for (int value: a3)
//        {
//            System.out.println(value);
//        }

    }

}
