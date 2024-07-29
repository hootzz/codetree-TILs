import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        a = sc.nextInt()+87;
        b = sc.nextInt()%10;

        System.out.println(a);
        System.out.println(b);
    }
}