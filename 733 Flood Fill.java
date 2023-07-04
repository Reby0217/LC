class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        fill(image, sr, sc, oldColor, color);
        return image; 
    }

    public void fill(int[][] image, int x, int y, int oldColor, int newColor) {
        if (!inBound(image, x, y)) return;

        if (image[x][y] != oldColor) return;

        // already visited pixel
        if (image[x][y] == -1) return;

        // marked as visited
        image[x][y] = -1;

        fill(image, x+1, y, oldColor, newColor);
        fill(image, x-1, y, oldColor, newColor);
        fill(image, x, y+1, oldColor, newColor);
        fill(image, x, y-1, oldColor, newColor);

        image[x][y] = newColor;

    }

    public boolean inBound(int[][] image, int x, int y) {
        return x>=0 && x < image.length && y>=0 && y< image[0].length;
    }

}