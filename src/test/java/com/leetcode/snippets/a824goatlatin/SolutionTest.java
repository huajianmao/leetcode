package com.leetcode.snippets.a824goatlatin;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private  Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testToGoatLatin1() {
    String s = "I speak Goat Latin";
    String expect = "Imaa peaksmaaa oatGmaaaa atinLmaaaaa";
    String actual = solution.toGoatLatin(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testToGoatLatin2() {
    String s = "The quick brown fox jumped over the lazy dog";
    String expect = "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa"
        + " overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa";
    String actual = solution.toGoatLatin(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testToGoatLatin3() {
    String s = "Each word consists of lowercase and uppercase letters only";
    String expect = "Eachmaa ordwmaaa onsistscmaaaa ofmaaaaa owercaselmaaaaaa"
        + " andmaaaaaaa uppercasemaaaaaaaa etterslmaaaaaaaaa onlymaaaaaaaaaa";
    String actual = solution.toGoatLatin(s);
    assertEquals(actual, expect);
  }
}
