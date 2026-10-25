class Solution:
    def isPalindrome(self, s: str) -> bool:
        leftPtr = 0
        rightPtr = len(s) - 1
        while (leftPtr < rightPtr):
            while leftPtr < rightPtr and not s[leftPtr].isalnum():
                leftPtr += 1
            while leftPtr < rightPtr and not s[rightPtr].isalnum():
                rightPtr -= 1
            if s[rightPtr].lower() != s[leftPtr].lower():
                return False
            else:
                rightPtr -= 1
                leftPtr += 1
        return True

        

