import java.util.LinkedList;
/*
SLL(Single Linked List)는 중간에 있는 데이터를 찾기 위해서는 처음부터 끝 까지 검색해야 한다. (한 쪽으로만 연결되어 있기 때문)
그래서 DLL(Doubly Linked List) 가 있음. 이중 연결 리스트라고도 함
양방향으로 연결되어 있어 양방향 검색이 가능함.
 */
public class DoubleLinkedList <T>{
    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T>{
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if(this.head == null)
        {
            this.head = new Node<T>(data);
            this.tail = this.head;
        }
        else
        {
            Node<T> node = this.head;

            while(node.next != null){
                node = node.next;
            }

            node.next = new Node<T>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll(){

        if(this.head != null){
            Node<T> node = this.head;
            System.out.println(node.data);

            while(node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public T SearchedHead(T data){
        Node<T> node = this.head;
        Integer cnt = 0;

        if(this.head != null){
            while(node.next != null){
                if(node.data == data)
                {
                    System.out.println("찾았습니다. 앞에서 부터 " + cnt + "번째에 있습니다.");
                    return node.data;
                }
                else
                {
                    node = node.next;
                    cnt ++;
                }
            }
        }
        else {
            System.out.println("DLL 이 비어있습니다.");
            return null;
        }

        return null;
    }

    public T SearchedTail(T data){
        Node<T> node = this.tail;

        Integer cnt = 0;

        if(this.head != null){
            while(node.prev != null) {
                if (node.data == data) {
                    System.out.println("찾았습니다. 뒤에서 부터 " + cnt + "번째에 있습니다.");
                    return node.data;
                } else {
                    node = node.prev;
                    cnt++;
                }
            }
        }
        else{
            System.out.println("DLL 이 비어있습니다.");
            return null;
        }

        return null;
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> node = new DoubleLinkedList<Integer>();

        node.addNode(1);
        node.addNode(2);
        node.addNode(3);
        node.addNode(4);
        node.addNode(5);

        node.printAll();

        node.SearchedHead(3);
        node.SearchedTail(4);
    }
}

