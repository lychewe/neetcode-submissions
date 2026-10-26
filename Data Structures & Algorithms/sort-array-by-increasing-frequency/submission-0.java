class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Integer> mylist = new ArrayList<>();
        for(int x : nums) {
            mylist.add(x);
        }

        mylist.sort((a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if(freqA != freqB) {
                return freqA - freqB;
            }
            else {
                return b - a;
            }
        });

        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            answer[i] = mylist.get(i);
        }
        return answer;
    }
}