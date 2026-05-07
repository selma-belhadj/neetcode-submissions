class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indx = new int[2];
        HashMap<Integer, Integer> diffsmap = new HashMap<>();
        for (int i =0; i<nums.length; i++){
            if (diffsmap.containsKey(target - nums[i])){
                return new int[]{diffsmap.get(target - nums[i]), i};
                 
            } else {
                diffsmap.put(nums[i],i);
            }
        }
        return indx;
    }
}
