package cn.hjmao.leetcode.a690employeeimportance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {
  public int id;
  public int importance;
  public List<Integer> subordinates;

  public static List<Employee> fromArrays(Object[][] arrays) {
    List<Employee> employees = new ArrayList<>();
    for (Object[] array: arrays) {
      Employee employee = new Employee();
      employee.id = (int) array[0];
      employee.importance = (int) array[1];
      employee.subordinates = Arrays.asList((Integer[]) array[2]);
      employees.add(employee);
    }
    return employees;
  }
}