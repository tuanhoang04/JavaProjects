public class maxprofit {
    public static int maxProfit(int[] prices) {
    int[] reprices = new int[prices.length];
    int j = 0;
    for(int i = reprices.length-1; i >=0; i--){
        reprices[j] = prices[i];
        ++j;
    }

    int indexofmax = 0;
    for(int i = 0; i<reprices.length-1;i++){
        if(reprices[indexofmax] < reprices[i]){
            indexofmax = i;
        }
    }

    int indexofmin = indexofmax+1;
    for(int i = indexofmax+1; i<reprices.length;i++){
        if(reprices[indexofmin]>=reprices[i]){
            indexofmin = i;
        }
    }

        if (reprices.length == 1) {
            return 0;
        }else if(indexofmin>indexofmax&&(reprices[indexofmax] - reprices[indexofmin])>0){
        return reprices[indexofmax] - reprices[indexofmin];
        }else{
        return 0;}

    }

    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        maxProfit(prices);
    }
}
