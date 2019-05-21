package cn.hjmao.leetcode.a049groupanagrams;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void testGroupAnagrams() {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    String[] one = {"ate", "eat", "tea"};
    String[] two = {"bat"};
    String[] three = {"nat", "tan"};
    Arrays.sort(one);
    Arrays.sort(two);
    Arrays.sort(three);

    List<List<String>> expect = new ArrayList<>();
    expect.add(Arrays.asList(one));
    expect.add(Arrays.asList(two));
    expect.add(Arrays.asList(three));

    List<List<String>> actual = solution.groupAnagrams(strs);
    for (List<String> list: actual) {
      Collections.sort(list);
    }

    assertEquals(actual, expect);
  }
}
