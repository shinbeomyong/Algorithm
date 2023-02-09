import  java.util.Stack;

public class _02_Stack {
    /*
    Stack 은 LIFO,FILO 정책
    대표적인 스택의 활용 : 컴퓨터 내부의 프로세스 구조의 함수 동작 방식
    push() : 데이터 넣기
    pop() : 데이터 빼기

    장점
    구조가 단순해서 구현이 쉽다
    데이터 저장/읽기 속도가 빠르다
    단점
    데이터 최대 갯수를 미리 정해야 한다.
    저장공간의 낭비가 있을 수 있다.

    java.util패키지에서 Stack 클래스를 제공한다.
     */
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        stack.pop();

        System.out.println(stackgit);

    }
}
