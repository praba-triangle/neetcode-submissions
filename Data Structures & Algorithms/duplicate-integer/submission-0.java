class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int num : nums){
            if (integerArrayList.contains(num))
                return true;
            else
                integerArrayList.add(num);
        }
        return false;
    }
}
