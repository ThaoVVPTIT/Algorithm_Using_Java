package cdac.grap;

import java.util.ArrayList;
import java.util.List;

public class AdjListGraph implements Grap{
	List<List<Edges>> adjList;
	int vertexCount;
	boolean isDirected;
	public AdjListGraph(int n, boolean isDirected)
	{
		vertexCount = n;
		this.isDirected = isDirected;
		adjList = new ArrayList<>(vertexCount);
		for(int i = 0; i < vertexCount; i++)
		{
			adjList.add(new ArrayList<Edges>());
		}
	}
	@Override
	public void addEdge(int u, int v) {
		addEdge(u, v, 1);
	}
	@Override
	public void addEdge(int u, int v, int w) {
		 adjList.get(u).add(new Edges(v, w));
		 if (!isDirected) 
		 {
		        adjList.get(v).add(new Edges(u, w));
		 }
	}
	private void dfsHelper(int startVertex, boolean[] isVisited) {
	    if (isVisited[startVertex]) {
	        return;
	    }

	    isVisited[startVertex] = true;
	    System.out.print(startVertex + " ");

	    for (Edges edgeInfo : adjList.get(startVertex)) {
	        if (!isVisited[edgeInfo.adjVertex]) {
	            dfsHelper(edgeInfo.adjVertex, isVisited);
	        }
	    }
	}
	
	@Override
	public void printBFS(int startVertex) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void printDFS(int startVertex) {
	    boolean[] isVisited = new boolean[vertexCount];
	    for (int i = 0; i < vertexCount; ++i) {
	        isVisited[i] = false;
	    }

	    dfsHelper(startVertex, isVisited);
	    System.out.println("");
	}
	@Override
	public void dijkstraShortestPath(int startVertex, int destVertex) {
		
	}
	
}
