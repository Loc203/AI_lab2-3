package graphSearch;

public class Entry {
	public static void main(String[] args) {
		Node nodeS = new Node("S");
		Node nodeA = new Node("A"); Node nodeB = new Node("B");
		Node nodeC = new Node("C"); Node nodeD = new Node("D");
		Node nodeE = new Node("E"); Node nodeF = new Node("F");
		Node nodeG = new Node("G"); Node nodeH = new Node("H");
		nodeS.addEdge(nodeA, 5); nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4); nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4); nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2); nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6); nodeF.addEdge(nodeG, 1);
		ISearchAlgo algo1 = new BreadthFirstSearchAlgo();
		Node result = algo1.execute(nodeS, "G");
		NodeUtils print = new NodeUtils();
		System.out.println(print.printPath(result));
		System.out.println(print.printPath(algo1.execute(nodeS, "A", "H")));
		
		ISearchAlgo algo2 = new DepthFirstSearchAlgo();
		System.out.println(print.printPath(algo2.execute(nodeS, "G")));
		System.out.println(print.printPath(algo2.execute(nodeS, "B", "G")));
		
		ISearchAlgo algo3 = new UniformCostSearchAlgo();
		System.out.println(print.printPath(algo3.execute(nodeS, "C", "E")) + " Path cost: " + algo3.execute(nodeS, "C", "E").getPathCost());
	}
}
