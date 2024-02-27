import java.util.Scanner;
public class JPA03{
    public static void main(String[] args){
        System.out.println("Please input:");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        int d = a.nextInt();
        double e = ((b+c+d)/3.0);        
        System.out.printf("Average: %.2f",e);
    }
}
