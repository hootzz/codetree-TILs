import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2개의 줄에 걸력서 입력할 때도 공백의 경우와 동일
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
    }
}