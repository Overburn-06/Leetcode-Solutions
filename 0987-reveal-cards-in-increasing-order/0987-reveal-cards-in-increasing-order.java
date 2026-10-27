class Solution {
    public int[] deckRevealedIncreasing(int[] deck){
        Arrays.sort(deck);
        int []res=new int[deck.length];
        int j=0;
        int i=0;
        boolean skip=false;
        while(i<deck.length){
            if(res[j]==0){
                if(skip==false){
                    res[j]=deck[i];
                    i++;
                }
                skip=!skip;
            }
            j=((j+1)%deck.length);
        }
        return res;       
    }
}