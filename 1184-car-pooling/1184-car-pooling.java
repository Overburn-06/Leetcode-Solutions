class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
         int[] curr_capacity=new int[1001];
         for(int i=0;i<trips.length;i++){
            int cap=trips[i][0];
            int start=trips[i][1];
            int stop=trips[i][2];
            curr_capacity[start]+=cap;
            curr_capacity[stop]-=cap;
        }
        int sum_cap=0;
        for(int i:curr_capacity){
            sum_cap+=i;
            if(sum_cap>capacity){
                return false;
            }
        }
        return true;
    }
}