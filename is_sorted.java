//This program is for to check given array is strictly sorted or not
// As we are going to traverse the array for once only so that is why time complexity is O(n)
class is_sorted{

    public static boolean is_it_sorted(int arr[],int idx){

        if(idx == arr.length-1){//base case
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return is_it_sorted(arr, idx+1);// at this moment array is sorted
        }
        else{
            return false;//array is not sorted
        }
    }
        //another way
        public static boolean is_sorted_reverse(int arr[],int idx){//this fun check if array sorted or not 
            if(idx==arr.length){
                return true;     //base case
            }
            
            if(arr[idx]>=arr[idx+1]){//kaam
                return false;
            }
            return is_sorted_reverse(arr,idx+1);//kaam
        }
    public static void main(String []ar){
        int n[]={1,2,3,3};
        System.out.println(is_it_sorted(n,0));
    }
}