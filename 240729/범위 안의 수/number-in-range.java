import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // java에서는 조건 2개를 사용할 때 
        // &&, || 등을 사용하고 동시에 표현해야 함

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result;

        if (10 <= a && a <= 20) {
            result = "yes";
        } else {
            result = "no";
        }
        System.out.println(result);
    }
}