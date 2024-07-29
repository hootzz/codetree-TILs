import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int result;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        result = a;
        if (b < a) {
            result = b;
        }
        if (c < result) {
            result = c;
        }

        System.out.println(result);
        
    }
}