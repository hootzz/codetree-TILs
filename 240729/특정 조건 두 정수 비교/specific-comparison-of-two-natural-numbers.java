import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int a;
       int b;
       int result;

       a = sc.nextInt();
       b = sc.nextInt();

       if (a < b) {
        result = 1;
       } else {
        result = 0;
       }
       System.out.print(result+" ");

       if (a == b) {
        result = 1;
       } else {
        result = 0;
       }
       System.out.print(result);
    }
}