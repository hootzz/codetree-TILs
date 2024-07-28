import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-"); // - 기준으로 잘라서 입력 받겠다
        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt();

        System.out.print(y+"."+m+"."+d);
    }
}