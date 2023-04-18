package JavaAlgorithm;
/*
현재 상태에서 보는 선택지 중 최선의 선택지가 전체 선택지 중 최선의 선택지라고 가정하는 알고리즘

1. 해 선택 : 현재 상태에서 가장 최선이라고 생각되는 해를 선택한다.
2. 적절성 검사 : 현재 선택한 해가 전체 문제의 제약 조건에 벗어나지 않는지 검사한다.
3. 해 검사 : 현재까지 선택한 해 집합이 전체 문제를 해결할 수 있는지 검사한다. 전체 문제를 해결하지 못한다면 1로 돌아가 반복한다.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.String;

public class Greedy {
    /*
    백준 11047번 (실버4)     1 <= N <= 10 / 1 <= k <= 100,000,000  (n개의 동전의 종류 / k의 값) 다음 동전 가격 A(i+1)가 앞에 나오는 동전 가격 A(i) 의 배수여야 그리디 알고리즘이 성립
    백준 1541번
     */
    public void run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i = n-1; i >= 0; i--) {
            if(k/arr[i] > 0) {
                count += k / arr[i];
                k %= arr[i];
                if (k == 0) {
                    break;
                }
            }
        }

        System.out.println(count);
    }

    public void run2(){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String[] strarr = str.split("-");

        int answer = 0;

        for (int i = 0; i < strarr.length; i++) {

            if (i==0){
                answer = mysum(strarr[i]);
            }else {
                answer -= mysum(strarr[i]);
            }

        }
        System.out.println(answer);
    }

    public int mysum(String str){
        int result = 0;

        if(str.indexOf("+")>0){
            String[] strarr = str.split("[+]");     // + 인식이 안되기때문에 대괄호를 넣어야함

            for (int i = 0; i < strarr.length; i++) {
                result += Integer.parseInt(strarr[i]);
            }

        }else{
            result = Integer.parseInt(str);
        }

        return result;
    }
}
