package JavaAlgorithm;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class 주몽의명령  {
    public void run() throws  IOException  {
        int N;
        int M;
        int s;
        int e;
        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 오름차순으로 정렬을 하고 나서 제일 작은 수와 제일 큰 수를 먼저 더해 판별 진행한다.. 정렬하는게 포인트였다...!

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        s = 0;
        e = N-1;

        while(s<e){
            if(arr[s]+arr[e] == M){
                cnt++;
                s++;
                e--;
            } else if(arr[s]+arr[e] < M) {
                s++;
            } else if(arr[s]+arr[e] > M) {
                e--;
            }
        }

        System.out.println(cnt);
    }
}
