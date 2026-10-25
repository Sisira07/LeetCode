class Solution {
    public int[] nse(int[] arr){
        Stack<Integer> stk=new Stack<>();
        int n=arr.length;
        int[] nse=new int[n];

        for(int i=n-1;i>=0;i--){
            while(!stk.empty() && arr[stk.peek()]>arr[i]){
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
        int[] pse= new int[n];
        Stack<Integer> stk=new Stack<>();

        for(int i=0;i<n;i++){
            while(!stk.empty() && arr[stk.peek()]>=arr[i]){
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
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        long sum=0;
        int[] pse=pse(arr);
        int[] nse=nse(arr);
        int mod=1000000007;

        for(int i=0;i<n;i++){
            int l=i-pse[i];
            int r=nse[i]-i;
            long contri=(((long)l*r%mod)*arr[i])%mod;
            sum=(sum+contri)%mod;
        }
        return (int)sum;
    }
}