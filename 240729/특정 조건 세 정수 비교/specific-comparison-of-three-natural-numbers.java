import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.print((a<b) == (a<c) && (a<b) == (true) ? 1 : 0 + " ");
        System.out.print(a == b && b == c ? 1 : 0);
    }
}