import java.util.Scanner;
public class AK_02_String {
    public static void main(String[] args) {

        String name="Amartya kumar bera";
        System.out.println(name);
        int a=name.length();// to find the string length
        System.out.println("the string length is "+a);
        String upper = name.toUpperCase();// convert to string upper case
        System.out.println(upper);
        String lower=name.toLowerCase();// convert to string lower case
        System.out.println(lower);

        String spacere="    s   ";
        System.out.println(spacere.trim());// spase cut out




    }
}
