class Solution:
    def isValid(self, s: str) -> bool:
        mapped = dict()
        mapped[']'] = '['
        mapped['}'] = '{'
        mapped[')'] = '('
        stack = []

        for c in s:
            if c in mapped:
                if not stack or stack.pop() != mapped[c]:
                    return False
            else:
                stack.append(c)
        return not stack
        