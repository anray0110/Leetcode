class Solution {
    String exFromCenter(String s,int L,int R){
        while (L>=0 && R<s.length() && s.charAt(L)==s.charAt(R)){
            L--;R++;
        }
        return s.substring(L+1,R);
    }
    public String longestPalindrome(String str) {
        if (str == null || str.length()<1){
            return "";
        }   
        String longest = "" ;   
        for(int i = 0 ; i < str.length() ; i++ ){
            String odd = exFromCenter(str,i,i);
            String even = exFromCenter(str,i,i+1);
            String current = odd.length() > even.length()?odd:even;
            if (current.length() > longest.length()){
                longest=current;
            }
        }
        return longest;
    }
}