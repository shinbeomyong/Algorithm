package JavaAlgorithm;

import java.util.*;

public class 절댓값힙 {
    public void run(){
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            if(Math.abs(o1) == Math.abs(o2)){
                if(o1>o2){
                    return 1;
                }else {
                    return -1;
                }
            }
            return Math.abs(o1) - Math.abs(o2);
        });

        PriorityQueue<Integer> a = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) == Math.abs(o2)){
                    if(o1<o2){
                        return -1;
                    }else{
                        return 1;
                    }
                } else if (Math.abs(o1)>Math.abs(o2)) {
                    return 1;
                } else if (Math.abs(o1)<Math.abs(o2)){
                    return -1;
                }

                return 0;
            }
        });

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if(x==0){
                if(a.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(a.poll());
                }
            }else{
                a.add(x);
            }
        }
    }
}
