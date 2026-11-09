class Solution:
    
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        lo = 0
        hi = (len(matrix) * len(matrix[0])) - 1
        cols = len(matrix[0])
        while lo <= hi:
            mid = (lo + hi) // 2
            if matrix[mid // cols][mid % cols] == target:
                return True
            elif matrix[mid//cols][mid % cols] < target:
                lo = mid + 1
            elif matrix[mid//cols][mid%cols] > target:
                hi = mid  - 1
        return False


        