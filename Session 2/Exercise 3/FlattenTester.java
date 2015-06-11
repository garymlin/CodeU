import java.util.ArrayList;


public class FlattenTester {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> a = new BinaryTreeNode(4);
		BinaryTreeNode<Integer> b = new BinaryTreeNode(5);
		//BinaryTreeNode(value, left node, right node)
		BinaryTreeNode<Integer> c = new BinaryTreeNode(3, a, b);
		BinaryTreeNode<Integer> d = new BinaryTreeNode(2);
		BinaryTreeNode<Integer> root = new BinaryTreeNode(1, d , c);
		
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root);
		ArrayList<Integer> output = tree.flatten (root);
		
		for (int i = 0 ; i < output.size(); i++) {
			System.out.println(output.get(i));
		}
		
	}

}
