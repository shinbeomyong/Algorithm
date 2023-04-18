package JavaAlgorithm;

import java.util.Scanner;

/*
소수란 1과 자기자신 외의 약수가 없는 수
에라토스테네스의 체의 원리 이해하기
소수를 구하려는 범위까지 배열을 생성하고 2부터 시작
2부터 시작하여 첫 번째수를 제외하고 배수를 모두 삭제 (4,6,8,10...)
다음은 3 (6,9,15 ...)
위에서 4는 삭제되었고 5부터 시작(10,25...)

모두 완료한 후에 삭제되지 않은 모든 수를 출력

에라토스테네스의 체를 사용하는 시간 복잡도는 O(Nlog(logN)) 배수를 삭제하는 연산으로 실제 구현에서 바깥쪽 for 문을 생략하는 경우가 발생하기 때문

 */
public class 소수 {

    /* 백준 1929 */
    public void run(){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n+1];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(arr[i] == 0){
                continue;
            }
            for (int j = i+i; j <= n; j = j+i) {
                arr[j] = 0;
            }
        }

        for (int i = m; i <= n; i++) {
            if(arr[i] != 0){
                System.out.println(arr[i]);
            }
        }
    }
}
