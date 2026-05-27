class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 0){
            return 0;
        }

        int prof = 0;
        int l = prices[0];

        for(int i = 1; i <prices.length; i ++){
            if(prices[i] < l){
                l = prices[i];
            }
            if(prices[i] - l > prof){
                prof = prices[i] - l;
            }
        }


 

        return prof;
    }
}
