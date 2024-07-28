import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 문자열은 next();
        // 문자열의 n 번째 문자 조회(인덱스) charAt(n-1);
        // 줄여서 sc.next().charAt(n-1); 사용 가능
        String s = sc.next();
        System.out.print(s);
    }
}