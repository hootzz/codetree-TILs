import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result;

        if (a == 1) {
            result = "John";
        } else if (a==2) {
            result = "Tom";
        } else if (a==3) {
            result = "Paul";
        } else {
            result = "Vacancy";
        }
        
        System.out.println(result);
    }
}