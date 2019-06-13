package cn.hjmao.leetcode.a690employeeimportance;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testGetImportance() {
    Integer[] temp = {2, 3};
    Integer[] blank = new Integer[0];
    Object[][] employeeArray = {{1, 5, temp}, {2, 3, blank}, {3, 3, blank}};
    List<Employee> employees = Employee.fromArrays(employeeArray);
    int id = 1;
    int expect = 11;
    int actual = solution.getImportance(employees, id);
    assertEquals(actual, expect);
  }
}