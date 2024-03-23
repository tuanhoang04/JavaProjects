public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int[] tick = new int[nums.length+1];
        for(int i = 0; i<nums.length;i++){
            tick[nums[i]] = 1;
        }
        for(int i = 0; i<tick.length;i++){
            if (tick[i]==0){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {0,1,3};
        missingNumber(a);
    }
}
