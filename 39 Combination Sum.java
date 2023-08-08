class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0) {
            return res;
        }
        backtrtack(candidates, 0, target, 0);
        return res;
        
    }

    LinkedList<Integer> track = new LinkedList<>();

    public void backtrtack(int[] candidates, int start, int target, int sum) {
        if (sum == target) {
            res.add(new LinkedList<>(track));
            return;
        }

        if (sum > target) {
            return;
        }

        for (int i = start; i< candidates.length; i++) {
            track.add(candidates[i]);
            sum += candidates[i];
            backtrtack(candidates, i, target, sum);
            sum -= candidates[i];
            track.removeLast();
        }
    }
}