class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i = 0;
        while (i < intervals.length && newInterval[0] > intervals[i][1]) {
            i++;
        }
        int start = i;

        while (i < intervals.length && newInterval[1] >= intervals[i][0]) {
            i++;
        }

        int end = i;
        int count = 0;
        int[][] finalIntervals = new int[intervals.length - end + start + 1][];

        for (count = 0; count < start; count++) {
            int[] interval = new int[2];
            interval[0] = intervals[count][0];
            interval[1] = intervals[count][1];
            finalIntervals[count] = interval;
        }

        if (start == end) {
            int[] interval = new int[2];
            interval[0] = newInterval[0];
            interval[1] = newInterval[1];
            finalIntervals[count++] = interval;
        } else {
            int[] mergedInterval = new int[2];
            mergedInterval[0] = Math.min(newInterval[0], intervals[start][0]);
            mergedInterval[1] = Math.max(newInterval[1], intervals[end - 1][1]);
            finalIntervals[count++] = mergedInterval;
        }

        for (int j = end; j < intervals.length; j++) {
            int[] interval = new int[2];
            interval[0] = intervals[j][0];
            interval[1] = intervals[j][1];
            finalIntervals[count++] = interval;
        }

        return finalIntervals;
    }
}