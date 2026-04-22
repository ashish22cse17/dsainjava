package array;

public class SellandBuy {
    public static void maxProfit(int[] prices) {
        // int min=Integer.MAX_VALUE;//+infinity
        // int max=Integer.MIN_VALUE;//-infinty
        // int minInd=1;
        
        // for(int i=0;i<prices.length;i++){
        //     if(min>prices[i]){
        //         min=prices[i];
        //         minInd=i;
        //     }
        // }
        // for(int i=minInd;i<prices.length;i++){
        //     if(prices[i]>max){
        //         max=prices[i];
        //     } 
        // }
        // System.out.println(max-min); failed for case [2 4 1];


        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice<prices[i]) {
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        System.out.println(maxProfit);

    }

    public static void main(String[] args) {
        int prices[] = {2,4,1};
        maxProfit(prices);
    }
}
