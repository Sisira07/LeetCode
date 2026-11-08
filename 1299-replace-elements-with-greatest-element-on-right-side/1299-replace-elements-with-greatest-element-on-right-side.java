class Solution {
    public int[] replaceElements(int[] arr) {
        int maxR=-1;

        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            arr[i]=maxR;
            maxR=Math.max(maxR,curr);
        }
        return arr;
    }
}