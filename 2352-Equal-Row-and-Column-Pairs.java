class Solution {
    public int equalPairs(int[][] grid) {
        Map<Integer, Integer> rowHashMap = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            int rowHashKey = getRowHash(grid[i]);

            rowHashMap.put(rowHashKey, rowHashMap.getOrDefault(rowHashKey, 0) + 1);
        }

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            int colHashKey = getColHash(grid, i);

            count += rowHashMap.getOrDefault(colHashKey, 0);
        }

        return count;
    }

    private int getRowHash(int[] row) {
        int result = 0;

        for (int num : row) {
            result = num + result * 7;
        }

        return result;
    }

    private int getColHash(int[][] grid, int col) {
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            result = grid[i][col] + result * 7;
        }

        return result;
    }
}