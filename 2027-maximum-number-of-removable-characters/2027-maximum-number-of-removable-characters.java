class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int left=0;
        int right=removable.length-1;
        int k=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isSub(s,p,removable,mid)){
                k=Math.max(k,mid+1);
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return k;

    }
    boolean isSub(String s,String p,int []removable,int mid){
        int i=0;
        int j=0;
        // HashSet<Integer>set=new HashSet<>();
        // for(int z=0;z<=mid;z++){
        //     set.add(removable[z]);
        // }
        boolean[] flag=new boolean[s.length()];
        for(int z=0;z<=mid;z++)
        {
            flag[removable[z]]=true;
        }
        while(i<s.length()&&j<p.length()){
            if(flag[i]==true){
                i++;
                continue;
            }
            if(s.charAt(i)!=p.charAt(j)){
                i++;
                continue;
            }
            i++;
            j++;
        }
        
        if(j==p.length()) return true;
        return false;
    }
}