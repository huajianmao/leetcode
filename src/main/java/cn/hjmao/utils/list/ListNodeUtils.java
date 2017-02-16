package cn.hjmao.utils.list;

/**
 * Created by hjmao on 16/02/2017.
 */
public class ListNodeUtils {

  public static ListNode createListFromArray(int[] nums) {
    ListNode head = null;

    for (int i = nums.length - 1; i >= 0; i--) {
      ListNode temp = new ListNode(nums[i]);
      temp.next = head;
      head = temp;
    }

    return head;
  }

  public static boolean equals(Object self, Object that) {
    if (self == null && that == null) {
      return true;
    }

    if (!ListNode.class.isInstance(that) || !ListNode.class.isInstance(self)) {
      return false;
    } else {
      ListNode thisTemp = (ListNode) self;
      ListNode thatTemp = (ListNode) that;
      while (thisTemp != null) {
        if (thatTemp == null || thisTemp.val != thatTemp.val) {
          return false;
        } else {
          thisTemp = thisTemp.next;
          thatTemp = thatTemp.next;
        }
      }
      return thatTemp == null;
    }
  }
}
