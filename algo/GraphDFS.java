package algo;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphDFS {
 private int v ; // No of vertices
 private LinkedList<Integer> adj[]; // adjesent vertices
 public  GraphDFS(int v)
 {
	 this.v =v;
	 adj = new LinkedList[v];
	 for (int i=0; i<v; i++)
		 adj[i]= new LinkedList<Integer>();
 }
 public void addEdge(int v, int w)
 {
	 adj[v].add(w);
 }
 
 public void DFSUtil(int s, boolean[] visited)
 {
	
	 visited[s]=true;
	 System.out.println(s+" ");
	 Iterator<Integer> iter = adj[s].iterator();
	 while(iter.hasNext())
	 {	int n = iter.next();
		 if(!visited[n])
		 DFSUtil(n, visited);
	 }
 }
 public void DFS(int s)
 {
	 boolean[] visited = new boolean[v];
	 DFSUtil(s, visited);
 }
 
 public static void main(String[] args)
 {
	 GraphDFS graph = new GraphDFS(4);
	 graph.addEdge(0, 1);
	 graph.addEdge(0, 2);
	
	 graph.addEdge(2, 3);
	 graph.addEdge(2, 0);
	 graph.addEdge(3, 3);
	 graph.DFS(2);
 }
}
