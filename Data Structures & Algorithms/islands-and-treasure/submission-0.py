class Solution:
   
    def islandsAndTreasure(self, grid: List[List[int]]) -> None:
        #Approach: find the treasure chests first (0) and traverse all directions setting the amount of steps it takes from the closest treasure chest. If the value is -1 cut that direction off. Ensure bounds of the grid.
        ROWS = len(grid)
        COLS = len(grid[0])
        q = deque()
        for row in range(len(grid)):
            for col in range(len(grid[row])):
                if grid[row][col] == 0:
                    q.append((row,col))
        dist = 0
        directions = [(1,0), (-1,0), (0,1), (0,-1)]
        while q:
            dist += 1
            size = len(q)
            for i in range(size):
                row,col = q.popleft()
                for dr, dc in directions:
                    nr, nc = row + dr, col + dc
                    if 0 <= nr < ROWS and 0 <= nc < COLS and grid[nr][nc] == 2147483647:
                        grid[nr][nc] = dist
                        q.append((nr,nc))       
            

