import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String result;

        a = sc.nextInt();
        result = a == 1 ? "t" : "f";
        
        System.out.println(result);
    }
}