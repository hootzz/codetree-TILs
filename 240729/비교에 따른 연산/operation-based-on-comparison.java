import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int result;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a>b) {
            result = a*b;
        } 
        else {
            result = b/a;
        }
        System.out.println(result);
    }
}