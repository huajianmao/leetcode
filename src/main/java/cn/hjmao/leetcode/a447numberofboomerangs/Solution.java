package cn.hjmao.leetcode.a447numberofboomerangs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/number-of-boomerangs/
 *
 * Desc:
 * =====
 * Given n points in the plane that are all pairwise distinct,
 * a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals
 * the distance between i and k (the order of the tuple matters).
 *
 * Find the number of boomerangs. You may assume that
 * n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).
 *
 * Example:
 *
 * Input:
 * [[0,0],[1,0],[2,0]]
 *
 * Output:
 * 2
 *
 * Explanation:
 * The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 */

class Solution {
  public int numberOfBoomerangs(int[][] points) {
    return helper(points, 0, points.length - 1);
  }

  private  int helper(int[][] points, int number, int pos) {
    if (pos == -1) {
      return number;
    } else {
      Map<Long, Integer> distanceCount = new HashMap<>();
      for (int i = 0; i < points.length; i++) {
        long thisDistance = distance(points[pos], points[i]);
        distanceCount.put(thisDistance, distanceCount.getOrDefault(thisDistance, 0) + 1);
      }
      for (int count: distanceCount.values()) {
        if (count > 1) {
          number += count * (count - 1);
        }
      }
      return helper(points, number, pos - 1);
    }
  }

  public int numberOfBoomerangs1(int[][] points) {
    int number = 0;
    List<Map<Long, Integer>> distances = new ArrayList<>();
    for (int i = 0; i < points.length; i++) {
      distances.add(new HashMap<>());
    }

    for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
        Map<Long, Integer> distancesI = distances.get(i);
        Map<Long, Integer> distancesJ = distances.get(j);
        long distanceOfIJ = distance(points[i], points[j]);
        distancesI.put(distanceOfIJ, distancesI.getOrDefault(distanceOfIJ, 0) + 1);
        distancesJ.put(distanceOfIJ, distancesJ.getOrDefault(distanceOfIJ, 0) + 1);
      }
    }

    for (Map<Long, Integer> distanceCount: distances) {
      for (int count: distanceCount.values()) {
        if (count > 1) {
          number += count * (count - 1);
        }
      }
    }

    return number;
  }

  private long distance(int[] point1, int[] point2) {
    long deltaX = point2[0] - point1[0];
    long deltaY = point2[1] - point1[1];

    return deltaX * deltaX + deltaY * deltaY;
  }
}
