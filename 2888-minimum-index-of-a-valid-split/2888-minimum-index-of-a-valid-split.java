class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int min=0;
        int max_freq=0;
        int n=nums.size();
        int x=0;
        for(int i=0;i<n;i++){
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
            if(max_freq<map.get(nums.get(i))){
                max_freq=map.get(nums.get(i));
                x=nums.get(i);
            }
        }
        int f_x=0;
        for(int i=0;i<n;i++){
            if(nums.get(i)==x){
                f_x++;
            }
            if(f_x>(i+1)/2 && max_freq-f_x>(n-i-1)/2){
                return i;
            }

        }
        return -1;
    }
}