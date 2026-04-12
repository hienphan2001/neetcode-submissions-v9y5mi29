class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r=s.length() - 1;

        while (l < r) {
            // while (l < r && !isAlphanumerical(s.charAt(l))) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            // while (r>l && !isAlphanumerical(s.charAt(r))) {
            while (r > l && !Character.isLetterOrDigit(s.charAt(r))) {

                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;

            l++; 
            r--;
        }

        return true;
    }

    private boolean isAlphanumerical(char c) {
        return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9');
    }
}
