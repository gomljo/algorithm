package Report3;

public class Huffman {
	   public Node make_tree(int[] ascii)
	   {
	      int i,j, index;
	      int left_w = 0;
	      int right_w = 0;
	      int[] sorted_freq = new int[128];   //�ؽ�Ʈ���� ���ڵ��� �� ���� ������������ ������ ����� �����ϱ� ���� �迭
	      int count =0;
	      min_heap mh = new min_heap();
	      Node[] heap = new Node[53];		 // �빮�� 26�� �ҹ���26�� ���鹮�� 1�� = 53��
	      Node tree = new Node(0, 0);
	      for(i=0; i<ascii.length;i++)
	      {
	         index = i;
	         for(j=i+1; j<ascii.length;j++)
	         {
	            if(ascii[index] > ascii[j])
	               index = j;
	         }
	         sorted_freq[i] = j;
	      }
	      heap = mh.create_min_heap(ascii, sorted_freq);
	      while(mh.isEmpty())
	      {
	    	  i = 0;
	    	  if(tree.data > heap[i].data)
	    	  {
	    		  
	    	  }
	    	  
	      }
	   }
}
