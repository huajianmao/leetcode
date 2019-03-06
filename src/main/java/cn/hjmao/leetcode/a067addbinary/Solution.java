package cn.hjmao.leetcode.a067addbinary;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/add-binary/
 *
 * Desc:
 * =====
 * Given two binary strings, return their sum (also a binary string).
 *
 * The input strings are both non-empty and contains only characters 1 or 0.
 */

public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder ();

        int sum = 0;

        int indexA = a.length () - 1;
        int indexB = b.length () - 1;
        while ( indexA >= 0 || indexB >= 0 || sum == 1 ) {
            sum += ((indexA >= 0) ? Character.getNumericValue (a.charAt (indexA--)) : 0);
            sum += ((indexB >= 0) ? Character.getNumericValue (b.charAt (indexB--)) : 0);
            result.append ( sum % 2);
            sum = sum / 2;
        }
        return result.reverse ().toString ();
    }
}
