package JavaAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 스택과큐 {
    /*
     스택은 LIFO 큐는 FIFO 자료구조
     스택은 깊이우선탐색(DFS), 백트래킹 종류의 코딩 테스트에 효과적
     후입선출 개념 자체가 재귀 함수 알고리즘과 비슷

     큐는 너비 우선 탐색(BFS)에서 자주 사용

     우선순위 큐는 값이 들어간 순서와 상관 없이 우선순위가 높은 데이터가 먼저 나오느 자료구조
     큐 설정에 따라 front에 항상 최댓값 또는 최솟값이 위치.
     일반적으로 힙(heap)을 이용해 구현하는데 힙은 트리 종류 중 하나
     */

    public void run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer bf = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        int cnt = 1;
        int[] num = new int[N];
        boolean result = true;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N; i++) {

            if(cnt <= num[i]) {
                while (num[i] >= cnt) {
                    stack.push(cnt);
                    cnt++;
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }else{
                int a = stack.pop();
                if(a < cnt) {
                    System.out.println("No");
                    result = false;
                    break;
                }else{
                    bf.append("-\n");
                }
            }
        }

        if(result) System.out.println(bf.toString());
    }
}
