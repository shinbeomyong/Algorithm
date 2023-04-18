package JavaAlgorithm;

import java.util.Scanner;

/*
두 수의 최대 공약수를 구하는 알고리즘
일반적으로 최대 공약수를 구하는 방법은 소인수 분해를 이용한 공통된 소수들의 곱으로 표현

MOD연산으로 구현 가능
1. 큰 수를 작은 수로 나누는 MOD 연산을 수행
2. 앞 단계에서의 작은 수와 MOD 연산 결과값으로 MOD 연산을 수행
3. 2 단계를 반복하다가 나머지가 0이 되는 순간의 작은 수를 최대 공약수로 선택한다.
 */
public class 유클리드호제법 {

    public void run(){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a<b){
            gcd(b,a);
        }else{
            gcd(a,b);
        }

    }

    public void gcd(int a, int b){
        if(a%b == 0){
            System.out.println(b);
            return;
        }

        gcd(b,a%b);
    }
}
