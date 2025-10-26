public class i9_powerOfX {
    public static int powerOfX(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * powerOfX(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(powerOfX(2, 5));
    }
}
