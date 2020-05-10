package Report3;

public class Node {
	   Node left;
	   Node right;
	   int data;
	   int freq;

	   public Node( int data, int freq)
	   {
	      this.data = data;
	      this.freq = freq;
	      left = right = null;
	   }
}
