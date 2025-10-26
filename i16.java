public class i16 {
    public static void printdigitInWord(int n){
        if(n == 0) return;
       
        int digit = n%10;
         printdigitInWord(n/10);
        switch (digit) {
             case 0:
                System.out.print(" Zero ");
                break;
            case 1:
                System.out.print(" One ");
                break;
             case 2:
                System.out.print(" Two ");
                break;
             case 3:
                System.out.print(" Three ");
                break;
             case 4:
                System.out.print(" Four ");
                break;
             case 5:
                System.out.print(" Five ");
                break;
             case 6:
                System.out.print(" Six ");
                break;
             case 7:
                System.out.print(" Seven ");
                    break;
             case 8:
                System.out.print(" Eight ");
                break;
             case 9:
                System.out.print(" Nine ");
                break;
    
            default:
                return;
        }
        
      
    }
    public static void main(String[] args) {
        int n = 123456;
        printdigitInWord(n);
    }
    
}
