class TimeMap:

    def __init__(self):
       self.timeMap = {} #key = string, value=[List of lists[value,time stamp]]

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key not in self.timeMap:
            self.timeMap[key] = []
        self.timeMap[key].append([value,timestamp])

    def get(self, key: str, timestamp: int) -> str:
        res = ""
        values = self.timeMap.get(key,[])
        lo = 0
        hi = len(values) - 1
        while lo <= hi:
            mid = (lo+hi) // 2
            if values[mid][1] == timestamp:
                res = values[mid][0]
                return res
            if values[mid][1] < timestamp:
                res = values[mid][0]
                lo = mid + 1
            else:
                hi = mid - 1
        return res
