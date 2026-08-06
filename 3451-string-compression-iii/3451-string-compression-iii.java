class Solution {
    public String compressedString(String word) {
        StringBuilder comp=new StringBuilder();
        for(int i=0;i<word.length();){
            char ch=word.charAt(i);
            int count=0;
            while(word.charAt(i)==ch){
                count++;
                i+=1;
                if(count>=9){
                    comp.append(9);
                    comp.append(ch);
                    count=0;
                }
                if(i>=word.length()) break;
            }
            if(count!=0){
                comp.append(count);
                comp.append(ch);
            }
           
        }
        return comp.toString();
        
    }
}