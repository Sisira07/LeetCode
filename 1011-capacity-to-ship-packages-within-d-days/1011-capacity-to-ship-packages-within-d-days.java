class Solution {
    public boolean isValid(int[] weights, int days, int k){
        int rem=k;
        int totD=1;
        int n=weights.length;
        
        for(int i=0;i<n;i++){
            if(weights[i]>rem){
                rem=k;
                totD++;
            }
            rem-=weights[i];
        }
        if(totD>days) return false;
        return true;
    }
    public int sum(int[] weights){
        int sum=0;
        int n=weights.length;
        for(int i=0;i<n;i++){
            sum+=weights[i];
            }
            return sum;
    }
    public int maxi(int[] weights){
        int maxi=Integer.MIN_VALUE;
        int n=weights.length;
        for(int i=0;i<n;i++){
            if(weights[i]>maxi) maxi=weights[i];
        }
            return maxi;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int l=maxi(weights);
        int r=sum(weights);
        
        while(l<r){
            int mid=l+(r-l)/2;
            if(isValid(weights,days,mid)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}