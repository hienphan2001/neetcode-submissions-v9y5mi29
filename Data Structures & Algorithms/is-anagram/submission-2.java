class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> dic_1 = new HashMap<>(s.length());
        HashMap<Character, Integer> dic_2 = new HashMap<>(t.length());

        for (int i = 0; i < s.length(); i++) {
            if (!dic_1.containsKey(s.charAt(i))) {
                dic_1.put(s.charAt(i), 1);
            } else 
                dic_1.put(s.charAt(i), dic_1.get(s.charAt(i)) + 1);
        }

        for (int j = 0; j < t.length(); j++) {
            if (!dic_2.containsKey(t.charAt(j))) {
                dic_2.put(t.charAt(j), 1);
            } else 
                dic_2.put(t.charAt(j), dic_2.get(t.charAt(j)) + 1);
        }

        if (dic_1.equals(dic_2)) {
            return true;
        } else return false;
    }
}
