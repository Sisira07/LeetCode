class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] sstr=new int[26];

        for(char ch:s.toCharArray()){
            sstr[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            if(sstr[ch-'a']!=0){
                sstr[ch-'a']--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}