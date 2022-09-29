public class power {
    public static int power_cal(int num,int po){
        if(num==0){//base 1
            return 0;
        }
        if(po==0){//base 2
            return 1;
        }

        int cal_po_n_mi_one = power_cal(num, po-1);//main kaam
        
        int result_power = num*cal_po_n_mi_one;
        
        return result_power;

    }
    public static void main(String [] a){
        int num=5,po=2;

        int result=power_cal(num,po);
        System.out.println(result);
    }
}
