class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        adjList = [[] for _ in range(numCourses)]
        totalPrereqs = [0] * numCourses

        for a, b in prerequisites:
            adjList[b].append(a)
            totalPrereqs[a] += 1
        
        classQueue = deque()
        for course in range(numCourses):
            if totalPrereqs[course] == 0:
                classQueue.append(course)
        
        classOrder = []
        while classQueue:
            currCourse = classQueue.popleft()
            classOrder.append(currCourse)
            for unlockedClass in adjList[currCourse] :
                totalPrereqs[unlockedClass] -= 1
                if totalPrereqs[unlockedClass] == 0:
                    classQueue.append(unlockedClass)
        if len(classOrder) == numCourses:
            return classOrder
        else:
            return []
            