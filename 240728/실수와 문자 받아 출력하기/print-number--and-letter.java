import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        String c;
        double a;
        double b;

        c = sc.next();
        a = sc.nextDouble();
        b = sc.nextDouble();
        
        System.out.println(c);
        System.out.printf("%.2f\n", a);
        System.out.printf("%.2f",b);
    }
}