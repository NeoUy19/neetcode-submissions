class Solution:
    def countSubstrings(self, s: str) -> int:
        palCount = 0
        
        for i in range(len(s)):#odd
            leftPtr = i
            rightPtr = i
            leftPtr2 = i
            rightPtr2 = i + 1
            while(0 <= leftPtr < len(s) and 0 <= rightPtr < len(s) and s[leftPtr] == s[rightPtr]):
                leftPtr -= 1
                rightPtr +=1
                palCount += 1
            while(0 <= leftPtr2 < len(s) and 0 <= rightPtr2 < len(s) and s[leftPtr2] == s[rightPtr2]):
                leftPtr2 -= 1
                rightPtr2 +=1
                palCount += 1
            i += 1
        print(palCount)
        # for i in range(len(s)):#even
        #     leftPtr2 = i
        #     rightPtr2 = i + 1
        #     while(0 <= leftPtr2 < len(s) and 0 <= rightPtr2 < len(s) and s[leftPtr2] == s[rightPtr2]):
        #         leftPtr2 -= 1
        #         rightPtr2 +=1
        #         palCount += 1
        #     i += 1
        return palCount