import java.util.Scanner;
public class JPA05{
    public static void main(String[] args){
        System.out.print("請輸入您的姓名:");
        Scanner a = new Scanner(System.in);
        String b = a.next();
        System.out.println("Hi, "+b+",請輸入您的銅板的個數:");
        System.out.print("請輸入1元的數量:");
        Scanner e = new Scanner(System.in);
        int f = e.nextInt();
        System.out.print("請輸入5元的數量:");
        Scanner g = new Scanner(System.in);
        int h = g.nextInt();
        System.out.print("請輸入10元的數量:");
        Scanner i = new Scanner(System.in);
        int j = i.nextInt();
        System.out.print("請輸入50元的數量:");
        Scanner k = new Scanner(System.in);
        int l = k.nextInt();
        int c = f*1+h*5+j*10+l*50;
        System.out.println("您的錢總共有: "+(c/1000)%10+"千"+(c/100)%10+"百"+(c/10)%10+"十"+(c/1)%10+"元");
    }
}






