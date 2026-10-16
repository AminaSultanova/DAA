# Sort List

1. Problem:
   Given the head of a linked list, sort the list in ascending order.

Approach
1. Base case: If list is empty or has 1 node, return it.
2. Split list in half using slow and fast pointers.
3. Recursively sort left and right halves.
4. Merge two sorted halves together using a dummy node.

Tracing Example:
Input: 4 -> 2 -> 1 -> 3

- Split into two halves: 4 -> 2 and 1 -> 3
- Split further into single nodes: 4, 2, 1, 3
- Merge 4 and 2 = 2 -> 4
- Merge 1 and 3 = 1 -> 3
- Merge (2 -> 4) and (1 -> 3):
  Compare 2 and 1: pick 1
  Compare 2 and 3: pick 2
  Compare 4 and 3: pick 3
  Pick remaining 4

Final Output: 1 -> 2 -> 3 -> 4

Challenges Faced:
Splitting the linked list requires cutting the link between halves by setting prev.next = null. If we forget it infinite recursive calls will occur.

3. Time, Space Complexity
- Time: O(n log n) - splitting takes log n levels and merging takes O(n) steps at each level.
- Space: O(log n) - stack memory used by recursive calls.