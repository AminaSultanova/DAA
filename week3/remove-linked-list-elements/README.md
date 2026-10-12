# Remove Linked List Elements

1. Problem
   Remove all nodes from a linked list that have a specific value.

2. Approach
   Use a dummy node before head. Loop through the list with a current pointer. If current.next.val equals target val, skip current.next. Otherwise move current forward.

Tracing Example:
Input: 1 -> 2 -> 6 -> 3, val = 6
Init: dummy -> 1 -> 2 -> 6 -> 3

- Check 1: keep
- Check 2: keep
- Check 6: skip 6. List becomes dummy -> 1 -> 2 -> 3
- Check 3: keep

Final Output: 1 -> 2 -> 3

Challenges Faced:
Deleting the head node without a dummy node required extra if-checks. Dummy node made handling all edge cases easy.

3. Time & Space Complexity
- Time Complexity: O(n) — we check every node once.
- Space Complexity: O(1) — only one dummy node and pointer used.

4. Reflection / Improvement
   O(n) time and O(1) space is optimal.