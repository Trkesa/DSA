class Solution {
    public int removeElement(int[] nums, int val) {
        int s=-1;
        int f=0;
        int count=0;
        while(f<nums.length && s<nums.length)
        {
            if(nums[f]==val)
            {
                f++;
            }
            else
            {
                s=s+1;
                nums[s]=nums[f];
                f++;
                count++;
            }
        }
        return count;
    }
}