package cn.hjmao.utils.narytree;

import java.util.List;

public class Node {
  public int val;
  public List<Node> children;

  public Node() {}

  public Node(int val, List<Node> children) {
    this.val = val;
    this.children = children;
  }
}
