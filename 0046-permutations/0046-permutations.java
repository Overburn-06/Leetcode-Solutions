// class Solution {
//     static void permu(int len,int []nums,ArrayList<Integer>arr,List<List<Integer>>res,boolean[]freq){
//         if(arr.size()==len){
//             res.add(new ArrayList<>(arr));
//             return;
//         }
//         for(int i=0;i<len;i++){
//             if(!freq[i]){
//                 freq[i]=true;
//                 arr.add(nums[i]);
//                 permu(len,nums,arr,res,freq);
//                 arr.remove(arr.size()-1);
//                 freq[i]=false;
//             }
//         }
//     }
//     public List<List<Integer>> permute(int[] nums) {
//         ArrayList<Integer>arr=new ArrayList<>();
//         List<List<Integer>>res=new ArrayList<>();
//         int len=nums.length;
//         boolean []freq=new boolean[len];
//         permu(len,nums,arr,res,freq);
//         return res;
//     }
// }

class Solution {
    static void permu(int ind,int len,int []nums,List<List<Integer>>res){
        if(ind==len){
            ArrayList<Integer>arr=new ArrayList<>();
            for(int i=0;i<len;i++){
                arr.add(nums[i]);
            }
            res.add(new ArrayList<>(arr));
        }
        for(int i=ind;i<len;i++){
            swap(nums,i,ind);
            permu(ind+1,len,nums,res);
            swap(nums,i,ind);
        }
    }
        static void swap(int []nums,int first,int second){
            int temp=nums[first];
            nums[first]=nums[second];
            nums[second]=temp;
        }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        int len=nums.length;
        permu(0,len,nums,res);
        return res;
    }
}