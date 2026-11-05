class Solution:
    def maxDifference(self, s: str) -> int:
        mapped = {}
        for i in range(len(s)):
            mapped[s[i]] = mapped.get(s[i], 0 ) + 1
        a1 = 0;
        a2 = float('inf');
        for key in mapped:
            if (a1 < mapped[key] and mapped[key]%2 == 1):
                a1 = mapped.get(key)
            if (a2 > mapped[key] and mapped[key]%2 == 0):
                a2 = mapped.get(key)
        return a1-a2