class Pair{
    int position;
    int index;
    Pair(int position,int index){
        this.position=position;
        this.index=index;
    }
}
class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        ArrayList<Pair>list=new ArrayList<>();
        for(int i=0;i<positions.length;i++){
            list.add(new Pair(positions[i],i));
        }
        list.sort((a, b) -> Integer.compare(a.position, b.position));
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<positions.length;i++){
            int curr_idx=list.get(i).index;
            if(directions.charAt(curr_idx)=='R'){
                st.push(curr_idx);
            }else{
                while(!st.isEmpty() && healths[curr_idx]>0){
                    int top=st.peek();
                    st.pop();
                    if(healths[curr_idx]<healths[top]){
                        healths[curr_idx]=0;
                        healths[top]-=1;
                        st.push(top);
                    }else if(healths[curr_idx]>healths[top]){
                        healths[curr_idx]-=1;
                        healths[top]=0;
                    }else{
                        healths[curr_idx]=0;
                        healths[top]=0;
                    }
                }
            }
        }
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<healths.length;i++){
            if(healths[i]>0){
                res.add(healths[i]);
            }
        }
        return res;
    }
}