class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        int min_need=Math.min(need1,need2);
        long min_cost=(long)min_need*Math.min((long)costBoth,(long)cost1+cost2);
        need1-=min_need;
        need2-=min_need;
        min_cost+=need1*Math.min((long)cost1,(long)costBoth)+need2*Math.min((long)cost2,(long)costBoth);
        return min_cost;
    }
}