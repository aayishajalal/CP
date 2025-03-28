<h2><a href="https://leetcode.com/problems/check-if-array-is-sorted-and-rotated">1878. Check if Array Is Sorted and Rotated</a></h2>
<h3>Easy</h3>
<hr>
<p>Given an array <code>nums</code>, return <code>true</code><em> if the array was originally sorted in non-decreasing order, then rotated <strong>some</strong> number of positions (including zero)</em>. Otherwise, return <code>false</code>.</p>

<p>There may be <strong>duplicates</strong> in the original array.</p>

<p><strong>Note:</strong> An array <code>A</code> rotated by <code>x</code> positions results in an array <code>B</code> of the same length such that <code>A[i] == B[(i+x) % A.length]</code>, where <code>%</code> is the modulo operation.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,4,5,1,2]
<strong>Output:</strong> true
<strong>Explanation:</strong> [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,1,3,4]
<strong>Output:</strong> false
<strong>Explanation:</strong> There is no sorted array once rotated that can make nums.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3]
<strong>Output:</strong> true
<strong>Explanation:</strong> [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 100</code></li>
	<li><code>1 &lt;= nums[i] &lt;= 100</code></li>
</ul>

<h1>Solution</h1>
<pre>
class Solution {
    public boolean check(int[] nums) {
        //with circular checks 
        int violations = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // curr < prev
            /*circular checks
              compares 0 and n-1 --> 1 and 0 --- so on 
              nums[0]
            */
            if (nums[i] < nums[(i - 1 + n) % n]) violations += 1;
            if (violations > 1) return false;
        }
        return true;
    }
}
</pre>
<p>Without Circular checks modulo operations</p>
<pre>
class Solution {
    public boolean check(int[] nums) {
        int violations = 0;
        // at most 1 violation is allowed for rotated sorted array
        for (int i = 0; i < nums.length - 1; i++) {
            // prev > next -- violations += 1
            if (nums[i] > nums[i + 1]) violations += 1;
        }
        /* compare in circular manner - as rotated sorted array
           last > first 
           prev > next  --> violations += 1
        */
        if (nums[nums.length - 1] > nums[0]) violations += 1;
        // if violations is <= 1 return true
        return violations <= 1;
    }
}
</pre>

