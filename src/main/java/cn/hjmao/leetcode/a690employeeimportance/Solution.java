package cn.hjmao.leetcode.a690employeeimportance;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/employee-importance/
 *
 * Desc:
 * =====
 * You are given a data structure of employee information,
 * which includes the employee's unique id, his importance value and his direct subordinates' id.
 *
 * For example, employee 1 is the leader of employee 2, and employee 2 is the leader of employee 3.
 * They have importance value 15, 10 and 5, respectively.
 * Then employee 1 has a data structure like [1, 15, [2]],
 * and employee 2 has [2, 10, [3]], and employee 3 has [3, 5, []].
 * Note that although employee 3 is also a subordinate of employee 1, the relationship is not direct.
 *
 * Now given the employee information of a company, and an employee id,
 * you need to return the total importance value of this employee and all his subordinates.
 *
 * Example 1:
 *
 * Input: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
 * Output: 11
 *
 * Explanation:
 * Employee 1 has importance value 5, and he has two direct subordinates: employee 2 and employee 3.
 * They both have importance value 3. So the total importance value of employee 1 is 5 + 3 + 3 = 11.
 *
 *
 * Note:
 *  - One employee has at most one direct leader and may have several subordinates.
 *  - The maximum number of employees won't exceed 2000.;
*/

class Solution {
  public int getImportance(List<Employee> employees, int id) {
    Map<Integer, Employee> map = new HashMap<>();
    for (Employee employee: employees) {
      map.put(employee.id, employee);
    }
    Set<Employee> all = new HashSet<>();
    Employee root = map.get(id);
    if (root != null) {
      helper(root, all, map);
    }

    int sum = 0;
    for (Employee employee: all) {
      sum += employee.importance;
    }

    return sum;
  }

  private void helper(Employee me, Set<Employee> all, Map<Integer, Employee> map) {
    if (!all.contains(me)) {
      all.add(me);
      for (Integer id: me.subordinates) {
        helper(map.get(id), all, map);
      }
    }
  }
}
