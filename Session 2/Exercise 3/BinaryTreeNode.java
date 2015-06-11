

public class BinaryTreeNode<AnyType> {

	AnyType element;            // The data in the node
    BinaryTreeNode<AnyType> left;   // Left child
    BinaryTreeNode<AnyType> right;  // Right child
    
    
    BinaryTreeNode( AnyType theElement, BinaryTreeNode<AnyType> lt, BinaryTreeNode<AnyType> rt ) {
        element  = theElement;
        left     = lt;
        right    = rt;
    }
    
    BinaryTreeNode( AnyType theElement ) {
        this( theElement, null, null );
    }
}
