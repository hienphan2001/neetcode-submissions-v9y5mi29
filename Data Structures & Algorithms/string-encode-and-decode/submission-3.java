class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for (String s : strs) {
            result += String.valueOf(s.length()) + "#" + s;
        }

        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') 
                j++;

            int length = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            j = i + length;
            result.add(str.substring(i,j));
            i=j;
        }

        return result;
    }
}
