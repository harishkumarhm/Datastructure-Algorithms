package algo.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	LinkedList<Integer> adj[];
	boolean visited[];
	Queue<Integer> que;
	Integer v;
	@SuppressWarnings("unchecked")
	public BFS(int v)

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
		que = new LinkedList<Integer>();
		if (adj[r] == null)
			return;
		que.add(r);
		visited[r] = true;
		while (!que.isEmpty()) {
			int i = que.poll();
			System.out.println(i);
			visited[i] = true;
			LinkedList<Integer> list = adj[i];
			Iterator<Integer> iter = list.iterator();
			while (iter.hasNext()) {
				int node = iter.next();
				if (!visited[node])
				{
					que.add(node);
				}
			}
		}
	}
	public static void main(String[] args) {
		BFS g = new BFS(4);
		g.addEdge(0, 1);
	    g.addEdge(0, 2);
	    g.addEdge(1, 2);
	    g.addEdge(2, 0);
	    g.addEdge(2, 3);
	    g.addEdge(3, 3);
	    g.BFSUtil(2);
	}
}
