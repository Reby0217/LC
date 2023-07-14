class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
        
    }
}


class Solution {
    public int majorityElement(int[] nums) {
        int target = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                target = nums[i];
                count = 1;
            } else if (nums[i] == target) {
                count++;
            } else {
                count--;
            }
        }
        return target;
    }
}