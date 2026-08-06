class Solution {
    public String compressedString(String word) {
        String comp="";
        for(int i=0;i<word.length();){
            char ch=word.charAt(i);
            int count=0;
            while(word.charAt(i)==ch){
                count++;
                i+=1;
                if(count>=9){
                    comp+=9;
                    comp+=ch;
                    count=0;
                }
                if(i>=word.length()) break;
            }
            if(count!=0){
                comp+=count;
                comp+=ch;
            }
           
        }
        return comp;
        
    }
}