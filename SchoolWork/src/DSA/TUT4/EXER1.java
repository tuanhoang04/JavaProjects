package DSA.TUT4;

public class EXER1 {
    public static int[] rearrange(int[] a){
        int[] temp = new int[a.length];
        int i;
        int aa =0;
        for(i = 0; i<a.length; i++){
            if (a[i]<0){
                temp[aa] = a[i];
                aa++;
            }
        }

        for(i = 0; i<a.length; i++){
            if(a[i]==0){
                temp[aa]=0;
                aa++;
            }
        }

        for(i = 0; i<a.length; i++) {
            if (a[i] > 0) {
                temp[aa] = a[i];
                aa++;
            }
        }
        return temp;
    }

    public static void printintarray(int[] a){
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] a = {0,3,4,-2,-5,-8};
        printintarray(rearrange(a));
    }
}
