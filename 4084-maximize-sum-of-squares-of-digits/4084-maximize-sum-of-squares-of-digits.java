class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb=new StringBuilder();
        while(num!=0 && sum!=0){
            if(num==1 && sum>9) return "";
            if(sum<9){
                sb.append(sum);
                num--;
                sum=0;
            }else{
                sb.append("9");
                num--;
                sum-=9;
            }
        }
        if(num!=0 && sum==0){
            while(num!=0){
                sb.append("0");
                num--;
            }
        }
        return sb.toString();
    }
}