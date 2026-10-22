class StockSpanner {
    Stack<int[]> stk;
    int day;
    
    public StockSpanner(){
        stk=new Stack<>();
        day=0;
    }
    
    public int next(int price) {
        while(!stk.empty() && stk.peek()[0]<=price){
            stk.pop();
        }
        int span;
        if(stk.empty()){
            span=day+1;
        }
        else{
            span=day-stk.peek()[1];
        }
        stk.push(new int[]{price,day});
        day++;
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */