

public class problem_1 {
    public static void DecreasingOrder(int n){
        if(n==0)
        {
            return ;
        }
        
        System.out.println(n);
        DecreasingOrder(n - 1);
                
    }
    public static void main(String[] args) {
        int n = 8;
        DecreasingOrder(n);
    }
}