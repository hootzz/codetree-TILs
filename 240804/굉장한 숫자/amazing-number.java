import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // () a%2==0 || (a%2 == 1 && a >=10) ) 
        //이런 식으로 묶어 줘야 됨
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if ( (a%2==1 && a%3==0) || (a%2==0 && a%5==0) ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}