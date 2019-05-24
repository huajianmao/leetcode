package cn.hjmao.leetcode.a599minimumindexsumoftwolists;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testFindRestaurant1() {
    String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
    String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
    String[] expect = {"Shogun"};
    String[] actual = solution.findRestaurant(list1, list2);
    assertEquals(Arrays.stream(actual).collect(Collectors.toSet()), Arrays.stream(expect).collect(Collectors.toSet()));
  }

  @Test
  public void testFindRestaurant2() {
    String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
    String[] list2 = {"KFC", "Shogun", "Burger King"};
    String[] expect = {"Shogun"};
    String[] actual = solution.findRestaurant(list1, list2);
    assertEquals(Arrays.stream(actual).collect(Collectors.toSet()), Arrays.stream(expect).collect(Collectors.toSet()));
  }

  @Test
  public void testFindRestaurant3() {
    String[] list1 = {"Shogun", "KFC", "Tapioca Express", "Burger King"};
    String[] list2 = {"KFC", "Shogun", "Burger King"};
    String[] expect = {"Shogun", "KFC"};
    String[] actual = solution.findRestaurant(list1, list2);
    assertEquals(Arrays.stream(actual).collect(Collectors.toSet()), Arrays.stream(expect).collect(Collectors.toSet()));
  }
}