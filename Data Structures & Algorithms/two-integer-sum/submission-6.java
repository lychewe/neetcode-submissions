class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> vals = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(vals.containsKey(difference)) {
                if(vals.get(difference) < i) {
                    return new int[] {vals.get(difference), i};
                }
                else {
                    return new int[] {i, vals.get(difference)};
                }
            }
            vals.put(nums[i], i);
        }
        return new int[] {};
    }
}
