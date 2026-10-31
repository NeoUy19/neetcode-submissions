# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        curr1 = list1
        curr2 = list2
        if not list1:
            return list2
        if not list2:
            return list1
        resultList = ListNode()
        curr3 = resultList
        if (curr1.val <= curr2.val):
            resultList = curr1
        else:
            resultList = curr2
        while curr1 and curr2:
            if (curr1.val <= curr2.val):
                curr3.next = curr1
                curr1 = curr1.next
                curr3 = curr3.next
            elif(curr1.val > curr2.val):
                curr3.next = curr2
                curr2 = curr2.next
                curr3 = curr3.next
        if not curr1 or not curr2:
            if not curr1:
                curr3.next = curr2
            else:
                curr3.next = curr1
        return resultList