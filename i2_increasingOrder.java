public class i2_increasingOrder {
    public static void increasing(int n){  
    if(n==0)
        {
            return ;
        }
         increasing(n - 1);
        System.out.println(n);
       
                
    }
    public static void main(String[] args) {
        int n = 8;
        increasing(n);
    }
}
