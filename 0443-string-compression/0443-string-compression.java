class Solution {
    public int compress(char[] chars) {
        String s="";
        int i=0;
        while(i<chars.length){
            int j=i;
            int count=0;
            while(j<chars.length && chars[i]==chars[j]){
                count++;
                j++;
            }
            
            s=s+chars[i];
            if(count>1){
                s=s+count;
            }
            for(int z=0;z<s.length();z++){
            chars[z]=s.charAt(z);
        }
            i=j;

        }
        // chars=new char[s.length()];
        // for(int z=0;z<s.length();z++){
        //     chars[z]=s.charAt(z);
        // }
        return s.length();

    }
}