package algo.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFS {
	LinkedList<Integer>[] adj;
	boolean[] visited;
	int v;
	@SuppressWarnings("unchecked")
	public DFS(int v) {
		this.v = v;
		adj = new LinkedList[v];
		visited = new boolean[v];
		for (int i = 0; i < v; i++)
			adj[i] = new LinkedList<Integer>();
	}
	public void addEdge(int v, int e) {
		adj[v].add(e);
	}
	
	public void DFSUtil(int r)
	{
	  Stack<Integer> stack = new Stack<Integer>();
	  stack.push(r);
	  while(!stack.isEmpty())
	  {
		  int i = stack.peek();
		  stack.pop();
		  if(!visited[i])
		  {
			  System.out.println(i);
			  visited[i] = true;
		  }
		 
		  LinkedList<Integer> list = adj[i];
		  Iterator<Integer> iter = list.iterator();
		  while(iter.hasNext())
		  {
			  int node = iter.next();
			  if(!visited[node])
			  stack.push(node);
		  }
	  }
	}
	public static void main(String[] args)
	{
		DFS g = new DFS(5);
		g.addEdge(1, 0);
	    g.addEdge(0, 2);
	    g.addEdge(2, 1);
	    g.addEdge(0, 3);
	    g.addEdge(1, 4);
	    g.DFSUtil(0);
	}
}
