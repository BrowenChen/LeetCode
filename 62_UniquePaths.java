public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] fullMap = new int[m][n];
                
        if (m == 0 || n == 0) {
            return 1;
        }

        for (int i=0; i<m;i++) {
            fullMap[i][0] = 1;
        }
        for (int j=0; j<n;j++) {            
            fullMap[0][j] = 1;
        }
        
        for (int x=1; x<m; x++) {
            for (int y=1; y<n; y++) {
                fullMap[x][y] = fullMap[x-1][y] + fullMap[x][y-1];
            }
        }
        
        return fullMap[m-1][n-1];   
    }
}
