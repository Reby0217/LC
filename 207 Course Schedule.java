class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] adj = new List[numCourses];
        int[] indegree = new int[numCourses];
        List<Integer> ans = new ArrayList<>();

        for (int[] pair: prerequisites) {
            int course = pair[0];
            int pre = pair[1];
            if (adj[pre] == null) {
                adj[pre] = new ArrayList<>();
            }
            adj[pre].add(course);
            indegree[course]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        while(!q.isEmpty()) {
            int curr = q.poll();
            ans.add(curr);
            if (adj[curr] != null) {
                for (int next: adj[curr]) {
                    indegree[next]--;
                    if (indegree[next] == 0) {
                        q.offer(next);
                    }
                }
            }
        }
        return ans.size() == numCourses;
        
    }
}