public class i11_tilingProblem {
    public static int tilingProblem(int n){
        if(n == 0 || n ==1) return 1;
        int verticle = tilingProblem(n - 1);
        int horizontal = tilingProblem(n - 2);
        int totalWays = verticle + horizontal;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(5));
    }
}
