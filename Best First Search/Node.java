
public class Node  implements Comparable<Node>
{
	public int nodeID;
	public String name;
	public boolean visited;
	public int hscore;
	public Node parent =null;
	
	public Node(int id, String city,boolean visit,int hscor)
	{
		nodeID=id;
		name=city;
		visited=visit;
		hscore=hscor;
	}
	
	
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if(this.hscore<o.hscore)
		{
			return -1;
		}
		else if(this.hscore>o.hscore)
		{
			return 1;
		}
		else
		{
			return 0;
		}	
	}
	
}
