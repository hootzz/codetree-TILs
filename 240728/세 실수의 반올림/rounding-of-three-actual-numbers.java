import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;

        //1. float로 출력하는데 double로 정의해야 되나?
        //2. double로 정의하고 double로 출력하면 안 되는 이유는?
        //3. nextFloat도 있나?
        //-- double과 float의 차이를 다시 정확히 정리
        // %.3f = 셋째 자리까지 출력 (어디에서 반올림이 되는 거지?)

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        System.out.printf("%.3f\n%.3f\n%.3f", a ,b, c);
    }   
}