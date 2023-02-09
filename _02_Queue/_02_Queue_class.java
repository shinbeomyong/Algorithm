import java.sql.Array;
import java.util.ArrayList;

public class _02_Queue_class <T>{
    // 다양한 데이터 타입을 다룰 수 있도록 Java Genric 타입 문법 활용..! => <T>

    private ArrayList<T> queue = new ArrayList<T>();

    public void enqueue(T item)
    {
        queue.add(item);
    }

    public T dequeue()
    {
        if (queue.isEmpty())    //비어 있는경우 null 을 반환 해야 하기 때문에 메소드 타입을 지정
        {
            return null;
        }
        return queue.remove(0);
    }

    public void printqueue()
    {
        System.out.println(queue);
    }

    public static void main(String[] args) {
        _02_Queue_class<Integer> queue = new _02_Queue_class<Integer>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.printqueue();

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.printqueue();
    }
}
