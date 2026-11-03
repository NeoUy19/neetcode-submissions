class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxLen = 0
        currLen = 0
        leftPtr = 0
        seen = set()
        for i in range(len(s)):
            while s[i] in seen:
                seen.remove(s[leftPtr])
                leftPtr += 1
            seen.add(s[i])
            maxLen = max(maxLen, i - leftPtr + 1)
        return maxLen

