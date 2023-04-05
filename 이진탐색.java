package JavaAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
데이터가 정렬되어 있는 상태에서 원하는 값을 찾아내는 알고리즘
대상 데이터의 중앙값과 찾고자 하는 값을 비교해 데이터의 크기를 절반씩 줄이면서 대상을 찾습니다.
시간 복잡도 O(logN)
 */
public class 이진탐색 {

    static int[] A;

    public void run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        A = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A); // nlogn 의 시간 복잡도

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());

            int s = 0;
            int e = A.length-1;

            boolean isfind = false;

            while(s<=e){
                if(A[(s+e)/2] > target){
                    e = ((s+e)/2 )- 1;
                } else if (A[(s+e)/2] < target) {
                    s = ((s+e)/2) + 1;
                } else {
                    isfind = true;
                    break;
                }
            }

            if(isfind){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }

    }
}
