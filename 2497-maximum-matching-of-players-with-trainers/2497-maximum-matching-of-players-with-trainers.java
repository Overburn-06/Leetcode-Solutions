class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int sum=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        while(i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                sum++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return sum;
    }
}