package cn.hjmao.leetcode.a472constructquadtree;

import cn.hjmao.utils.quadtree.Node;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testConstruct() {
    int[][] grid = {
        {1, 1, 1, 1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0, 0, 0, 0}
    };

    Node node1 = new Node(true, true, null, null, null, null);
    Node node2 = new Node(true, false,
        new Node(false, true, null, null, null, null),
        new Node(false, true, null, null, null, null),
        new Node(true, true, null, null, null, null),
        new Node(true, true, null, null, null, null)
    );
    Node node3 = new Node(true, true, null, null, null, null);
    Node node4 = new Node(false, true, null, null, null, null);
    Node expect = new Node(true, false, node1, node2, node3, node4);
    Node actual = solution.construct(grid);

//    assertEquals(actual, expect);
    assertTrue(actual.equals(expect));
  }
}