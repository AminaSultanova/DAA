# Intersection of Two Linked Lists

1. Problem
   Find the node where two linked lists meet. Return null if they do not intersect.

2. Approach
   Use two pointers pA and pB starting at the heads. Move both step by step. When pA reaches the end, redirect it to headB. When pB reaches the end, redirect it to headA. They will meet at the intersection node.

Tracing Example:
List A: 1 -> 2 -> 3
List B: 4 -> 3
Intersection is node 3.

- pA goes: 1 -> 2 -> 3 -> null -> 4 -> 3
- pB goes: 4 -> 3 -> null -> 1 -> 2 -> 3
  Both hit node 3 at the same time.

Challenges Faced:
First tried using a HashSet to store nodes, but that used extra space. Two pointers solved it with O(1) memory.

3. Time & Space Complexity
- Time Complexity: O(n + m) — each pointer goes through both lists once.
- Space Complexity: O(1) — only two pointer variables used.

4. Reflection / Improvement
   This is already the most efficient solution.