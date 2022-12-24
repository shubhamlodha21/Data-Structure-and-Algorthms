//Merge Two Sorted Linked-List

class Solution {
 static Node merge(Node x, Node y){
       Node dummy  = new Node(0);
		Node curr = dummy;

		 while((x!=null) && (y!=null))
			 {
				 if(x.data <= y.data)
				 {
					 curr.next = x;
					 x = x.next;
				 }
				 else
				 {
					 curr.next  =  y ;
					 y = y.next;
				 }
				 curr =  curr.next;
			 }

	 if(x!=null)
	 {
		 curr.next= x;
	 }

	 if(y!=null)
	 {
		 curr.next  = y;
	 }

	 return dummy.next;
    }
}
