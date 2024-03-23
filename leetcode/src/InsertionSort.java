public class InsertionSort {
    public static void insertionSort(int[] a){
        for(int i = 1; i<a.length; i++){
            int temp = a[i];
            int position = i-1;
            while(position>=0){
                if(a[position]>temp){
                    a[position+1]=a[position];
                    --position;
                }else{
                    break;
                }
            }
            a[position+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,3,4,2};
        insertionSort(a);
    }
}
