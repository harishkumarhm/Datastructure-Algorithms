package algo.graph;

import java.util.Iterator;
import java.util.LinkedList;


public class DFSRecursive {
	LinkedList<Integer> adj[];
	boolean visited[];
	Integer v;
	@SuppressWarnings("unchecked")
	public DFSRecursive(int v)

	{
		this.v = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++)
			adj[i] = new LinkedList<Integer>();
		visited = new boolean[v];
	}
	public void addEdge(int v, int e) {
		adj[v].add(e);
	}

	public void BFSUtil(int r) {
	   if(adj[r]==null)
		   return;
	   if(!visited[r])
	   {
		   System.out.println(r);
		   Iterator<Integer> iter = adj[r].iterator();
		   visited[r] = true;
		   while(iter.hasNext())
		   BFSUtil(iter.next());
	   }
	   
	
		  
		  
	  
	}
	public static void main(String[] args) {
		DFSRecursive g = new DFSRecursive(4);
		g.addEdge(0, 1);
	    g.addEdge(0, 2);
	    g.addEdge(1, 2);
	    g.addEdge(2, 0);
	    g.addEdge(2, 3);
	    g.addEdge(3, 3);
	    g.BFSUtil(2);
	}
}
