// This code converts asssadasd to aadadssss : means appending repaeated char at end of string
// Time Complexity is O(n + count(n) )= O(2n) == O(n)
public class append_char_at_end {

   public static void moveALchar(String str,int count,int idx,String new_string){
    if(idx==str.length()){
        for(int i=0;i<count;i++){
            new_string+='x';
        }
        System.out.println(new_string);
        return;
    }
    char current_char=str.charAt(idx);
    if(current_char=='x'){
        count++;
        moveALchar(str, count, idx+1, new_string);
    }
    else{
        new_string+=current_char;
        moveALchar(str, count, idx+1, new_string);
        }
    }
    public static void main(String []ar){
        String str="axxdcsdsxxs";
        moveALchar(str, 0, 0, "");
    }
}
