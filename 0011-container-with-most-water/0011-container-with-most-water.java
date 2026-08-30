class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxAmt=Integer.MIN_VALUE;

        while(l<=r){
            int width=r-l;
            int h=Math.min(height[l],height[r]);
            maxAmt=Math.max(maxAmt,h*width);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return maxAmt;
    }
}