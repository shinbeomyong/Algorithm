package JavaAlgorithm;

import java.util.Scanner;

/*
선택정렬 : 대상에서 가장 크거나 작은 데이터를찾아가 선택을 반복하면서 정렬하는 방식
구현 방법이 복잡하고 시간 복잡도도 O(n^2) 코딩 테스트에서 많이 사용하지 않음;;
최솟값 또는 최댓값을 찾고, 남은 정렬 부분의 가장 앞에 있는 데이터와 swap 하는 것이 선택정렬의 핵심.
 */
public class 선택정렬 {
    public void run(){
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        char[] c = num.toCharArray();

        int[] A = new int[c.length];

        for (int i = 0; i < c.length; i++) {
            A[i] = Integer.parseInt(String.valueOf(c[i]));
        }

        for (int i = 0; i < A.length; i++) {
            int s = i;

            for (int j = i+1; j < A.length; j++) {
                if(A[j] > A[s]){
                    s = j;
                }
            }

            if(A[i] < A[s]) {
                int temp = A[i];
                A[i] = A[s];
                A[s] = temp;
            }
        }

        //Arrays.sort(A, Comparator);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }

    }
}
