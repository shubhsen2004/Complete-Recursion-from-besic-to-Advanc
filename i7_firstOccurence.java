public class i7_firstOccurence {
     public static int firstOccurance(int []arr, int i, int key){
        int n = arr.length;
        if(i == n - 1) {
            System.out.println("key is not available");
            return -1;
        };
        if(arr[i] == key){
            return i;
        }
       return firstOccurance(arr, i+1, key);


    }
    public static void main(String[] args) {
         int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurance(arr, 0,5));
        int arr1[] = {1,5,9,8,9};
        System.out.println(firstOccurance(arr1, 0,9));
    }
    
}
