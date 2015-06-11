
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;


public class BinaryTree<AnyType> {

	BinaryTreeNode<AnyType> root;
	
	BinaryTree(BinaryTreeNode<AnyType> input) {
		root = input;
	}
	
	//flatten method
	ArrayList<AnyType> flatten (BinaryTreeNode<AnyType> root){
		ArrayBlockingQueue<BinaryTreeNode<AnyType>> queue = new ArrayBlockingQueue<BinaryTreeNode<AnyType>>(100);
		ArrayList<AnyType> output = new ArrayList<AnyType>();
		queue.add(root);
		
		//breadth first search
		while (queue.size() != 0){
			BinaryTreeNode<AnyType> medium = queue.poll();
			output.add(medium.element);
			
			//add the left and right children to queue
			if (medium.left != null){
				queue.add(medium.left);
			}
			if (medium.right != null){
				queue.add(medium.right);
			}
		}
		
		return output;
		
	}
	
	
}
