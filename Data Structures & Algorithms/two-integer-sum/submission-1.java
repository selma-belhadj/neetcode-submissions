class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indx = new int[2];
        for (int i =0; i<nums.length-1; i++){
            for (int j =1; j<nums.length; j++){
                if (nums[i] + nums[j] == target && i != j){
                    if (i>j){
                        indx[0]=j;
                        indx[1]=i;
                    } else {
                        indx[0]=i;
                        indx[1]=j;
                    }
                     
                }
            }
        }
        return indx;
        
    }
}
