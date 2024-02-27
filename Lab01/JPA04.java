import java.util.Scanner;
public class JPA04 {
    public static void main(String[] args){
        System.out.print("請輸入第1組的x和y座標:");
        Scanner a = new Scanner(System.in);
        double b = a.nextDouble();
        double c = a.nextDouble();
        System.out.print("請輸入第2組的x和y座標:");
        Scanner d = new Scanner(System.in);
        double e = d.nextDouble();
        double f = d.nextDouble();
        double g = Math.pow((Math.pow((e-b),2)+Math.pow((f-c),2)),0.5);
        System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f",b,c,e,f,g);
        
    }
}
