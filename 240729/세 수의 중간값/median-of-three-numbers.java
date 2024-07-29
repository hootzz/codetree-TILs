import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;
        int result;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (b > a && b < c) {
            result = 1;
        } else {
            result = 0;
        }
        
        System.out.println(result);
    }
}