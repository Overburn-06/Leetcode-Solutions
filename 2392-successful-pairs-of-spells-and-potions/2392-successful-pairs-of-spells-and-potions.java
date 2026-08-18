class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int []res=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int left=0;
            int right=potions.length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if((long)potions[mid]*spells[i]>=success){
                    right=mid-1;
                }else if((long)potions[mid]*spells[i]<success){
                    left=mid+1;
                }
            } 
            res[i]=potions.length-left;
        }
        return res;
    }
}