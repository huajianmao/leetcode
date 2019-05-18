package cn.hjmao.leetcode.a558quadtreeintersection;

import cn.hjmao.utils.quadtree.Node;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testIntersect1() {
    Node tree1 = new Node(false, false,
        new Node(true, true, null, null, null, null),
        new Node(true, true, null, null, null, null),
        new Node(false, true, null, null, null, null),
        new Node(false, true, null, null, null, null)
    );
    Node tree2 = new Node(false, false,
        new Node(true, true, null, null, null, null),
        new Node(false, false,
            new Node(true, true, null, null, null, null),
            new Node(false, true, null, null, null, null),
            new Node(true, true, null, null, null, null),
            new Node(true, true, null, null, null, null)
        ),
        new Node(true, true, null, null, null, null),
        new Node(false, true, null, null, null, null)
    );
    Node expect = new Node(false, false,
        new Node(true, true, null, null, null, null),
        new Node(true, true, null, null, null, null),
        new Node(true, true, null, null, null, null),
        new Node(false, true, null, null, null, null)
    );

    Node actual = solution.intersect(tree1, tree2);
    assertTrue(expect.equals(actual));
  }

  @Test
  public void testIntersect2() {
    Node tree1 = new Node(false, false,
        new Node(true, true, null, null, null, null),
        new Node(false, false,
            new Node(true, true, null, null, null, null),
            new Node(true, true, null, null, null, null),
            new Node(true, true, null, null, null, null),
            new Node(false, true, null, null, null, null)
        ),
        new Node(false, true, null, null, null, null),
        new Node(false, true, null, null, null, null)
    );
    Node tree2 = new Node(false, false,
        new Node(true, true, null, null, null, null),
        new Node(false, false,
            new Node(true, true, null, null, null, null),
            new Node(false, true, null, null, null, null),
            new Node(true, true, null, null, null, null),
            new Node(true, true, null, null, null, null)
        ),
        new Node(true, true, null, null, null, null),
        new Node(false, true, null, null, null, null)
    );
    Node expect = new Node(false, false,
        new Node(true, true, null, null, null, null),
        new Node(true, true, null, null, null, null),
        new Node(true, true, null, null, null, null),
        new Node(false, true, null, null, null, null)
    );

    Node actual = solution.intersect(tree1, tree2);
    assertTrue(expect.equals(actual));
  }
}