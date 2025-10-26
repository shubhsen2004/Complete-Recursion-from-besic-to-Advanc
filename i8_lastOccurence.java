public class i8_lastOccurence {
     public static int lastOccurance(int []arr, int i, int key){
        
    //     if(i == 0) {
    //         System.out.println("key is not available");
    //         return -1;
    //     };
    //     if(arr[i] == key){
    //    return i;
    //     }
    //    return firstOccurance(arr, i-1, key);
    // or
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccurance(arr, i+1, key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {

         int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurance(arr, 0,5));
        int arr1[] = {1,5,9,8,9};
        // System.out.println(firstOccurance(arr1,arr1.length - 1,9));
    }
    
}
