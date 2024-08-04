import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // if의 순서 
        Scanner sc = new Scanner(System.in);
        String result = "";
        int m;

        m = sc.nextInt();
        if (m>11 || m<3) {
            result = "Winter";
        } else if (m<=11) {
            if (m>8) {
                result = "Fall";
            } else if (m<=8) {
                if (m>5) {
                    result = "Summer";
                } else {
                    result = "Spring";
                }
            }
        }

        System.out.println(result);
    }
}