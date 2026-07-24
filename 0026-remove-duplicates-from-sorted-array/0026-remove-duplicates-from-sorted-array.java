// class Solution {
//     public int removeDuplicates(int[] nums) {
//         HashSet<Integer>set=new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             set.add(nums[i]);
//         }
//         int k=set.size();
//         int j=0;
//         for(int i=0;i<nums.length;i++){
//             if(set.contains(nums[i])){
//                 nums[j++]=nums[i];
//                 set.remove(nums[i]);
//             }
//         }
//         return k;
//     }
// }

class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[k]!=nums[i]){
                k++;
                nums[k]=nums[i];
            }
        }
        
        return k+1;
    }
}