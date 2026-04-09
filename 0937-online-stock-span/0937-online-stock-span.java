class StockSpanner {
    ArrayList<Integer>arr;
    public StockSpanner() {
      this.arr=new ArrayList<>();
    }
    
    public int next(int price) {
        arr.add(price);
        int res=0;
        int i=arr.size()-1;
        int st=price;
        while(i>=0){
            if(st<arr.get(i)){
                return res;
            }
            res++;
            i--;
        }
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */