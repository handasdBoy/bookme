/* 
import java.util.Scanner;
public class aaa{
    public static void main(String[] args){
        System.out.println("Please input:");
        Scanner a = new Scanner(System.in);
        double b = a.nextDouble();
        double c = (b*2.20462);
        System.out.println(b+" kg = "+c+" ponds");
    }
}
*/

import java.util.Scanner;
public class aaa{
    public static void main(String[] args){
        System.out.println("Please input:");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        int d = a.nextInt();
        double e = ((b+c+d)/3.0);
        System.out.println("Average: "+e);
    }
}