
public class JPA06{
    public static void main(String[] args){
        double a = -3.2;
        double head = 3*(Math.pow(a,3))+2*a-1;
        double b = -2.1;
        double ear = 3*(Math.pow(b,3))+2*b-1;
        double c = 0.0;
        double eye = 3*(Math.pow(c,3))+2*c-1;
        double d = 2.1;
        double hand = 3*(Math.pow(d,3))+2*d-1;
        System.out.println(String.format("f(%.1f) = %.4f",a,head));
        System.out.println(String.format("f(%.1f) = %.4f",b,ear));
        System.out.println(String.format("f(%.1f) = %.4f",c,eye));
        System.out.println(String.format("f(%.1f) = %.4f",d,hand));
    }
}






