class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        result = []
        map = {}
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] in map:
                    result.append(grid[i][j])
                else:
                    map[grid[i][j]] = 1
        sortedMap = sorted(map)
        print(sortedMap)
        for i in range(1,len(grid) * len(grid[0]) + 1):
            if i not in map:
                result.append(i)
        return result