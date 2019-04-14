package cn.hjmao.leetcode.a204countprimes;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/count-primes/
 *
 * Desc:
 * =====
 * Count the number of prime numbers less than a non-negative number, n.
 *
 * Example:
 *
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */

public class Solution {
  public int countPrimes(int n) {
    int count = 0;
    if (n >= 2) {
      boolean[] isNotPrimes = new boolean[n + 1];
      isNotPrimes[0] = true;
      isNotPrimes[1] = true;
      for (int i = 2; i < n; i++) {
        if (!isNotPrimes[i]) {
          count++;
          int maxTimes = n / i;
          for (int times = i; times <= maxTimes; times++) {
              isNotPrimes[i * times] = true;
          }
        }
      }
    }

    return count;
  }
}
