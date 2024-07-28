import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nextInt는 공백 단위로 입력을 받기 때문에 두 개 받으려면 두 개 적으면 됨
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b);
    }
}