class Solution {
    public int findDuplicate(int[] nums) {

        //Initially they can be zero so we are moving slow and fast pointer ahead.
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }
}