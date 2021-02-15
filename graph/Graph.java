package graph;

public class Graph {
	int edgeCount, vertexCount;
	boolean directional;
	boolean[][] adjVertices;

	public Graph(int numOfVertices, boolean flag) {
		this.vertexCount = numOfVertices;
		edgeCount = 0;
		adjVertices = new boolean[vertexCount][vertexCount];
	}

	public void insertEdge(Edge e) {
      if(adjVertices[e.v][e.w]==false)
      {
    	  adjVertices[e.v][e.w] = true;
    	  edgeCount++;
      }
      if(!directional)
      {
    	  adjVertices[e.w][e.v] = true;
      }
	}
	
	public void removeEdge(Edge e)
	{
		if(adjVertices[e.v][e.w]==true)
	      {
	    	  adjVertices[e.v][e.w] = false;
	    	  edgeCount--;
	      }
	      if(!directional)
	      {
	    	  adjVertices[e.w][e.v] = false;
	      }
	}
	int numVertices(){return vertexCount;}
	int numEdges(){return edgeCount;}
	boolean directed(){return directional;}
	boolean edgeTest(int v, int w){return adjVertices[v][w];}
	private class AdjArray
	{
		int i, v;
		public AdjArray(int v)
		{
			i =-1;
			this.v = v;
		}
		
		public int  beginning()
		{
			
			return -1;
		}
		
		public int next()
		{
			for(i++; i<numVertices(); i++)
			{
				if(edgeTest(v,i)==true)
					return i;
			}
			return -1;
		}
		public boolean end(){
			return i>=numVertices();
		}
	}
	
}
