import java.util.HashSet;

public class unique_subsequence {
    public static void subsequence(int idx , String str , String new_string , HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(new_string)){
                return;
            }
            else{
                System.out.println(new_string);
                set.add(new_string);
                return;
            }
        }
        char curr_char= str.charAt(idx);
        // to be in 
            subsequence(idx+1, str, new_string+curr_char,set);
        // to be not in
        subsequence(idx+1, str, new_string, set);
    }
    public static void main(String []ar){
        String str = "aaaa";
        HashSet<String> set = new HashSet<>();
        subsequence(0, str, "", set);
    }
    
}
