public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = new int[]{5,3,1,4,2};
        arr = bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] bubbleSort(int a[]){
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
