class Solution {
    public int[] nse(int[] arr){
        int n=arr.length;
        int[] nse=new int[n];
        Stack<Integer> stk=new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!stk.empty() && arr[stk.peek()]>=arr[i]){
                stk.pop();
            }
            if(stk.empty()){
                nse[i]=n;
            }
            else{
                nse[i]=stk.peek();
            }
            stk.push(i);
        }
        return nse;
    }
    public int[] pse(int[] arr){
        int n=arr.length;
        int[] pse=new int[n];
        Stack<Integer> stk=new Stack<>();

        for(int i=0;i<n;i++){
            while(!stk.empty() && arr[stk.peek()]>arr[i]){
                stk.pop();
            }
            if(stk.empty()){
                pse[i]=-1;
            }
            else{
                pse[i]=stk.peek();
            }
            stk.push(i);
        }
        return pse;
    }
    public int[] nge(int[] arr){
        int n=arr.length;
        int[] nge=new int[n];
        Stack<Integer> stk=new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!stk.empty() && arr[stk.peek()]<=arr[i]){
                stk.pop();
            }
            if(stk.empty()){
                nge[i]=n;
            }
            else{
                nge[i]=stk.peek();
            }
            stk.push(i);
        }
        return nge;
    }
    public int[] pge(int[] arr){
        int n=arr.length;
        int[] pge=new int[n];
        Stack<Integer> stk=new Stack<>();

        for(int i=0;i<n;i++){
            while(!stk.empty() && arr[stk.peek()]<arr[i]){
                stk.pop();
            }
            if(stk.empty()){
                pge[i]=-1;
            }
            else{
                pge[i]=stk.peek();
            }
            stk.push(i);
        }
        return pge;
    }
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        int[] pse=pse(nums);
        int[] nse=nse(nums);
        int[] nge=nge(nums);
        int[] pge=pge(nums);
        long mintot=0;
        long maxtot=0;

        for(int i=0;i<n;i++){
            long lmin=i-pse[i];
            long rmin=nse[i]-i;
            long lmax=i-pge[i];
            long rmax=nge[i]-i;

            mintot+=(long)nums[i]*lmin*rmin;
            maxtot+=(long)nums[i]*lmax*rmax;
        }
        long res=maxtot-mintot;
        return res;
    }
}