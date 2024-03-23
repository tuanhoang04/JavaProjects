public class binarysearch {
    public static void binarySearch(int key, int[] a){
//the return type can be different
        int lowerbound = 0;
        int upperbound = a.length-1;

        while(lowerbound <= upperbound){
            int middle = (upperbound+lowerbound)/2;
            if(a[middle]==key){
                System.out.println("Your searched number lies in index: "+ middle);
                break;
            }
            else if(a[middle]>key){
                upperbound = middle -1;
            }
            else if(a[middle]<key){
                lowerbound = middle +1;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,20,434,3222,3224};
        binarySearch(8,a);
    }
}
