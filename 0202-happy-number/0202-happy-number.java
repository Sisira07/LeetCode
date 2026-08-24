class Solution {

    public boolean isHappy(int n) {
        HashSet<Integer> nums=new HashSet<>();
        int sum=0;

        while(n!=1 && !nums.contains(n)){
               nums.add(sum);
            sum=0;
            while(n>0){
            int dig=n%10;
            sum+=dig*dig;
            n=n/10;
            }
            n=sum;
        }
        return n==1;
    }
}