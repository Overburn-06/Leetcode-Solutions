class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int []copy=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        Arrays.sort(copy);
        int j=1;
        for(int i=0;i<copy.length;i++){
            if(map.containsKey(copy[i])){
                continue;
            }else{
                map.put(copy[i],j++);
            }
        }
        for(int i=0;i<arr.length;i++){
           copy[i]=map.get(arr[i]);
        }
        return copy;
    }
}