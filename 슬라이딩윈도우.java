package JavaAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 슬라이딩윈도우 {
    /*
    슬라이딩 윈도우 알고리즘은 2개의 포인터로 범위를 지정한 다음 범위를 유지한 채로 이동 하며 문제를 해결
     */

    static int checkcnt = 0;
    static int arr[] = {0,0,0,0};      // A,C,G,T
    static int myarr[] = new int[4];

    public static void run() throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int result = 0;

        char A[];

        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            myarr[i] = Integer.parseInt(st.nextToken());
            if(myarr[i] == 0) checkcnt++;
        }

        for (int i = 0; i < P; i++) {
            Add(A[i]);
        }

        if(checkcnt == P){
            result++;
        }

        for (int i = P; i < S; i++) {
            int j = i-P;
            Add(A[i]);
            remove(A[j]);

            if(checkcnt == P){
                result++;
            }
        }

        System.out.println(result);
        br.close();
    }

    private static void remove(char c) {
        switch(c){
            case 'A':
                if (arr[0] == myarr[0]){
                    checkcnt--;
                }
                arr[0]--;
                break;
            case 'C':
                if (arr[1] == myarr[1]){
                    checkcnt--;
                }
                arr[1]--;
                break;
            case 'G':
                if (arr[2] == myarr[2]){
                    checkcnt--;
                }
                arr[2]--;
                break;
            case 'T':
                if (arr[3] == myarr[3]){
                checkcnt--;
                }
                arr[3]--;
                break;
        }
    }

    private static void Add(char c){
        switch(c){
            case 'A':
                arr[0]++;
                if (arr[0] == myarr[0]){
                    checkcnt++;
                }
                break;
            case 'C':
                arr[1]++;
                if (arr[1] == myarr[1]){
                    checkcnt++;
                }
                break;
            case 'G':
                arr[2]++;
                if (arr[2] == myarr[2]){
                    checkcnt++;
                }
                break;
            case 'T':
                arr[3]++;
                if (arr[3] == myarr[3]){
                    checkcnt++;
                }
                break;
        }
    }

}
