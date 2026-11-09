# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:#iterative solution
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        nodeStack = [(p,q)]

        while nodeStack:
            a, b = nodeStack.pop()
            if not a and not b:
                continue
            if (not a and b) or (a and not b):
                return False
            if a.val != b.val:
                return False
            nodeStack.append((a.left,b.left))
            nodeStack.append((a.right, b.right))
        return True
