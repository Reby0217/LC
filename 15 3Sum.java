class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // avoid duplicate first element in the triplet
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int lo = i + 1;
            int hi = nums.length - 1;
            while (lo < hi) {
                int threeSum = nums[i] + nums[lo] + nums[hi];
                if (threeSum < 0) {
                    lo++;
                } else if (threeSum > 0) {
                    hi--;
                } else {
                    triplets.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    lo++;
                    //avoid duplicate second element in the triplet
                    while (nums[lo] == nums[lo-1] && lo < hi) {
                        lo++;
                    }
                }
            }
        }
        return triplets;
        
    }
}