public class i15 {
    public static void printOccuranceKey(int  i,int arr[],int key){
        if(arr[i] == key ){
            System.out.print(i+" ");
        }
        if(i ==arr.length - 1){
            return;
        }
        printOccuranceKey(i+1, arr, key);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,2,2,2};
        printOccuranceKey(0, arr, 2);
    }
}
// shubham sen 
