import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");

        int a;
        int x;
        int y;

        a = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.printf("010-%d-%d", y, x);
    }
}