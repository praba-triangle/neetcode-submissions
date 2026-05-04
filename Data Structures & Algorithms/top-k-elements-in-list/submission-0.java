class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> result = new HashMap();
        for (int num : nums) {
            if(result.containsKey(num))
                result.put(num, result.get(num) + 1);
            else
                result.put(num, 1);
        }


        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(result.entrySet());
        sortedEntries.sort((a, b) -> b.getValue() - a.getValue());

        // Extract top k keys
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = sortedEntries.get(i).getKey();
        }

        return res;
    }
}
