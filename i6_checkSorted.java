public class i6_checkSorted {
    public static boolean checkSort(int []arr, int i){
        int n = arr.length;
        if(i == n - 1) return true;
        if(arr[i] > arr[i+1]){
            return false;
        }
       return checkSort(arr, i+1);


    }
    public static void main(String[] args) {
         int arr[] = {1,5,6 ,8,9};
        System.out.println(checkSort(arr, 0));
        int arr1[] = {1,5,9,8,9};
        System.out.println(checkSort(arr1, 0));
    }
}
