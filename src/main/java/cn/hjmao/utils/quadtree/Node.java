package cn.hjmao.utils.quadtree;

public class Node {
  public boolean val;
  public boolean isLeaf;
  public Node topLeft;
  public Node topRight;
  public Node bottomLeft;
  public Node bottomRight;

  public Node(boolean val, boolean isLeaf,
              Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
    this.val = val;
    this.isLeaf = isLeaf;
    this.topLeft = topLeft;
    this.topRight = topRight;
    this.bottomLeft = bottomLeft;
    this.bottomRight = bottomRight;
  }

  @Override
  public boolean equals(Object thatOne) {
    if (this == thatOne) {
      return true;
    }
    if (thatOne == null || getClass() != thatOne.getClass()) {
      return false;
    }
    Node that = (Node) thatOne;

    if (this.isLeaf) {
      return that.isLeaf
          && this.val == that.val
          && this.topLeft == null && this.topRight == null
          && this.bottomLeft == null && this.bottomRight == null
          && that.topLeft == null && that.topRight == null
          && that.bottomLeft == null && that.bottomRight == null;
    } else {
      return !that.isLeaf
          && this.topLeft.equals(that.topLeft)
          && this.topRight.equals(that.topRight)
          && this.bottomLeft.equals(that.bottomLeft)
          && this.bottomRight.equals(that.bottomRight);
    }
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
