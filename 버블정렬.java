package JavaAlgorithm;

/*
버블정렬은 정렬에 시간이 오래걸리지만 구현이 간단함.
버블정렬 : 데이터의 인접 요소끼리 비교하고 swap 연산을 수행하며 정렬하는 방식 O(n^2)
 */

import java.util.Scanner;

public class 버블정렬 {

    static int[] arr;

    public void run(){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        arr = new int[N];
        boolean isswap = false;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    swap(j,j+1);
                    isswap = true;
                }
            }
            /*while(N-j > 1){   이것도 가능
                if(arr[j] > arr[j+1]){
                    swap(j, j+1);
                    isswap = true;
                }
                j++;
            }*/
            if(!isswap){
                break;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }

    public void swap(int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
