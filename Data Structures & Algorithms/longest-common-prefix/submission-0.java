class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        for(int j=0; j<strs[0].length();j++){
            char c = strs[0].charAt(j);
            for ( String s : strs) {
                if( j >= s.length() || s.charAt(j) != c){
                    return prefix.toString();
                }      
            } 
            prefix.append(c);
        }
        return prefix.toString();
        
    }
}