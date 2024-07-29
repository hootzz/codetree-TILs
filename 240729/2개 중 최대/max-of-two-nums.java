import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int result;
        // 삼항 연산자
        // 조건 ? (참)v1 : (거짓)v2;

        a = sc.nextInt();
        b = sc.nextInt();

        result = a > b ? a : b;
        System.out.print(result);
    }
}