import java.util.ArrayList;
import java.util.Stack;
 
public class Q12 { 
 
	static ArrayList<Node> nodes=new ArrayList<>();
	static class Node{
		int data;
		boolean visited;
		Node(int data)
		{
			this.data=data;
 
		}
	}
 
	// find neighbors of node using adjacency matrix
	// if adjacency_matrix[i][j]==1, then nodes at index i and index j are connected
	public ArrayList<Node> findNeighbours(int adjacency_matrix[][],Node x){
		int nodeIndex=-1;
 
		ArrayList<Node> neighbours=new ArrayList<>();
		for (int i = 0; i < nodes.size(); i++) {
			if(nodes.get(i).equals(x))
			{
				nodeIndex=i;
				break;
			}
		}
 
		if(nodeIndex!=-1)
		{
			for (int j = 0; j < adjacency_matrix[nodeIndex].length; j++) {
				if(adjacency_matrix[nodeIndex][j]==1)
				{
					neighbours.add(nodes.get(j));
				}
			}
		}
		return neighbours;
	}
 
 
	// Recursive DFS
	public  void dfs(int adjacency_matrix[][], Node node){
 
		System.out.print(node.data + " ");
		ArrayList<Node> neighbours=findNeighbours(adjacency_matrix,node);
        node.visited=true;
		for (int i = 0; i < neighbours.size(); i++) {
			Node n=neighbours.get(i);
			if(n!=null && !n.visited)
			{
				dfs(adjacency_matrix,n);
			}
		}
	}
 
	    // Iterative DFS using stack
	public  void dfsUsingStack(int adjacency_matrix[][], Node node){
		Stack<Node> stack=new  Stack<>();
		stack.add(node);
 
		while (!stack.isEmpty())
		{
			Node element=stack.pop();
			if(!element.visited)
			{
				System.out.print(element.data + " ");
				element.visited=true;
			}
 
			ArrayList<Node> neighbours=findNeighbours(adjacency_matrix,element);
			for (int i = 0; i < neighbours.size(); i++) {
				Node n=neighbours.get(i);
				if(n!=null &&!n.visited)
				{
					stack.add(n);
				}
			}
		}
	}
 
	public static void main(String arg[]){
 
		Node node1 =new Node(1);
		Node node2 =new Node(2);
		Node node3 =new Node(3);
		Node node4 =new Node(4);
		Node node5 =new Node(5);
		Node node6 =new Node(6);
 
		nodes.add(node1);
		nodes.add(node2);
		nodes.add(node3);
		nodes.add(node4);
		nodes.add(node5);
		nodes.add(node6);

		int adjacency_matrix[][] = {
				{0,1,1,1,1,1},  // Node 1: 1
				{0,0,0,0,1,0},  // Node 2 :2
				{0,0,0,1,1,1},  // Node 3: 3
				{0,0,0,0,0,0},  // Node 4: 4
				{0,0,0,1,0,1},  // Node 5: 5
				{0,0,0,1,0,0},  // Node 6: 6
		};
 
		Q12 dfsExample = new Q12();
 
		System.out.println("The DFS traversal of the graph using stack ");
		dfsExample.dfsUsingStack(adjacency_matrix, node1);
 
		System.out.println();
 
		clearVisitedFlags();
 
		System.out.println("The DFS traversal of the graph using recursion ");
		dfsExample.dfs(adjacency_matrix, node1);
 
	}
 
	public static void clearVisitedFlags()
	{
		for (int i = 0; i < nodes.size(); i++) {
			nodes.get(i).visited=false;
		}
	}
}