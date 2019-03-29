package cn.hjmao.leetcode.a051nqueens;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void testSolveNQueens() {
    int n = 4;
    String[] solution1 = {".Q..", "...Q", "Q...", "..Q."};
    String[] solution2 = {"..Q.", "Q...", "...Q", ".Q.."};
    List<List<String>> expect = new ArrayList<>();
    List<String> solution1list = Arrays.asList(solution1);
    List<String> solution2list = Arrays.asList(solution2);
    expect.add(solution1list);
    expect.add(solution2list);

    List<List<String>> actual = solution.solveNQueens(n);
    assertEquals(actual, expect);
  }
}