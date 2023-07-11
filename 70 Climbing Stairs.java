class Solution {
    private int[] soln;
    public int climbStairs(int n) {
        soln = new int[n+1];
        return solve(n);
    }

    int solve(int n) {
        if (n <= 2) {
            return n;
        }
        if (soln[n] > 0) {
            return soln[n];
        }

        soln[n] = solve(n-1) + solve(n-2);
        return soln[n];


    }
}