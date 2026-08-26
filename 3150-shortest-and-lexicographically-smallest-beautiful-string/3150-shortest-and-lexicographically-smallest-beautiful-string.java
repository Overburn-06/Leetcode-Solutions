class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int count=0;
        int left=0;
        int right=0;
        StringBuilder sb=new StringBuilder();
        while(right<s.length()){
            if(s.charAt(right)=='1')count++;
            while(count==k){
                if(sb.length()==0 || sb.length()>right-left+1){ 
                    sb=new StringBuilder(); 
                    for(int i=left;i<=right;i++){ 
                        sb.append(s.charAt(i)); 
                    } 
                } else if(sb.length()==right-left+1){ 
                    StringBuilder temp=new StringBuilder(); 
                    for(int i=left;i<=right;i++){ 
                        temp.append(s.charAt(i)); 
                    }
                    int j=0; 
                    while(j<sb.length() && temp.charAt(j)==sb.charAt(j)){ 
                        j++; 
                    } 
                    if((j<temp.length()) && (temp.charAt(j)=='0' && sb.charAt(j)=='1')){ 
                        sb=new StringBuilder(); 
                        sb.append(temp); 
                    }
                }
                if(s.charAt(left)=='1'){
                    count--;
                }
                left++;
            }
            
            right++;
        }
        return sb.toString();
    }
}