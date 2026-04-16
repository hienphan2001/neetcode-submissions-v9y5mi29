class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charsOrigin = s.toCharArray();
        char[] charsCheck = t.toCharArray();
        Arrays.sort(charsOrigin);
        Arrays.sort(charsCheck);

        String origin = String.valueOf(charsOrigin);
        String check = String.valueOf(charsCheck);

        return origin.equals(check);

        
    }
}
