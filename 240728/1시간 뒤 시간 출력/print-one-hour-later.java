import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // useDelimiter("특정 문자") : 기준으로 잘라서 입력 받겠다
        // 상황이 복잡한 경우
        // String s = sc.next(); 전체를 하나의 문자열로 입력받고
        // String[] strArr = s.split(":"); 특정 문자로 나눠서 각 값을 원소로 하는 배열 생성
        sc.useDelimiter(":");
        int a;
        int b;

        a = sc.nextInt()+1;
        b = sc.nextInt();
        
        System.out.print(a+":"+b);

    }
}