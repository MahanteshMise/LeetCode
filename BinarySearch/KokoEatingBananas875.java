class Solution {
    public int maxOfGivenArray(int [] piles){
        int maxVal = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            maxVal = Math.max(maxVal, piles[i]);
        }
        return maxVal;
    }
    public int calculateTotalHours(int [] piles,int mid){
        int totalH = 0;
        for(int i=0;i<piles.length;i++){
            totalH += Math.ceil((double)(piles[i])/((double)(mid)));
        }
        return totalH;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = maxOfGivenArray(piles);
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            int totalH = calculateTotalHours(piles,mid);
            if(totalH<=h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}