import java.util.ArrayList;

public class _02_Stack_class <T>{

    private ArrayList<T> Stack = new ArrayList<T>();

    public void push(T item)
    {
        Stack.add(item);
    }

    public T pop()
    {
        return Stack.remove(Stack.size()-1);
    }

    public void print (){
        System.out.println(Stack);
    }



    public static void main(String[] args) {
        _02_Stack_class<Integer> Stack = new _02_Stack_class<Integer>();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        Stack.print();

        Stack.pop();

        Stack.print();

        System.out.println(Stack.pop());


    }
}
