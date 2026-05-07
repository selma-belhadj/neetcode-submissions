class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indx = new int[2];
        HashMap<Integer, Integer> diffsmap = new HashMap<>();
        int difference = target;
        for (int i =0; i<nums.length; i++){
            difference = target - nums[i];
            if (diffsmap.containsKey(difference)){
                int j = diffsmap.get(difference);
                if (i>j){
                    indx[0]=j;
                    indx[1]=i;
                } else {
                    indx[0]=i;
                    indx[1]=j;
                } 
            } else {
                diffsmap.put(nums[i],i);
            }
        }
        return indx;
    }
}
