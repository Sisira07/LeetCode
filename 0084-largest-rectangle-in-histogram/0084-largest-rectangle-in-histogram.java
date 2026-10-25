class Solution {
    public int[] nse(int[] arr){
        int n=arr.length;
        Stack<Integer> stk=new Stack<>();
        int[] nse=new int[n];

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
        Stack<Integer> stk=new Stack<>();
        int[] pse=new int[n];

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
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] pse=pse(heights);
        int[] nse=nse(heights);
        int maxarea=0;

        for(int i=0;i<n;i++){
            int area=heights[i]*(nse[i]-pse[i]-1);
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
    }
}