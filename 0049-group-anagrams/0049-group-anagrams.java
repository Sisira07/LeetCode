class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mpp=new HashMap<>();

        for(String str:strs){
            int[] freq=new int[26];
            for(int i=0;i<str.length();i++){
                freq[str.charAt(i)-'a']++;
            }
            String freqstr=Arrays.toString(freq);
            if(mpp.containsKey(freqstr)){
                mpp.get(freqstr).add(str);          
            }
            else{
                List<String> arr=new ArrayList<>();
                arr.add(str);
                mpp.put(freqstr,arr);
            }
        }
        List<List<String>> res=new ArrayList<>(mpp.values());
        return res;
    }
}