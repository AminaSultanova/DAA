# First Bad Version Analysis

## 1. Problem
You have n versions `[1, 2, ..., n]` and need to find the first bad version using the provided API function `isBadVersion(version)`. All versions after the first bad version are also bad.

## 2. Approach
I used Binary Search to find the boundary between good and bad versions:
1. Set the search bounds: `left = 1` and `right = n`.
2. Preventing integer overflow: `mid = left + (right - left) / 2`.
3. Call `isBadVersion(mid)`:
    - If `true`, `mid` is bad, but it might be the very first one. Keep `mid` in range by setting `right = mid`.
    - If `false`, `mid` is good, so the first bad version must be strictly to the right. Set `left = mid + 1`.
4. Stop when `left == right` and return `left`.

## 3. Time Complexity
**Time Complexity:** O(log n)
- **Worst & Average Case: O(log n):** On every iteration, the algorithm divides the range of versions `[left, right]` in half. Instead of checking versions one by one , we reduce the search space exponentially. The maximum number of calls to `isBadVersion()` is log_2(n). 
- **Best Case: O(1):** If n = 1, the loop condition `left < right` immediately fails and the algorithm returns in 1 step without running the loop.

## 4. Space Complexity
**Space Complexity:** O(1). Algorithm only uses three integer variables (`left`, `right`, and `mid`). Memory consumption remains constant no matter how large n is.

## 5. Reflection / Improvement
- **Can it be improved?** No, O(log n) time is the optimal complexity because we cannot find the exact transition point with fewer API calls.
