package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSRecursive {
	LinkedList<Integer>[] adj;
	
	int v;
	boolean[] visited;
	@SuppressWarnings("unchecked")
	public BFSRecursive(int v) {
		this.v = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++)
			adj[i] = new LinkedList<Integer>();
		
		visited = new boolean[v];
	}
	public void addEdge(int v, int e)
	{
		adj[v].add(e);
	}
	
	public void BFS(Queue<Integer> que)
	{
		if(que.isEmpty())
			return;
		
			int i = que.poll();
			if(!visited[i]){
			System.out.println(i);
			visited[i]= true;
			}
		Iterator<Integer> iter = adj[i].iterator();
		while(iter.hasNext())
		{
			int n = iter.next();
			if(!visited[n])
			que.add(n);
			
		}
		BFS(que);
		
	}
	
	
	public static void main(String[] args)
	{
		BFSRecursive g = new BFSRecursive(4);
		Queue<Integer> que=  new LinkedList<Integer>();
		g.addEdge(0, 1);
		 g.addEdge(0, 2);
		    g.addEdge(1, 2);
		    g.addEdge(2, 0);
		    g.addEdge(2, 3);
		    g.addEdge(3, 3);
		 que.add(2);
	    g.BFS(que);
	}
}
