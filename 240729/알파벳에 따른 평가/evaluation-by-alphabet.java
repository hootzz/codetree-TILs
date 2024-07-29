import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result;
        
        if (a.equals("S")) {
            result = "Superior";
        } else if (a.equals("A")) {
            result = "Excellent";
        } else if (a.equals("B")) {
            result = "Good";
        } else if (a.equals("C")) {
            result = "Usually";
        } else if (a.equals("D")) {
            result = "Effort";
        } else {
            result = "Failure";
        } 
        System.out.println(result);
    }
}