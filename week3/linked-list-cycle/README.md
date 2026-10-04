# Linked List Cycle

## Problem
Check if a linked list contains a cycle (a loop where a node points back to a previous node).

## How it works
I used Floyd's Cycle Detection algorithm (Fast and Slow pointers):
1. Set two pointers (slow and fast) at the head.
2. Move slow by 1 step and fast by 2 steps in a loop.
3. If there is a cycle, fast will eventually catch up to slow (slow == fast).
4. If fast reaches null, there is no cycle.

## Step-by-Step Trace
- Input: 3 -> 2 -> 0 -> -4 (where -4 points back to 2)

- Start: slow = 3, fast = 3
- Step 1: slow goes to 2, fast goes to 0. No match.
- Step 2: slow goes to 0, fast goes to 2 (loops back). No match.
- Step 3: slow goes to -4, fast goes to -4. Match found!

Result: true (cycle detected).

## Complexity
- Time Complexity: O(n) -a in the worst case, we traverse the list a few times.
- Space Complexity: O(1) - we only use two pointer variables.