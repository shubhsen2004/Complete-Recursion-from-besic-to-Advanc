public class i5_nthFebonacciNum {
    public static int febonacci(double n){
        if( n == 1 ){
            return 0 + 1;
        }
        else if (n == 0){
            return 0;
        }
        int k = febonacci(n - 1);
        int l = febonacci(n - 2);
        return k + l;

    }
    public static void main(String[] args) {
        System.out.println(febonacci(25));
        System.out.println(febonacci(26));
        System.out.println(febonacci(27));
        System.out.println(febonacci(28));
    }
    
}
