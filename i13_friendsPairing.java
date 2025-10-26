public class i13_friendsPairing {
    public static int friendsPairing(int n){
        if(n == 0 || n == 1) return 1;
       int totalPair = friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
       return totalPair;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(friendsPairing(n));
    }
}
