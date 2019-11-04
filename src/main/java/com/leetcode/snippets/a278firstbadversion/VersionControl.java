package com.leetcode.snippets.a278firstbadversion;

public class VersionControl {
  private int first = 1;

  public void setFirst(int n) {
    first = n;
  }

  public boolean isBadVersion(int version) {
    return version >= first;
  }
}
