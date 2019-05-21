package cn.hjmao;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class ProblemFetcherTest {

  @Test
  public void testCreate() {
    assertNotNull(new ProblemFetcher("https://leetcode.com/problems/two-sum/", "/tmp"));
  }
}