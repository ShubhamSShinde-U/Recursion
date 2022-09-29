// This code gives possible combination of chars when corresponding button is clicked
public class keypad_com {

    public static String [] keypad = {"." , "abc" , "def" , "ghi" , "jkl" , "mno" ,"pqrs" , "stu" , "vwx" , "yz"};

    public static void Keypad_combo(int idx , String str , String combination){
        if(idx == str.length()){    //Base case
            System.out.println(combination);
            return;
        }
        char curr = str.charAt(idx); // finding which button is pressed eg. str =23 then curr represent the 2 or 3 depends upon condition  
        String mapping = keypad[curr-'0']; // taking corresponding chars for that button from keypad array

        for( int i = 0 ; i<mapping.length(); i++){
            Keypad_combo(idx+1 , str , combination+mapping.charAt(i)); // kaam 
        }
    }
public static void main(String []ar){
    String str = "23";
    Keypad_combo(0 , str , "");
}
}
