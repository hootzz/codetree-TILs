import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String result;
        a = sc.nextInt();

        //등급 부여 제외하고 100 점만 따졌을 때
        //result = a == 100 ? "pass" : "failure";
        //System.out.println(result);

        // 점수에 따른 등급 부여 코드도 작성해 본다면?
        int x;
        x = -((a / 10) - 10);
        result = x == 0 ? "pass" : "failure";
        System.out.println(result);
    }
}