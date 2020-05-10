package Report3;

public class Huffman {
	   public Node make_tree(int[] ascii)
	   {
	      int i,j, index;
	      int left_w = 0;
	      int right_w = 0;
	      int[] sorted_freq = new int[128];   //텍스트에서 문자들의 빈도 수를 오름차순으로 정렬한 결과를 저장하기 위한 배열
	      int count =0;
	      min_heap mh = new min_heap();
	      Node[] heap = new Node[53];		 // 대문자 26개 소문자26개 공백문자 1개 = 53개
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
