class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        int maxLen=1;
        int i=0;
        int j=1;

       if(s.length()>1) mpp.put(s.charAt(0),0);
       else if(s.length()==1) return 1;
       else return 0;
        while(i<j && j<s.length()){
            char ch=s.charAt(j);
            if(mpp.containsKey(ch)){
                if(mpp.get(ch)>=i) i=mpp.get(ch)+1;
                mpp.put(ch,j);
                maxLen=Math.max(maxLen,j-i+1);
                j++;
            }
            else{
                mpp.put(ch,j);
                 maxLen=Math.max(maxLen,j-i+1);
                j++;
            }
        }
        return maxLen;
    }
}