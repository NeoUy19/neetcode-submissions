class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        adjList = [[] for _ in range(numCourses)]
        totalPrereqs = [0] * numCourses
        for a, b in prerequisites: #create graph and its indegrees
            adjList[b].append(a)
            totalPrereqs[a] += 1
        
        classQ = deque()
        for course in range(numCourses): #build the queue
            if totalPrereqs[course] == 0:
                classQ.append(course)
        classOrder = []
        while classQ: #level order search pop the class decrement and add to the class order to the totalprereqs of the classes it unlocks and decrement. check if that class has anymore totalPrereqs if it doesnt, push to the queue.
            course = classQ.popleft()
            classOrder.append(course)
            for unlockedCourse in adjList[course]:
                totalPrereqs[unlockedCourse] -= 1
                if totalPrereqs[unlockedCourse] == 0:
                    classQ.append(unlockedCourse)
        return len(classOrder) == numCourses

