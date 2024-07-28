import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int t;

        a = sc.nextInt();
        b = sc.nextInt();

        t = a;
        a = b;
        b = t;

        System.out.print(a+" "+b);
    }
}