import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        // 캐스팅은 (double), (int)등을 캐스팅 할 것 앞에 붙이면 된다
       
       a = sc.nextInt();
       b = sc.nextInt();

       System.out.printf(a+b +" %.1f", ((double)(a+b)/2));

       // (O) System.out.printf(a+b +" %.1f", (((double)a+b)/2));
       // (O) System.out.printf(a+b +" %.1f", ((a+(double)b)/2));
       // (O) System.out.printf(a+b +" %.1f", ((a+b)/(double)2));

       // (값 다름) System.out.printf(a+b +" %.1f", (double)((a+b)/2)); 
                // int로 다 계산 후 double 붙여서 소수점 뒤가 계산이 안 된 채로 나옴

       // (에러) System.out.printf(a+b +" %.1f", ((a+b)/2));
                // int를 f로 불러오려고 해서

       // 1. 캐스팅의 위치는 상관없나?
       // 2. 캐스팅을 해야 하는 이유는?
       // 3. 하나만 캐스팅 했을 때 자동으로 다 double에 계산이 되는 건가?
       // 4. 파이썬의 경우는?
    }
}