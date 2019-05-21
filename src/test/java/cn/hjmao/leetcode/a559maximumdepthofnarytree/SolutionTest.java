package cn.hjmao.leetcode.a559maximumdepthofnarytree;

import cn.hjmao.utils.narytree.Node;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testMaxDepth1() {
    Node node5 = new Node(5, null);
    Node node6 = new Node(6, null);
    Node[] children3 = {node5, node6};
    Node node3 = new Node(3, Arrays.asList(children3));
    Node node2 = new Node(2, null);
    Node node4 = new Node(4, null);
    Node[] children1 = {node3, node2, node4};
    Node root = new Node(1, Arrays.asList(children1));

    int expect = 3;
    int actual = solution.maxDepth(root);
    assertEquals(actual, expect);
    assertEquals(solution.maxDepth1(root), expect);
  }

  @Test
  public void testMaxDepth2() {
    Node root = null;
    int expect = 0;
    int actual = solution.maxDepth(root);
    assertEquals(actual, expect);
    assertEquals(solution.maxDepth1(root), expect);
  }

  @Test
  public void testMaxDepth3() {
    Node root = new Node(0, null);
    int expect = 1;
    int actual = solution.maxDepth(root);
    assertEquals(actual, expect);
    assertEquals(solution.maxDepth1(root), expect);
  }
}
