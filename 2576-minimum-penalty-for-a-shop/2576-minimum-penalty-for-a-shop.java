class Solution {
    public int bestClosingTime(String customers) {
        // int prefix[]=new int[customers.length()];
        int count_n=0;
        int count=0;
        int count_y=0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                count+=1;
            }
            // else{
            //     count_n++;
            // }
            // prefix[i]=count;
        }

        int s=customers.length();

        if(count==0) return 0;
       
        count_n=0;
        count_y=count;
        int min=count_y;
        int index=0;

        for(int i=0;i<s;i++){
           
            if(customers.charAt(i)=='N'){
                count_n++;
            }else{
                count_y--;
            }
            int m=count_y+count_n;
            if(m<min){
                min=m;
                index=i+1;
            }
            
        }
        return index;
    }
}