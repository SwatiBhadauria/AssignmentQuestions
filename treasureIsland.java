 class treasureIsland {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int maxSum = 0;
        int rowIndex = -1;
        for (int i = 0; i < grid.length; i++) {
            int sum = 0;
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                rowIndex = i;
            }
        }
        System.out.println("Row " + rowIndex + " (sum=" + maxSum + ")");
    }
}
