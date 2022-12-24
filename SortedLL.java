//Check Whether two Lists are Sorted or Not

class Accio
{
    static void checkListSorted(Node head)
    {
		int flag=1;
        Node temp  = head;
		Node temp1  = head.next;
		//System.out.println("Hey..Entering in While Loop");

		while(temp1!=null)
			{
				//System.out.println("temp.data"  + temp.data);
				//System.out.println("temp1.data"  + temp1.data);
				
				if(temp.data > temp1.data)
				{
					flag = -1;
					break;
				}
				else
				{
					temp = temp.next;
					temp1 = temp1.next;
				}
			}

		if(flag==-1)
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
    }