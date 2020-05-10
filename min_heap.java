package Report3;

public class min_heap {

	int heap_size;
	
	public min_heap()
	{
		heap_size = 0;
	}
	
	public Node[] create_min_heap(int[] ascii, int[] freq)
	{
		int i;
		Node[] min_heap = new Node[53];
		for(i=0; i<freq.length;i++)
		{
			if(ascii[freq[i]] == 0)
				continue;
			else
			{	
				min_heap[i] = new Node(freq[i], ascii[freq[i]]);
				heap_size++;
			}
		}
		return min_heap;	
	}
	
	public boolean isEmpty()
	{
		if(heap_size == 0)
			return false;
		else
			return true;
	}
}
