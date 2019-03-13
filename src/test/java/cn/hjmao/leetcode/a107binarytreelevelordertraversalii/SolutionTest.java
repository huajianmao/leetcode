package cn.hjmao.leetcode.a107binarytreelevelordertraversalii;

import cn.hjmao.utils.tree.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testLevelOrderBottom() {

        Object[] tree = {3, 9, 20, null, null, 15, 7};
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;

        List<Integer> list3 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list3.add(15);
        list3.add(7);
        list2.add(9);
        list2.add(20);
        list1.add(3);
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(list3);
        expect.add(list2);
        expect.add(list1);
        List<List<Integer>> actual = solution.levelOrderBottom(root);

        assertEquals(actual, expect);
    }
}