package JavaAlgorithm;
/*
분할 정복방식을 사용해 데이터를 분할하고 분할한 집합을 정렬하며 합치는 알고리즘. 특히 2개의 그룹을 병합하는 원리를 꼭 숙지.
시간복잡도는 O(nlogn)
코테에서 종종 나오니 정확히 이해해라!

투 포인터 개념을 사용하여 왼쪽, 오른쪽 그룹을 병합합니다.
왼쪽 포인터와 오른쪽 포인터의 값을 비교하여 작은 값을 결과 배열에 추가하고 포인터를 오른쪽으로 1칸 이동
 */
public class 병합정렬 {
    public void run(){
        int[] arr = {24,32,42,60,5,15,45,90};
        int N = arr.length;
        int[] sorted = new int[N];

        mergesorted(arr, 0, N-1, sorted);
    }

    public void mergesorted(int[] arr, int left, int right, int[] sorted){
        if(left >= right){
            return;
        }

        int mid = (left+right)/2;

        mergesorted(arr,left, mid, sorted);     // 왼쪽 분할
        mergesorted(arr,mid+1,right,sorted);    // 오른쪽 분할
        merge(arr,left,mid,right,sorted);   // 병합

    }

    public void merge(int[] arr, int left, int mid, int right, int[] sorted){
        int i = left;
        int j = mid+1;

        for (int k = left; k <= right; k++) {
            if(j>right){
                sorted[k] = arr[i++];
            } else if (i>mid) {
                sorted[k] = arr[j++];
            } else if (arr[i] <= arr[j]) {
                sorted[k] = arr[i++];
            }else {
                sorted[k] = arr[j++];
            }
        }
    }
}
