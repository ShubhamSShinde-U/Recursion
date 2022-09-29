public class power_logn {

    //problem statment : print x^n with log2(n) height 

    public static int power(int n,int po){
        if(po == 0){//base 1
            return 1;
        }
        if(n == 0){
            return 0;//base 2
        }

        // number of stack he equal to levels kelet ani tya sati log2(n)=1 condition vaprti ahe

        //n is even
        if(po % 2 == 0){
            return power(n, po/2) * power(n, po/2);//kaam  // po = power
        }
        //n is odd
        if(po % 2 == 1){
            return power(n, po/2) * power(n, po/2) * n;//kaam  // po = power
        }
        return 1;
    }
    public static void main(String argc[]){
        int result =power(5,2); // meaning is 5^2
        System.out.println(result);
    }
}
