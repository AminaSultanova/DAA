# Merge Two Sorted Lists

## Problem
Merge two sorted linked lists into one sorted linked list and return its head.

## How it works
I used a two-pointer iterative approach with a dummy node:
1. Create a dummy node to easily build the new list.
2. Compare values of list1 and list2.
3. Append the smaller node to current.next and move that list's pointer forward.
4. Once one list becomes empty, attach the rest of the other list directly.
5. Return dummy.next.

## Step-by-Step Trace
- Input: list1 = [1, 2, 4], list2 = [1, 3, 4]
- Init: dummy = 0, current at dummy

1. Compare 1 and 1: pick from list1. Merged: 0 -> 1
2. Compare 2 and 1: pick from list2. Merged: 0 -> 1 -> 1
3. Compare 2 and 3: pick from list1. Merged: 0 -> 1 -> 1 -> 2
4. Compare 4 and 3: pick from list2. Merged: 0 -> 1 -> 1 -> 2 -> 3
5. Compare 4 and 4: pick from list1. Merged: 0 -> 1 -> 1 -> 2 -> 3 -> 4
6. list1 is empty. Append remaining list2 (4).

Final result: 1 -> 1 -> 2 -> 3 -> 4 -> 4

## Complexity
- Time Complexity: O(n + m) - we go through both lists once.
- Space Complexity: O(1) - we only rearrange existing nodes.