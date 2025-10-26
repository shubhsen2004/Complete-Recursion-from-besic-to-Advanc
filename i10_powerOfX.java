public class i10_powerOfX {
    public static int powerOfX(int x, int n){
        if(n == 0){
            return 1;
        } 
        int halfPowers =  powerOfX(x, n/2);
        int halfPowerSq = halfPowers * halfPowers;
        if(n%2 != 0){
        halfPowerSq = x * halfPowerSq;
        }
       
        return halfPowerSq;
    }
     public static void main(String[] args) {
        System.out.println(powerOfX(2, 25));
    }
}
 