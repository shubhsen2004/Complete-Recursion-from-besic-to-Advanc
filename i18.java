
public class i18 {
    public static int countSubString(String str,int i,boolean arr[]){
        if(i == str.length())  return 0;
        int n = str.charAt(i) - 'a';
        if(arr[n] == true){
            
            return countSubString(str, i+1, arr) + 2;
        }else{
        arr[n] = true;
        return countSubString(str, i + 1, arr)+1;
        }
    }
    public static void main(String[] args) {
        String str = "abcab";
       int n =  countSubString(str, 0, new boolean[26]);
       System.out.println(n);
    }
}
