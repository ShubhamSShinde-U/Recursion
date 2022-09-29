import java.util.Scanner;
class factorial{
    public static void factor(int num,int start,int fct){
        if(num==0 || start==num){
            fct*=start;
            System.out.println(fct);
            return;
        }
        fct*=start;
        factor(num,start+1,fct);

    }
    public static void main(String []argc){
        Scanner sc=new Scanner(System.in);
        //int x=sc.nextInt();
        factor( 1,1,1);
        sc.close();
    }
}