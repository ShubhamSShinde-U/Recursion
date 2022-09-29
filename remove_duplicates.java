//This code is for to remove duplicates from the string
public class remove_duplicates {
    public static boolean[] map= new boolean[26];// It will check either char is reapeated or not

    public static void remove_dupli(String str, int idx , String new_String){

        if(idx == str.length()){              //Base
            System.out.println(new_String);
            return;  
        }

        char current_char = str.charAt(idx); // taking current char from string

        if(map[current_char-'a'] == true){ // cureent_char - 'a' will return index for that char in map array
            remove_dupli(str,idx+1,new_String);
        }
        else{
            new_String += current_char;
            map[current_char - 'a'] = true;
            remove_dupli(str,idx+1,new_String);
        }
    }
    public static void main(String []ar){
        String str="fhsfsdasdfghjnsdxfcgvbhnzdxcvbja";
        remove_dupli(str,0,"");
    }
}
