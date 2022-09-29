// Code is to find first and last occurence of element in String 
public class occurance_of_element{
    public static int first=-1;
    public static int last=-1;

    public static void find_occurence(String str, int index , char element){
        if(index==str.length()){//base 
            System.out.println(first);
            System.out.println(last);
            return ;
        }
        char current_char=str.charAt(index); //current element 
        if(current_char==element){//checking
            if(first==-1){
                first=index;//first occurence
            }else{
                last=index;// last occurence
            }
        }
    }
    public static void main(){
        String str="assdfskdfsdfjkjjzdjksdasss";
        find_occurence(str,0,'a');//(string , index , character to find)
    }
}
