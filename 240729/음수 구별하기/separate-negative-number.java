import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // if (조건) <- 조건이 참일 경우에만 수행
        
        int a;
        a = sc.nextInt();

        System.out.println(a);

        if(a < 0) {
            System.out.println("minus");
        }
    }
}