package cn.hjmao.leetcode.a374guessnumberhigherorlower;

public class GuessGame {
  private int pick;

  public void pick(int n) {
    this.pick = n;
  }

  public int guess(int num) {
    return num == this.pick ? 0 : (num > this.pick ? -1 : 1);
  }
}
