import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 비교 연산자는 true, false 값을 반환함
        // java는 if 조건문 안에 false나 true 값을 반환하는 조건을 넣어야 함

        int a;
        int b;
        int result;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a>=b) {
            result = 1;
        } else {
            result = 0;
        }
        System.out.println(result);

        if (a >b) {
            result = 1;
        } else {
            result = 0;
        }
        System.out.println(result);

        if (b >= a){
            result = 1;
        } else {
            result = 0;
        } 
        System.out.println(result);

        if (b > a) {
            result = 1;
        } else {
            result = 0;
        }
        System.out.println(result);

        if (a == b) {
            result = 1;
        } else {
            result = 0;
        } 
        System.out.println(result);

        if (a != b) {
            result = 1;
        } else {
            result = 0;
        }
        System.out.println(result);
    
    }
}