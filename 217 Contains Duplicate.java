class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hSet = new HashSet<>();
        for (int num : nums) {
            if (hSet.contains(num)) {
                return true;
            }
            hSet.add(num);
        }
        return false;
    }
}