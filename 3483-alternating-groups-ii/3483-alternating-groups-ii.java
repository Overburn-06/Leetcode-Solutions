class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int []ncolors=new int[colors.length*2];
        int j=0;
        for(int i=0;i<ncolors.length;i++){
            ncolors[i]=colors[j++];
            if(j>colors.length-1){
                j=0;
            }
        }
        int count=0;
        int left=0;
        int right=1;
        while(left<colors.length){
           if(ncolors[right]==ncolors[right-1]){
            left=right;
            right++;
            continue;
           }
           if(right-left+1==k){
            left++;
            count++;
           }
           right++;
        }
        return count;
        
    }
}