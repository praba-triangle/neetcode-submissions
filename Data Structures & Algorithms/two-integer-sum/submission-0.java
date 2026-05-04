class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hs = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            int req = target - nums[i];

            if (hs.containsKey(req)){
                return new int[] {hs.get(req), i};
            } else {
                hs.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
