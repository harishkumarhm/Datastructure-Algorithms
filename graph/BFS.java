package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
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
		//visited[r] = true;
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

	public void allPaths(int root, int destination)
	{
		if(adj[root]== null || adj[destination]== null)
			return;
		Queue<Integer> queue = new LinkedList<>();
		List<String> paths = new ArrayList<>();
		String path = "";
		queue.add(root);
		while(!queue.isEmpty())
		{
			int value = queue.poll();
			path = path + value +"-->";
			visited[value] =true;
			if(value==destination)
			{
				paths.add(path);
			}
			LinkedList<Integer> list = adj[value];
			Iterator<Integer> iterator = list.iterator();
			while(iterator.hasNext())
			{
				int next = iterator.next();
				if(!visited[next])
				{
					queue.add(next);
				}
			}
			for(String p: paths)
			{
				System.out.println(p);
			}

		}



	}
	public static void main(String[] args) {
		BFS g = new BFS(5);
		g.addEdge(0, 1);
	    g.addEdge(0, 2);
	    g.addEdge(1, 2);
	    g.addEdge(2, 0);
	    g.addEdge(2, 3);
	    g.addEdge(3, 3);
	    g.addEdge(3, 4);
	   // g.BFSUtil(2);

		g.allPaths(1,4);
	}
}
