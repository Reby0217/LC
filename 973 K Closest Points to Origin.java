class Solution {
    public int[][] kClosest(int[][] points, int k) {
        if (k == points.length) {
            return points;
        }

        // put the farest point at the front
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> (b[0]*b[0]+ b[1]*b[1]) - (a[0]*a[0]+ a[1]*a[1]));
        
        for (int[] p : points) {
            pq.add(p);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.toArray(new int[0][0]);
        
    }
}