class serial_additon{
    static void addition(int x){
        if(x==0){
            return;
        }
        System.out.println(x);
        addition(x-1);
    }
    public static void main(String []argc){
        addition(5);
    }
}