package cn.hjmao.leetcode.a069sqrtx;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/add-binary/
 *
 * Desc:
 * =====
 * Implement int sqrt(int x).
 *
 * Compute and return the square root of x,
 * where x is guaranteed to be a non-negative integer.
 *
 * Since the return type is an integer,
 * the decimal digits are truncated and only the integer part of the result is returned.
 */

public class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int low = 1;
        int high = x;
        int now;

        while (true) {
            now = low + (high - low) / 2;
            if (now > x / now) {
                high = now - 1;
            } else {
                if (now + 1 > x / (now + 1)) {
                    break;
                } else {
                    low = now + 1;
                }
            }
        }
        return now;
    }
}
