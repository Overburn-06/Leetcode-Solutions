class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         int []res=new int[nums1.length];
         HashMap<Integer,Integer>map=new HashMap<>();
         Stack<Integer>st=new Stack<>();
         for(int i=nums2.length-1;i>=0;i--){
            int x=nums2[i];
            while(!st.isEmpty()&&st.peek()<=x){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(x,-1);  
            }
            else{
                map.put(x,st.peek());
            }
            st.push(x);
         }
         for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
         }
         return res;
    }
}