class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        List<Integer> res=new ArrayList<>();

        for(int num1:nums1) set1.add(num1);
        for(int num2:nums2){
            if(set1.contains(num2) && !res.contains(num2)){
                res.add(num2);
            }
            set2.add(num2);
        }
        int[] op=new int[res.size()];
        for(int i=0;i<res.size();i++){
            op[i]=res.get(i);
        }
        return op;
    }
}