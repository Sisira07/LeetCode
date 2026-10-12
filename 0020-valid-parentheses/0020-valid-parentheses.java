class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char sym=s.charAt(i);
            if(sym=='('||sym=='['||sym=='{'){
                stk.push(sym);
            }
            else{
                if(stk.empty()) return false;
                Character top=stk.pop();
                if(sym==')' && top!='(') return false;
                if(sym==']' && top!='[') return false;
                if(sym=='}' && top!='{') return false;
            }
        }
        return stk.isEmpty();
    }
}