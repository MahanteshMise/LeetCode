class Solution {
    public int pivotIndexFunc(int []nums,int l,int r){
        while(l<r){
            int mid = l + (r-l)/2;
            if(nums[mid]>nums[r]){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        return r;
    }
    public int customBinarySearch(int l,int r,int target,int[] nums){
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>target){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int l = 0 , r = nums.length-1;
        int pivotIndex = pivotIndexFunc(nums,l,r);
        int index =-3;
        int leftResult = customBinarySearch(0,pivotIndex-1,target,nums);
        if(leftResult != -1) return leftResult; else index = -1;
        int rightResult = customBinarySearch(pivotIndex,nums.length-1,target,nums);
        if(rightResult != -1) return rightResult; else index = -1;
        return index;
    }
}