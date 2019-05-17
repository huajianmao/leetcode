package cn.hjmao.leetcode.a551studentattendancerecordi;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/student-attendance-record-i/
 *
 * Desc:
 * =====
 * You are given a string representing an attendance record for a student.
 * The record only contains the following three characters:
 * 'A' : Absent.
 * 'L' : Late.
 * 'P' : Present.
 *
 * A student could be rewarded
 * if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
 *
 * You need to return whether the student could be rewarded according to his attendance record.
 *
 * Example 1:
 * Input: "PPALLP"
 * Output: True
 *
 * Example 2:
 * Input: "PPALLL"
 * Output: False
 */

class Solution {
  public boolean checkRecord(String s) {
    int absence = 0;
    int last = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'A') {
        absence++;
        if (absence > 1) {
          return false;
        } else {
          last = 0;
        }
      } else if (s.charAt(i) == 'L') {
        if (last == 2) {
          return false;
        } else {
          last++;
        }
      } else {
        last = 0;
      }
    }
    
    return true;
  }
}
