package JavaAlgorithm._04_LinkedList;

/*

LinkedList는 데이터와 다음데이터주소를 같이 생성 한다. 한 세트!
데이터 공간이 자동으로 추가가 가능하여 크기가 유연하다.
노드 : 하나의 데이터 와 다음데이터 주소, 포인터 : 다음데이터 연결 정보
ex)
데이터/다음데이터주소 -> 데이터/다음데이터주소 -> 데이터/다음데이터주소
A/0011h - > B/0040h -> C/0050h

장점
미리 데이터 공간을 미리 할당하지 않아도 됨

단점
연결을 위한 별도 데이터 공간이 필요하므로 저장공간 효율이 높지 않음
연결 정보를 찾는 시간이 필요하므로 접근 속도가 느림
중간 데이터 삭제시, 앞뒤 데이터의 연결을 재구성해야 하는 부가적이 작업이 필요

 */

public class Node <T>{

    T data;
    Node<T> next = null;

    public Node(T data){ // 생성자.
        this.data = data;
    }

    // 2개의 노드 생성
    Node<Integer> node1 = new Node<Integer>(1);
    Node<Integer> node2 = new Node<Integer>(2);

    //Node의 연결
    Node head = node1;


}
