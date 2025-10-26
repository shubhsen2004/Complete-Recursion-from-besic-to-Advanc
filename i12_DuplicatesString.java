public class i12_DuplicatesString {
    public static void removeDuplicates(String str,StringBuilder newStr, int idx, boolean map[]){
            if(idx == str.length()){
                System.out.println(newStr);
                    return;
            }
            //kaam
            char currChar = str.charAt(idx);
            if(map[currChar - 'a'] == true){
                removeDuplicates(str, newStr, idx+1, map);
            }
            else{
                map[currChar - 'a'] = true;
               newStr.append(currChar);
               removeDuplicates(str, newStr, idx + 1, map);   
            }
}
public static void main(String[] args) {
    String str = "aappnacollege";
    removeDuplicates(str, new StringBuilder(""), 0, new boolean[26]);
        }
}