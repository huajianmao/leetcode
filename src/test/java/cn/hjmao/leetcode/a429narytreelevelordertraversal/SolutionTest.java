package cn.hjmao.leetcode.a429narytreelevelordertraversal;

import cn.hjmao.utils.narytree.Node;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testLevelOrder1() {
    Node node5 = new Node(5, null);
    Node node6 = new Node(6, null);
    Node[] children3 = {node5, node6};
    Node node3 = new Node(3, Arrays.asList(children3));
    Node node2 = new Node(2, null);
    Node node4 = new Node(4, null);
    Node[] children1 = {node3, node2, node4};
    Node root = new Node(1, Arrays.asList(children1));

    List<List<Integer>> expect = Arrays.asList(
        Arrays.asList(1),
        Arrays.asList(3, 2, 4),
        Arrays.asList(5, 6)
    );

    List<List<Integer>> actual = solution.levelOrder(root);
    assertEquals(actual, expect);
  }
}