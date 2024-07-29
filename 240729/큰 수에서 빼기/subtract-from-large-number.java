import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a;
       int b;
       int temp;

       a = sc.nextInt();
       b = sc.nextInt();

       if (a > b) {
        temp = a - b;
       } 
       else {
        temp = b - a;
       }
        System.out.println(temp);
    }
}