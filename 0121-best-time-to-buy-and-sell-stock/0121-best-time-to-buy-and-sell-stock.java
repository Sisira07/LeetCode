class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxprof=Integer.MIN_VALUE;
        int minprice=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            minprice=Math.min(minprice,prices[i]);
            maxprof=Math.max(maxprof,prices[i]-minprice);
        }
        return maxprof;
    }
}