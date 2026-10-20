class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for(int n : nums) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
            if(counts.get(n) > 1) {
                return true;
                }
            }
        return false;
    }
}