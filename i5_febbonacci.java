public class i5_febbonacci {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
       int  b = 0;
       int c=0;
    
    for(int i = 0; i< n; i++){
        System.out.println(c);
        c=a+b;
        a=b;
        b=c;

    }
    }
}
