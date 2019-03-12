package cn.hjmao.leetcode.a104maximumdepthofbinarytree;

import cn.hjmao.utils.tree.TreeNode;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testMaxDepth() {
        Object[] tree = {3, 9, 20, null, null, 15, 7};
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;
        int expect = 3;
        int actual = solution.maxDepth(root);

        assertEquals(actual, expect);
    }
}