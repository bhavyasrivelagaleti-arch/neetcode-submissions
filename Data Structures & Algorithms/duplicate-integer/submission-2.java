class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean b=false;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                b=true;
            }
        }
        return b;
    }
}