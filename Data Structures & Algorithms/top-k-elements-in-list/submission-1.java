class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            if (!hm.containsKey(num))
                hm.put(num, 0);

            hm.put(num, hm.get(num) + 1);
        }

        int[] result = new int[k];
        for (int i = 0; i<k; i++) {
            int max = Collections.max(hm.values());
            Iterator<Map.Entry<Integer, Integer>> iterator = hm.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = iterator.next();

                if (entry.getValue().equals(max)) {
                    result[i] = entry.getKey();
                    iterator.remove();
                    break;
                }
            }
        }

        return result;
    }
}
