class Pair{
    char c;
    int freq;
    public Pair(char c,int freq){
        this. c=c;
        this.freq=freq;
    }
}
class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Integer.compare(b.freq,a.freq));
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:map.keySet()){
            pq.offer(new Pair(ch,map.get(ch)));
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            int count=pq.peek().freq;
            char ch=pq.poll().c;
            while(count!=0){
                sb.append(ch);
                count--;
            }
        }
        return sb.toString();
    }
}