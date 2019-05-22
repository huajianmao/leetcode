package cn.hjmao.utils.quadtree;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class NodeTest {

  @Test
  public void testEquals1() {
    Node node = new Node(true, false, null, null, null, null);
    Node other = node;
    assertTrue(node.equals(other));
  }

  @Test
  public void testEquals2() {
    Node node = new Node(true, false, null, null, null, null);
    Node other = null;
    assertFalse(node.equals(other));
  }

  @Test
  public void testEquals3() {
    Node node = new Node(true, false, null, null, null, null);
    List<Integer> other = new ArrayList<>();
    assertFalse(node.equals(other));
  }

  @Test
  public void testHashCode1() {
    Node node = new Node(true, false, null, null, null, null);
    node.hashCode();
  }
}