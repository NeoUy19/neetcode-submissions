class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        newString = ""
        lenOfShortest = 100000
        for word in strs:
            if len(word) < lenOfShortest:
                lenOfShortest = len(word)
        for i in range(lenOfShortest):
            currChar = strs[0][i]
            for word in strs:
                if word[i] != currChar:
                    return newString
            newString += currChar


        return newString