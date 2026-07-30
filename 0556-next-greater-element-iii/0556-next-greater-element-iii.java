class Solution {
    public int nextGreaterElement(int n) {
        char[] ch = String.valueOf(n).toCharArray();
        int i=ch.length-1;

        while(i>0){
            if(ch[i]>ch[i-1]){
                int j=ch.length-1;
                while(j>=i){
                    if(ch[j]>ch[i-1]){
                        char temp=ch[j];
                        ch[j]=ch[i-1];
                        ch[i-1]=temp;
                        break;
                    }
                    j--;
                }
                int z=i;
                int y=ch.length-1;
                while(z<y){
                    char temp=ch[y];
                    ch[y]=ch[z];
                    ch[z]=temp;
                    z++;
                    y--;
                }
                
                String ans=String.valueOf(ch);
                long value = Long.parseLong(ans);
                if (value > Integer.MAX_VALUE) {
                    return -1;
                }
                return (int)value;
            }
                i--;
        }
        
        return -1;
    }
}