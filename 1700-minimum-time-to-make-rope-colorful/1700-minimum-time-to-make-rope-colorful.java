class Solution {
    public int minCost(String colors, int[] neededTime) {
        int min_time=0;
        int prev_max=neededTime[0];
        for(int i=1;i<colors.length();i++){
            char curr_ch=colors.charAt(i);
            char prv_ch=colors.charAt(i-1);
            if(curr_ch!=prv_ch){
                prev_max=0;
            }
            min_time+=Math.min(prev_max,neededTime[i]);
            prev_max=Math.max(prev_max,neededTime[i]);
        }
        return min_time;
    }
}