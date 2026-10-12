# Remove Duplicates from Sorted List

1. Problem
   Delete duplicate numbers from a sorted linked list so each number appears once.

2. Approach
   Iterate through the list using a current pointer. If current.val equals current.next.val, skip current.next. Otherwise move current forward.

Tracing Example:
Input: 1 -> 1 -> 2 -> 3 -> 3
- Compare 1 and 1: skip second 1. List: 1 -> 2 -> 3 -> 3
- Compare 1 and 2: move to 2
- Compare 2 and 3: move to 3
- Compare 3 and 3: skip second 3. List: 1 -> 2 -> 3

Final Output: 1 -> 2 -> 3

Challenges Faced:
Moving current pointer forward every turn caused a bug when three same values were next to each other (like 1 -> 1 -> 1). Moving current only when no deletion happens fixed it.

3. Time & Space Complexity
- Time Complexity: O(n) — we visit each node once.
- Space Complexity: O(1) — no extra memory used.

4. Reflection / Improvement
   The solution is already optimal in both time and space.