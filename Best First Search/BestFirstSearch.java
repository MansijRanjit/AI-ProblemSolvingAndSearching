
import java.util.LinkedList;

public class BestFirstSearch 
{
	public Node bfsSearch(Node start,Node destination,Graph g)
	{
		Node n=null;
		LinkedList<Node> closedList= new LinkedList<Node>();
		LinkedList<Node> openList= new LinkedList<Node>();
		openList.add(start);
		while(openList.isEmpty()==false)
		{
			n=openList.pop();
			if(n==destination)
			{
				return n;
			}
			
			LinkedList<Node> neigh= g.getAdjacency().get(n);
			for(Node w: neigh)
			{
				if(!openList.contains(w) && !closedList.contains(w))
				{
					w.parent=n;
					openList.add(w);
				}
			}
			closedList.add(n);
		}
		return n;

	}
}
