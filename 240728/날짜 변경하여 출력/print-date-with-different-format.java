import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // useDelimiter에 .을 넣을 경우 escape 문자를 넣어야 함
        sc.useDelimiter("\\.");

        int y;
        int m;
        int d;

        y = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();

        System.out.print(m+"-"+d+"-"+y);        
    }
}