package juyoungoh.leetcode;

public class _200_NumberOfIslands {

    public static void main(String[] args) {
        _200_NumberOfIslands solution = new _200_NumberOfIslands();

        // 입력 2차원 배열 초기화
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '1'}
        };

        // 섬의 개수 출력
        int result = solution.numIslands(grid);
        System.out.println("Number of islands: " + result);
    }

    public void dfs(int i, int j, char[][] grid) {
        // 현재 위치가 그리드 밖이거나, 물(0)인 경우 종료
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        // 한 번만 탐색하기 위해 탐색한 지점은 물(0)으로 변경
        grid[i][j] = '0';

        // 동서남북 재귀 DFS
        dfs(i, j + 1, grid); // 동
        dfs(i, j - 1, grid); // 서
        dfs(i + 1, j, grid); // 남
        dfs(i - 1, j, grid); // 북
    }

    public int numIslands(char[][] grid) {
        int count = 0;
        // 행렬을 모두 탐색
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // 만약 육지(1)인 경우 DFS 시작
                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    // 재귀 DFS 가 모두 끝나면 섬 하나가 완성됐으므로 +1
                    count++;
                }
            }
        }
        // 섬의 개수 리턴
        return count;
    }
}
