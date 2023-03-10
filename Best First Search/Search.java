
public class Search 
{
	public static void main(String[] args)
	{
		Node n1=new Node(1,"Arad",false,366);
		Node n2=new Node(2,"Zerind",false,372);
		Node n3=new Node(3,"Sibiu",false,253);
		Node n4=new Node(4,"Timisara",false,329);
		Node n5=new Node(5,"Oradea",false,380);
		Node n6=new Node(6,"Lugoj",false,244);
		Node n7=new Node(7,"Mehadia",false,241);
		Node n8=new Node(8,"Dobreta",false,242);
		Node n9=new Node(9,"Rimnicu Vilcea",false,193);
		Node n10=new Node(10,"Fagaras",false,178);
		Node n11=new Node(11,"Pitesti",false,98);
		Node n12=new Node(12,"Craiova",false,160);
		Node n13=new Node(13,"Bucharest",false,0);
		Node n14=new Node(14,"Glurglu",false,77);
		Node n15=new Node(15,"Urziceni",false,80);

		
		Graph graph=new Graph(false);
		graph.insertEdge(n1, n2);
		graph.insertEdge(n1, n3);
		graph.insertEdge(n1, n4);

		graph.insertEdge(n2, n1);
		graph.insertEdge(n2, n5);
		
		graph.insertEdge(n3, n1);
		graph.insertEdge(n3, n10);
		graph.insertEdge(n3, n9);
		
		graph.insertEdge(n4, n1);
		graph.insertEdge(n4, n6);
		
		graph.insertEdge(n5, n2);
		graph.insertEdge(n5, n3);
		
		graph.insertEdge(n6, n4);
		graph.insertEdge(n6, n7);
		
		graph.insertEdge(n7, n6);
		graph.insertEdge(n7, n8);
		
		graph.insertEdge(n8, n7);
		graph.insertEdge(n8, n2);
		
		graph.insertEdge(n9, n3);
		graph.insertEdge(n9, n2);
		graph.insertEdge(n9, n11);
		
		graph.insertEdge(n10, n3);
		graph.insertEdge(n10, n13);
		
		graph.insertEdge(n11, n9);
		graph.insertEdge(n11, n13);
		graph.insertEdge(n11, n14);
		
		graph.insertEdge(n12, n8);
		graph.insertEdge(n12, n9);
		graph.insertEdge(n12, n11);
		
		graph.insertEdge(n13, n10);
		graph.insertEdge(n13, n11);
		graph.insertEdge(n13, n14);
		graph.insertEdge(n13, n15);

		graph.insertEdge(n14, n13);
		
		graph.insertEdge(n15, n13);
		
		BestFirstSearch bfs = new BestFirstSearch();
		Node x=bfs.bfsSearch(n1, n13, graph);
		System.out.println(x.name);
		while(x.parent!=null) 
		{
			System.out.println(x.parent.name);
			x=x.parent;
		}
	}
}
