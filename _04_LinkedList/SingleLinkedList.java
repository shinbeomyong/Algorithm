

public class SingleLinkedList<T> {

    public Node<T> head = null;

    public class Node<T>{
        T data;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }

    }

    public void addNode(T data){
        if(head == null)
        {
            head = new Node<T>(data);
        }
        else{
            Node<T> node = this.head;   // 맨 처음의 노드부터 시작

            while(node.next != null)    // 맨 마지막의 노드를 찾아가는 과정
            {
                node = node.next;
            }

            node.next = new Node<T>(data); // 맨 마지막의 노드에 다음 데이터를 추가.
        }
    }

    public void printAll(){
        if(head != null){
            Node<T> node = this.head;
            System.out.println(node.data);

            while(node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public void addNodeInsite(T data, T isData){
        Node<T> searchedNode = this.search(isData);

        if (searchedNode == null){
            this.addNode(data);
        }
        else{
            Node<T> nextNode = searchedNode.next;

            searchedNode.next = new Node<T>(data);

            searchedNode.next.next = nextNode;
        }
    }

    public Node<T> search(T data){
        if(this.head == null){
            return null;
        }
        else {
            Node<T> node = this.head;

            while(node != null)
            {
                if(node.data == data)
                {
                    return node;
                }
                node = node.next;
            }
        }

        return null;
    }

    public boolean  removeNode(T data){

        if(this.head == null) {
            return false;
        }
        else {
            Node<T> node = this.head;
            if (node.data == data)  //첫 데이터와 일치하는 경우
            {
                this.head = this.head.next;
                return true;
            }
            else {
                try {
                    while (node.data != null) {

                        if (node.next.data == data) {
                            node.next = node.next.next;
                            return true;
                        }
                        node = node.next;
                    }
                    return false;
                }
                catch(Exception e){
                    return false;
                }
            }
        }

        //return false;
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> MYSLL = new SingleLinkedList<Integer>();

        MYSLL.addNode(1);
        MYSLL.addNode(2);
        MYSLL.addNode(3);
        MYSLL.addNodeInsite(5,1);

        System.out.println("head 출력");
        System.out.println(MYSLL.head.data);            // 1
        System.out.println("head 다음 데이터 출력");
        System.out.println(MYSLL.head.next.data);       // 2
        System.out.println("SLL 전체 출력");
        MYSLL.printAll();

        //MYSLL.removeNode(3);
        //MYSLL.removeNode(1);
        if (MYSLL.removeNode(1) == false) {
            System.out.println("없는 데이터 입니다.");
        }
        else{
            System.out.println("Node 삭제 후 SLL 전체 출력");
            MYSLL.printAll();
        }

    }
}