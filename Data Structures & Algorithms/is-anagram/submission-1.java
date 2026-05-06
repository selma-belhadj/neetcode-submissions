class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()){
            HashMap<Character, Integer> smap = new HashMap<>();
            HashMap<Character, Integer> tmap = new HashMap<>();

                for (int i =0; i<s.length(); i++) {
                    smap.merge(s.charAt(i), 1, Integer::sum);
                    tmap.merge(t.charAt(i), 1, Integer::sum);
                    }

                for (Character str : smap.keySet()) {
                    if(!smap.get(str).equals(tmap.get(str))) {
                        return false;
                    }
                }
                return true;
        }
        return false;
    }

}
