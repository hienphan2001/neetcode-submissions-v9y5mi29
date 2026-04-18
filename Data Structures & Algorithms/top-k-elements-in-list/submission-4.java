class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }


        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int idxResult = 0;
        for (int i = freq.length-1; i>0 && idxResult < k; i--) {
            for (int n : freq[i]) {
                result[idxResult++] = n;
                if (idxResult == k) 
                    return result;
            }
        }

        return result;
    }
}
