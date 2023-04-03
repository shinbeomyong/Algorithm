package JavaAlgorithm;

import java.io.IOException;
import java.util.*;

public class 카드게임 {
    public void run() throws IOException{
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        while(q.size() !=1){
            q.poll();
            q.add(q.peek());
            q.poll();
        }
        System.out.println(q.peek());
    }
}
