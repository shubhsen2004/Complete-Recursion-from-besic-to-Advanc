//Shubham Sen
public class i14_binaryString {
    public static void printBinString(int n,int lastPlace,String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        printBinString(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinString(n-1, 1, str+"1");
        }
    }

    public static int countTotalWay(int n){
        if(n == 0) return 1;
        // if(n == 1) return 2;
        // int totalPair = countTotalWay(n - 1) + countTotalWay(n - 2);
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 2;
        int totalPair = 0;
        
        for(int i = 2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
            totalPair = dp[i];
        }
        return totalPair;
    }
    public static void main(String[] args) {
        printBinString(3, 0, "" );
        System.out.println(countTotalWay(5)); //print total number of ways print binary string in consucutive one 
    }
}

 
