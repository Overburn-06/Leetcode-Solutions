class Pair{
    int value;
    int index;
    Pair(int value,int index){
        this.value=value;
        this.index=index;
    }
}
class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int left=0;
        int res=0;
        PriorityQueue<Pair>max_heap=new PriorityQueue<>((a,b)->Integer.compare(b.value,a.value));
        PriorityQueue<Pair>min_heap=new PriorityQueue<>((a,b)->Integer.compare(a.value,b.value));
        for(int right=0;right<nums.length;right++){
            max_heap.offer(new Pair(nums[right],right));//will maintain max element of current window at top
            min_heap.offer(new Pair(nums[right],right));//will maintain min element of current window at top 
            while((!min_heap.isEmpty()&&!max_heap.isEmpty()) && Math.abs(max_heap.peek().value-min_heap.peek().value)>limit){ // will move left until max-min<=limit
                left=Math.min(min_heap.peek().index,max_heap.peek().index)+1;//will check for the min index to which we can jump as max can be first smaller index than min or min is at smaller index than max
                while(!min_heap.isEmpty() && min_heap.peek().index<left){//will remove all the indexes which are now not in current window and will update min
                    min_heap.poll();
                }
                while(!max_heap.isEmpty() && max_heap.peek().index<left){//will remove all the indexes which are now not in current window and will update max
                    max_heap.poll();
                }
            }
            res=Math.max(res,right-left+1);//stores max length
        }
        return res;
    }
}