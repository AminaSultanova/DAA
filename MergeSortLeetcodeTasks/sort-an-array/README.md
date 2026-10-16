# Sort an Array

1. Problem
   Sort an array of integers in ascending order using Merge Sort.

Approach
1. Split the array in half repeatedly until pieces have only 1 element.
2. Recursively sort left and right halves.
3. Merge the sorted pieces back together into one sorted array using a temp array.

Tracing Example:
Input: nums = [5, 2, 3, 1]
- Split into [5, 2] and [3, 1]
- Split further into [5], [2], [3], [1]
- Merge [5] and [2] = [2, 5]
- Merge [3] and [1] = [1, 3]
- Merge [2, 5] and [1, 3] -> compare elements and put in temp array = [1, 2, 3, 5]

Final output: [1, 2, 3, 5]

Challenges faced:
Calculating middle index as (left + right) / 2 can sometimes cause integer overflow. Using left + (right - left) / 2 fixes this.

3. Time & Space Complexity
- Time: O(n log n) - dividing takes log n levels and merging takes O(n) time at each level.
- Space: O(n)- we need an extra temporary array to merge elements.