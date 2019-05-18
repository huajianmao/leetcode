package cn.hjmao.utils.list;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

public class ListNodeUtilsTest {

  @Test
  public void testNewUtils() throws Exception {
    assertNotNull(new ListNodeUtils());
  }

  @Test
  public void testNotSameClassObject1() throws Exception {
    assertFalse(ListNodeUtils.equals(new String(""), new Integer(1)));
  }

  @Test
  public void testNotSameClassObject2() throws Exception {
    assertFalse(ListNodeUtils.equals(new ListNode(1), new Integer(1)));
  }

  @Test
  public void testNotSameClassObject3() throws Exception {
    assertFalse(ListNodeUtils.equals(new String(""), new ListNode(1)));
  }

  @Test
  public void testNullNextNode() throws Exception {
    ListNode node1 = new ListNode(1);
    node1.next = new ListNode(2);
    ListNode node2 = new ListNode(1);
    node2.next = null;
    assertFalse(ListNodeUtils.equals(node1, node2));
  }
}