import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String result;
        
        a = sc.nextInt();

        if (a%3 == 0) {
            result = "YES";
        } else {
            result = "NO";
        }
        System.out.println(result);

        if (a%5 == 0) {
            result = "YES";
        } else {
            result = "NO";
        }
        System.out.println(result);
    }
}