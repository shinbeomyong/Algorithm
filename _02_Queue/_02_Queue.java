
import java.util.Queue;
import java.util.LinkedList;

public class _02_Queue {
    public static void main(String[] args) {
        //FIFO or LILO

        Queue<Integer> queue_int = new LinkedList<Integer>();
        Queue<String> queue_str = new LinkedList<String>();

        queue_int.add(1);
        queue_int.offer(2); //add나 offer 모두 queue에 값을 추가 하는 것. offer는 true/false값을 반환한다고 했는데 ?? 안되는데?

        System.out.println(queue_int); // queue에 들어있는 모든 값 출력

        queue_int.poll();    //poll은 큐의 첫 번째 값을 반환하고 해당 값은 큐에서 삭제됨. 근데 값을 반환.. 안하는디?
        queue_int.remove();  //remove는 값을 삭제

        System.out.println(queue_int);

        enqueue(queue_int, 1);
        System.out.println(queue_int);

        dequeue(queue_int,1);
        System.out.println(queue_int);

        _02_Queue_class <Integer> queue = new _02_Queue_class<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.printqueue();





    }

    public static Queue<Integer> enqueue(Queue<Integer> queue, Integer num){

        queue.add(num);

        return queue;
    }

    public static Queue<Integer> dequeue(Queue<Integer> queue, Integer num){

        queue.remove(num);

        return queue;
    }
}
