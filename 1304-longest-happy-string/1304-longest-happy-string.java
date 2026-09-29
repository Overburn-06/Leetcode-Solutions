class Pair{
    char ch;
    int freq;
    public Pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
}
class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb=new StringBuilder();
        PriorityQueue<Pair>maxh=new PriorityQueue<>((first,second)->(second.freq-first.freq));
        if(a>0) maxh.offer(new Pair('a',a));
        if(b>0) maxh.offer(new Pair('b',b));
        if(c>0) maxh.offer(new Pair('c',c));
        while(!maxh.isEmpty()){
            int curr_freq=maxh.peek().freq;
            char curr_ch=maxh.peek().ch;
            maxh.poll();
            if(sb.length()>=2 && sb.charAt(sb.length()-1)==curr_ch && sb.charAt(sb.length()-2)==curr_ch){
                if(maxh.isEmpty()) break;
                int next_freq=maxh.peek().freq;
                char next_ch=maxh.peek().ch;
                maxh.poll();
                sb.append(next_ch);
                next_freq--;
                if(next_freq!=0){
                    maxh.offer(new Pair(next_ch,next_freq));
                }
            }else{
                sb.append(curr_ch);
                curr_freq--;
            }
            if(curr_freq!=0){
                maxh.offer(new Pair(curr_ch,curr_freq));
            }
        }
        return sb.toString();
    }
}