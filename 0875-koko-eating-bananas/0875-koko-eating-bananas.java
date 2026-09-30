class Solution {
    public boolean isValid(int[] piles, int k, int h){
        long time=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            time+=(piles[i]+k-1)/k;
            if (time>h) return false;
        }
        return true;
    }
    public int maxi(int[] piles){
        int n=piles.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
        if(piles[i]>max){ 
            max=piles[i];
        }
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=maxi(piles);
        
        while(l<r){
            int mid=l+(r-l)/2;
            if(isValid(piles,mid,h)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l; 
    }
}