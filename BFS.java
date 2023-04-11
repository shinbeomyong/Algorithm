package JavaAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
그래프를 완전 탐색하는 방법 중 하나로, 시작 노드에서 출발해 시작 노드를 기준으로 "가까운 노드"를 먼저 방문하면서 탐색하는 알고리즘
FIFO탐색, Queue 자료구조를 이용
시간복잡도는 O(V+E) V: 노드수 / E: 에지수
목표 노드에 도착하는 경로가 여러 개일 때 최단 경로를 보장한다.

백준 2178

 */
public class BFS {

    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    //static ArrayList<Integer>[] A;
    static int[][] A;
    static boolean[][] visited;

    static int n;
    static int m;
    public void run() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        A = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();

            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }

        BFS(0,0);

        // 시작 노드 정한 후 자료구조 초기화

        // 인접 리스트 표현하는것 DFS와 동일

        // 큐에서 노드를 꺼낸 후 꺼낸 노드의 인접 노드를 다시 큐에 삽입하기.
        // 큐자료구조에 값이 없을 때 까지 반복하기.

        System.out.println(A[n-1][m-1]);
    }

    private static void BFS(int i, int j){
        Queue<int[]>queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        visited[i][j] = true;

        while(!queue.isEmpty()){
            int now[] = queue.poll();

            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if (x>=0 && y>= 0 && x<n && y<m){
                    if(A[x][y] != 0 && visited[x][y] != true){
                        visited[x][y] = true;

                        A[x][y]  = A[now[0]][now[1]]+1; // depth 증가
                        queue.add(new int[] {x,y});
                    }
                }
            }
        }
    }
}

/*
static boolean[][] visited;
    static int[][] A;

    static int n;
    static int m;

    static String path;

    public static void main(String[] args) throws InterruptedException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        A = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        path = "";
        BFS(0,0);

        System.out.println(path);
    }

    static public void BFS(int i, int j){
        //Queue<int[]> queue = new LinkedList<>();
        Queue<History> queue = new LinkedList<>();

        int currow = i;
        int curcol = j;
        int curdist = 1;
        String curPath = "";

        queue.add(new History(i,j,curdist,curPath));

        visited[i][j] = true;

        while(!queue.isEmpty()){

            History history = queue.poll();

            currow = history.row;
            curcol = history.col;
            curdist = history.dist;
            curPath = history.path;
            path = curPath;

            visited[currow][curcol] = true;

            if(currow == 3 && curcol == 0){     // target 이면 break 하고 현재 path를 반환! 없는 경우 queue가 다 비어져있는 것으로 판단.
                break;
            }

            if(currow-1 >= 0 && A[currow-1][curcol] != 0 && !visited[currow-1][curcol]){
                queue.add(new History(currow-1,curcol,curdist+1,curPath));
            }

            if(currow+1 < n && A[currow+1][curcol] != 0 && !visited[currow+1][curcol]){
                queue.add(new History(currow+1,curcol,curdist+1,curPath));
            }

            if(curcol+1 < m && A[currow][curcol+1] != 0 && !visited[currow][curcol+1]){
                queue.add(new History(currow,curcol+1,curdist+1,curPath));
            }

            if(curcol-1 >= 0 && A[currow][curcol-1] != 0 && !visited[currow][curcol-1]){
                queue.add(new History(currow,curcol-1,curdist+1,curPath));
            }
        }

        if(queue.isEmpty()){
            path = "길이 없습니다.";
        }
    }

    public static class History{
        int row, col, dist;
        String path;

        public History(int row, int col, int dist, String oldPath){
            this.row = row;
            this.col = col;
            this.dist = dist;
            if("".equals(oldPath)){
                this.path = "(" + row + "," + col + ")";
            }else{
                this.path = oldPath + "-> " + "(" + row + "," + col + ")";
            }
        }
    }
 */