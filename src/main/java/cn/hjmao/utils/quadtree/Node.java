package cn.hjmao.utils.quadtree;

public class Node {
  public boolean val;
  public boolean isLeaf;
  public Node topLeft;
  public Node topRight;
  public Node bottomLeft;
  public Node bottomRight;

  public Node() {
  }

  public Node(boolean _val, boolean _isLeaf, Node _topLeft, Node _topRight, Node _bottomLeft, Node _bottomRight) {
    val = _val;
    isLeaf = _isLeaf;
    topLeft = _topLeft;
    topRight = _topRight;
    bottomLeft = _bottomLeft;
    bottomRight = _bottomRight;
  }

  public boolean equals(Node that) {
    if (this.isLeaf) {
      return that.isLeaf
          && this.val == that.val
          && this.topLeft == null && this.topRight == null && this.bottomLeft == null && this.bottomRight == null
          && that.topLeft == null && that.topRight == null && that.bottomLeft == null && that.bottomRight == null;
    } else {
      return !that.isLeaf
          && this.topLeft.equals(that.topLeft)
          && this.topRight.equals(that.topRight)
          && this.bottomLeft.equals(that.bottomLeft)
          && this.bottomRight.equals(that.bottomRight);
    }
  }
}
