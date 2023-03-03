import java.util.HashMap;
import java.util.LinkedList;

public class Graph 
{
	HashMap<Node,LinkedList<Node>> adjacencyMap;
	boolean directed;
	
	public Graph(boolean dir)
	{
		adjacencyMap=new HashMap<>();
		directed=dir;
	}
	
	public void insertEdge(Node source,Node target)
	{
		if(! adjacencyMap.keySet().contains(source))
		{
			LinkedList<Node> tmp=new LinkedList<>();
			tmp.add(target);
			adjacencyMap.put(source, tmp);
		}
		else
		{
			LinkedList<Node> tmp=adjacencyMap.get(source);
			tmp.add(target);
			adjacencyMap.put(source, tmp);
		}
	}
	
	
	public HashMap<Node,LinkedList<Node>> getAdjacency()
	{
		return adjacencyMap;
	}
}
