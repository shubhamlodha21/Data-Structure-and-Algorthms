//Find kth node from end of Linked-List

class Solution {
    static Node findKthFromLast(Node head, int K) {

		Node temp  = head;
		int iCnt=0;

		while(temp!=null)
			{
				iCnt++;
				temp = temp.next;
			}

		temp  = head;
		
		for(int i=0;i<iCnt-K;i++)
			{
				temp = temp.next;
			}
		return temp;
    }
}