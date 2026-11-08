class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        String[] strs=paragraph.split("[!?',;. ]+");

        HashSet<String> set=new HashSet<>();

        for(String str:banned){
            set.add(str);
        }

        HashMap<String,Integer> freq=new HashMap<>();

        for(String str:strs){
            if(!str.isEmpty() && !set.contains(str)){
                freq.put(str,freq.getOrDefault(str,0)+1);
            }
        }

        int maxFreq=0;
        String ans="";

        for(String str:freq.keySet()){
            if(freq.get(str)>maxFreq){
                maxFreq=freq.get(str);
                ans=str;
            }
        }
        return ans;
    }
}