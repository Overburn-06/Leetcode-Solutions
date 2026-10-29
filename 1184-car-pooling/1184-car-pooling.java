class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int []interval=new int [1001];
        for(int i=0;i<trips.length;i++){
            int cap=trips[i][0];
            int start=trips[i][1];
            int end=trips[i][2];

            interval[start]+=cap;
            interval[end]-=cap;
        }
        int sum=0;
        for(int i:interval){
            sum+=i;
            if(sum>capacity){
                return false;
            }
        }
        return true;
    }
}