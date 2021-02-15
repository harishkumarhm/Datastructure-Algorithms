package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/*
 * Consider an undirected graph consisting of  nodes where each node is labeled from  to  and the edge between any two nodes is always of length . We define node  to be the starting position for a BFS.

Given  queries in the form of a graph and some starting node, , perform each query by calculating the shortest distance from starting node  to all the other nodes in the graph. Then print a single line of  space-separated integers listing node 's shortest distance to each of the  other nodes (ordered sequentially by node number); if  is disconnected from a node, print  as the distance to that node.

Input Format

The first line contains an integer, , denoting the number of queries. The subsequent lines describe each query in the following format:

The first line contains two space-separated integers describing the respective values of  (the number of nodes) and  (the number of edges) in the graph.
Each line  of the  subsequent lines contains two space-separated integers,  and , describing an edge connecting node  to node .
The last line contains a single integer, , denoting the index of the starting node.
Constraints

Output Format

For each of the  queries, print a single line of  space-separated integers denoting the shortest distances to each of the  other nodes from starting position . These distances should be listed sequentially by node number (i.e., ), but should not include node . If some node is unreachable from , print  as the distance to that node.

Sample Input

2
4 2
1 2
1 3
1
3 1
2 3
2
Sample Output

6 6 -1
-1 6
 */
public class GraphTraverse {
	 public static void main(String[] args) throws IOException{
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int q = Integer.parseInt(br.readLine());
	        GraphTraverse.Graph graphs[] = new GraphTraverse.Graph[q];
	        String[] params;
	        int i=0, vert, edge, source;  
	        while(i<q)
	        {   
	            params = br.readLine().split(" ");
	            vert = Integer.parseInt(params[0]);
	            edge = Integer.parseInt(params[1]);
	           // System.out.println(vert + " " + edge);
	            graphs[i] = new GraphTraverse().new Graph(vert);
	            for(int j=0; j<edge; j++)
	            {
	                String[] edges = br.readLine().split(" ");
	                graphs[i].addEdge(Integer.parseInt(edges[0]), Integer.parseInt(edges[0]));
	            }
	           // System.out.println(br.readLine());
	            source = Integer.parseInt(br.readLine()) ;
	           // System.out.println(source);
	            graphs[i].setSource(source);
	            i++;
	        }
	        for(int j=0; j<graphs.length; j++)
	            graphs[j].BFS();
	        
	    }
	    
	    public  class Graph
	    {
	        LinkedList<Integer>[] adj;
	        boolean[] visited;
	        int source;
	        @SuppressWarnings("unchecked")
			public Graph(int n)
	        {
	        	adj = new LinkedList[n];
	        	for (int i = 0; i < n; i++)
				adj[i] = new LinkedList<Integer>();
	            
	            visited = new boolean[n];
	            
	        }
	        public void addEdge(int w, int v)
	        {
	            adj[w].add(v);
	        }
	        public void setSource(int s)
	        {
	            this.source = s;
	        }
	        
	        public void BFS()
	        {
	            Queue<Integer> que = new LinkedList<Integer>();
	            que.add(source);
	          //  visited[source] = true;
	            while(!que.isEmpty())
	            {
	                int n = que.poll();
	                if(!visited[n])
	                     visited[n] = true;
	                  
	                Iterator<Integer> iter = adj[n].iterator();
	                while(iter.hasNext())
	                {
	                    int i = iter.next();
	                    if(!visited[i])
	                        que.add(i);
	                    
	                }
	            }
	            for(int i=0; i<visited.length; i++)
	            {
	                if(visited[i])
	                    System.out.printf("6 ");
	                else
	                    System.out.printf("-1 ");
	            }
	        }
	    }
}
