// This code is print all possible subsequnces of string 
// example : abc ab ac a bc b c  //at end ther is empty space showing not any single char is selected
public class all_subsequence {

    public static void subsequence(int idx , String str , String new_string){
        if(idx == str.length()){
            System.out.println(new_string);
            return;
        }
        char current_char=str.charAt(idx);
        // to be 
        subsequence(idx+1, str, new_string + current_char);//considering the current char is in new string 
        //not to be
        subsequence(idx+1, str, new_string);// considering the current char is not in the new string 
    }
    public static void main(String [] ar){
        String str ="abc";
        subsequence(0, str,"");
    }
}