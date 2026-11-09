# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        currP = p
        currQ = q
        def dfsComp(currP, currQ) -> bool:
            if not currQ and not currP:
                return True
            if (not currP and currQ) or (currP and not currQ):
                return False
            if currP and currQ and currP.val != currQ.val:
                return False
            return dfsComp(currP.left,currQ.left) and dfsComp(currP.right,currQ.right)
        return dfsComp(currP,currQ)