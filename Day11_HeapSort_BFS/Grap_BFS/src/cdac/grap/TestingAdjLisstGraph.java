package cdac.grap;

public class TestingAdjLisstGraph {
	public static void testTraversal() {
		Grap g = new AdjListGraph(4, false);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
		System.out.print("DFS - ");
		g.printDFS(0);
	}
	public static void main(String[] args) {
		testTraversal();
	}
}
