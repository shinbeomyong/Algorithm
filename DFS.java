package JavaAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

/*
DFS는 완전 탐색 기법 중 하나
그래프의 시작 노드에서 출발하여 탐색할 한 쪽 분기를 정하여 최대 깊이까지 탐색을 마친 후 다른 쪽 분기로 이동하여 다시 탐색을 수행
시간복잡도는 O(V+E) V: 노드 수, E: 에지 수
재귀 함수로 구현하며 스택 자료구조 이용

재귀 함수로 이용하므로 스택 오버플로에 유의해야 한다.
단절점 찾기, 단절선 찾기, 사이클 찾기, 위상 정렬 등이 있다.
한 번 방문한 노드를 다시 방문하면 안 되므로 노드 방문 여부를 체크할 배열이 필요.
그래프는 인접 리스트로 표현
DFS는 LIFO

1. DFS를 시작할 노드를 정한 후 사용할 자료구조 초기화하기 (인접 리스트, 방문 배열, 스택에 시작노드 삽입)
2. 스택에서 노드를 꺼낸 후 꺼낸 노드를 탐색 순서에 기입하고 꺼낸 노드의 인접노드를 다시 스택에 삽입하고 방문 배열 체크
3. 1과 2의 과정을 스택 자료구조에 값이 없을 때까지 반복하기 (스택에 들어갈 값이 없을 때)
 */
public class DFS {
    /*
    백준 11724 연결 요소의 개수 구하기
    방향 없는 그래프가 주어졌을 때 연결 요소의 개수를 구하는 프로그램을 작성하시오.
    연결요소란 한 번에 연결될 수 있는 집합?의 갯수 (DFS가 끝날 때까지 탐색한 모든 노드의 집합)
     */

    Stack<Integer> stack =  new Stack<>();  // 노드 방문
    static boolean[] visited;
    static ArrayList<Integer>[] A;

    public void run() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = 0;

        visited = new boolean[n+1];                            // 방문 배열 n+1 만큼 하는건 0을 그냥 사용 하지 않기 위함
        for (int i = 1; i < n+1; i++) {   // 방문 배열 초기화
            visited[i] = false;
        }

        A = new ArrayList[n+1];                                // ArrayList만 생성한 것이고 안의 리스트은 아직 생성하지 않음

        for (int i = 1; i < n+1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {   // 인접 리스트에 데이터 넣기
               st = new StringTokenizer(br.readLine());

               int s = Integer.parseInt(st.nextToken());
               int e = Integer.parseInt(st.nextToken());

               A[s].add(e);
               A[e].add(s);
        }

        for (int i = 1; i < n+1; i++) {
            //방문하지 않은 노드가 있는경우 연결 요소 개수++
            //DFS실행
            if(visited[i] == false){
                System.out.println("연결요소 구성 시작");
                result++;
                DFS(i);
            }
        }

        System.out.println("연결요소의 개수: " + result);
    }

    public void DFS(int num){
        // 현재노드가 방문 노드이면 return
        if(visited[num] == true){
            return;
        }else {
            // 방문노드가 아니면 방문 배열에 방문기록
            visited[num] = true;
            System.out.println(num + " 방문");
            // 현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행하기(재귀함수)
            for (int i = 0; i < A[num].size(); i++) {
                if(visited[A[num].get(i)] == false){
                    DFS(A[num].get(i));
                }
            }

        }
    }
}
