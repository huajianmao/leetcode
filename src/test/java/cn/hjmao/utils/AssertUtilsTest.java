package cn.hjmao.utils;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class AssertUtilsTest {

  @Test
  public void testObjectCreation() {
    assertNotNull(new AssertUtils());
  }

  @Test
  public void testNotSameSize() {
    List<List<Integer>> list1 = Arrays.asList(
        Arrays.asList(1, 2, 3),
        Arrays.asList(1, 2, 3)
    );
    List<List<Integer>> list2 = Arrays.asList(
        Arrays.asList(1, 2, 3)
    );
    assertFalse(AssertUtils.areEqualsOfTwoArrays(list1, list2));
  }

  @Test
  public void testNullCase() {
    List<List<Integer>> list1 = null;
    List<List<Integer>> list2 = Arrays.asList(
        Arrays.asList(1, 2, 3)
    );
    assertFalse(AssertUtils.areEqualsOfTwoArrays(list1, list2));
  }

  @Test
  public void testNullCase2() {
    List<List<Integer>> list1 = Arrays.asList(
        Arrays.asList(1, 2, 3)
    );
    List<List<Integer>> list2 = null;
    assertFalse(AssertUtils.areEqualsOfTwoArrays(list1, list2));
  }

  @Test
  public void testNullCase3() {
    List<List<Integer>> list1 = null;
    List<List<Integer>> list2 = null;
    assertTrue(AssertUtils.areEqualsOfTwoArrays(list1, list2));
  }
}