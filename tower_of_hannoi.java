public class tower_of_hannoi {
    public static void tower_of_hannoi_cal(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfering disk "+n+" from "+src+" to "+dest );
            return;
        }
        tower_of_hannoi_cal(n-1, src, dest, helper);//Move n-1 disks from source to helper
        System.out.println("Transfering disk "+n+" from "+src+" to "+dest );//move 1st disk from source to distination
        tower_of_hannoi_cal(n-1,helper,dest, src);//now move the n-1 disks from helper to destination using source as helper
    }
    public static void main(String argc[]){
        int n=5;

        tower_of_hannoi_cal(n,"S","H","D");

    }
}
