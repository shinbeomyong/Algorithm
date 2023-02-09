package JavaAlgorithm._01_Array;

import java.util.ArrayList;

public class _01_Array {
    public static void main(String[] args) {
        // int : Primitive 자료형
        // Integer : Wrapper 클래스
        // Wrapper 클래스를 사용하는 이유는 null 을 용이하게 처리할 수 있고 ArrayList 등 객체만을 핸들링 하는 기능을 사용하기 위함.

        Integer[] data_list = new Integer[10];
        Integer data_list1[] = {5,4,3,2,1};
        Integer[] data_list2 = {1,2,3,4,5};

        //List 와 ArrayList의 차이점
        /*
        List 는 인터페이스 ArrayList 는 클래스
        클래스는 크게 일반 클래스와 클래스 내에 '추상 메서드'가 하나 이상 있거나, abstract 로 저의된 추상 클래스로 나뉨
        인터페이스는 모든 메서드가 추상 메서드인 경우를 의미하며, 인터페이스를 상속받는 클래스는 인터페이스에서 정의된 추상 메서드를 모두 구현 해야 함
        (따라서 다양한 클래스를 상속받는 특정 인터페이스는 결국 동일한 메서드를 제공함)
        ArrayList 가 아니라, List로 선언된 변수는 다음과 같이 필요에 따라 다른 리스트 클래스를 쓸 수 있는 구현상의 유연성을 제공함.
        List<Integer> list1 = new ArrayList<Integer>();
        list1 = new LinkedList<Integer>();
        근데 굳이 동일 변수에 다양한 리스트 클래스는 쓸 필요 없으니 명시해서 사용할것이다.
        */

        ArrayList<Integer>list1 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        System.out.println(list1.get(0));

        list1.set(0,5); // 0번 index에 값 설정
        list1.remove(0); // 특정 index 값 제거
        list1.size(); // 배열 길이 확인

        System.out.println("------------------------------");

        Integer array[][][] = {
                {
                        {1,2,3},
                        {4,5,6}
                },
                {
                        {7,8,9},
                        {10,11,12}
                }
        };

        System.out.println(array[1][0][1]);
        System.out.println(array[1][1][0]);
        System.out.println(array[1][1][2]);

        System.out.println("------------------------------");

        String dataset[] = {
        "Braund, Mr. Owen Harris",
                "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
                "Allen, Mr. William Henry",
                "Moran, Mr. James",
                "McCarthy, Mr. Timothy J",
                "Palsson, Master. Gosta Leonard",
                "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. Marguerite Rut",
                "Bonnell, Miss. Elizabeth",
                "Saundercock, Mr. William Henry",
                "Andersson, Mr. Anders Johan",
                "Vestrom, Miss. Hulda Amanda Adolfina",
                "Hewlett, Mrs. (Mary D Kingcome) ",
                "Rice, Master. Eugene",
                "Williams, Mr. Charles Eugene",
                "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
                "Masselmani, Mrs. Fatima",
                "Fynney, Mr. Joseph J",
                "Beesley, Mr. Lawrence",
                "McGowan, Miss. Anna",
                "Sloper, Mr. William Thompson",
                "Palsson, Miss. Torborg Danira",
                "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Todoroff, Mr. Lalio",
                "Dwyer, Miss. Ellen",
                };

        Integer cnt = 0;

        for (int i = 0; i < dataset.length; i++) {
            if (dataset[i].indexOf("M")>=0) // indexof에 일치하는 문자가 없다면 -1을 return함
            {
                cnt++;
            }
        }
        System.out.println(cnt);

        String test = "Masselmani, Mrs. Fatima";

        System.out.println(test.indexOf("M"));
    }
}
