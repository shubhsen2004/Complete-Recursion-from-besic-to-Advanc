public class i17 {
    public static int strLength(String str, int i, int length){
        if(i == str.length()) return length;
        return strLength(str, i+1, length+1);
    }
    public static void main(String[] args) {
        String str = "Shubham Sen";
        System.out.println(strLength(str, 0, 0));
    }
    
}
