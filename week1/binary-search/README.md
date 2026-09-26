# Binary Search Analysis

## 1. Problem
Given a sorted array `nums` and an integer `target`, write a function to find `target`. Return its index if it exists, or `-1` if it is not in the array.

## 2. Approach
I used standard Binary Search:
1. Set two pointers: `left = 0` and `right = nums.length - 1`.
2. Calculate the middle index: `mid = left + (right - left) / 2` (this prevents integer overflow).
3. Compare `nums[mid]` with `target`:
    - If `nums[mid] == target`, return `mid`.
    - If `nums[mid] < target`, search the right half by setting `left = mid + 1`.
    - If `nums[mid] > target`, search the left half by setting `right = mid - 1`.
4. If `left > right`, the element is not in the array, so return `-1`.

## 3. Time Complexity
**Time Complexity:** O(log n)
- **Worst and Average Case: O(log n):** On every iteration the algorithm cuts the remaining search space in half. Starting with n elements, the search space shrinks as n, n/2, n/4, ... 1. The maximum number of steps to reduce the range to one element is log_2(n). For example, searching through 1000000 elements takes 20 comparisons.
- **Best Case: O(1):** If the target element is located exactly at the initial midpoint (`nums[mid]`), it is found on the very first try.

## 4. Space Complexity
**Space Complexity:** O(1)
- The algorithm works in-place and only uses a few variables (`left`, `right`, `mid`), so memory usage is constant.

## 5. Reflection / Improvement
**Can it be improved?** No, O(log n) is the optimal time complexity for searching in a sorted array.
