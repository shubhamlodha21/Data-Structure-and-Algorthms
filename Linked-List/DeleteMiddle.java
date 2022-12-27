//Delete the Middle Node of Linked-List

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        
        if(head.next==null)
        {
            //return head;
            return null ;
        }
        
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        while(temp.next!=slow && temp!=slow)
        {
            temp = temp.next;
        }
        
        temp.next = slow.next;
        return head;
        
    }
}