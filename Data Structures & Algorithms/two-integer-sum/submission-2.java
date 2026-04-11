class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(nums.length);
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            Integer diff = target - nums[i];

            if (hashMap.containsKey(diff)) {
                result[0] = hashMap.get(diff);
                result[1] = i;
                return result;
            }

            hashMap.put(nums[i], i);
        }
        return result;
    }
}
