
public class BST {

	private Node root;  
	
	
	public BST(int value) {
		
		root = new Node(value);
		
	}
	
	
	
	
	public static void main(String[] args) {

		BST bst = new BST(50);
		
		bst.add(5);
		bst.add(64);
		bst.add(23);
		bst.add(19);
		bst.add(95);
		bst.add(23);
		bst.add(35);
		bst.add(78);
		bst.add(63);
		bst.add(5);
		bst.add(12);

		bst.exists(2);
		bst.exists(64);
		bst.exists(95);
		bst.exists(53);
		bst.exists(12);
		
		bst.printInOrder();
		
	}

	

	/*
	 * checks if i exists in the BST, 
	 * print message to say if i exists or not
	 * return true if it exists, false otherwise
	 */
	private boolean exists(int i) {
		
		if(existsRecur(i, root)) {
			
			System.out.println(i + " exists in the BST");
			
			return true;
			
		} else {
		
			System.out.println(i + " doesn't exist in the BST");
			
			return false;
			
		}
		 
	}

	private boolean existsRecur(int v, Node n) {
		
		if(n == null) {
		
			return false;
		
		}
		
		int value = n.getValue();
		
		if(v == value) {
			
			return true;
			
		}
		
		if(v > value) {
			
			return existsRecur(v, n.getRight());
			
		}
		
		if(v < value) {
			
			return existsRecur(v, n.getLeft());
			
		}
		
		
		//should never reach this point
		System.err.println("ERROR: recursive exists function failed");
		return false;		
		
	}


	/*
	 * add i to the BST and return true,
	 * if i is already in the BST, print an error and return false
	 */
	private boolean add(int i) {

		if(!addRecur(i, root)) {
			System.out.println(i + " already exists in the BST");
			return false;
		}
		
		return true;
		
	}
	
	private boolean addRecur(int v, Node n) {
		
		if(n == null) {
			
			n = new Node(v);
			
			return true;
			
		} 
		
		int value = n.getValue();
		
		if(v == value) {
			
			return false;
			
		}
		
		if(v > value) {
			
			if(n.getRight() == null) {
				
				n.setRight(new Node(v));
				return true;
				
			} else {
				
				return addRecur(v, n.getRight());
				
			}
			
			
		}
		
		if(v < value) {
			
			if(n.getLeft() == null) {
				
				n.setLeft(new Node(v));
				return true;
				
			} else {
				
				return addRecur(v, n.getLeft());
				
			}
						
		}
		
		
		//should never reach this point
		System.err.println("ERROR: recursive add function failed");
		return false;
		
	}

	
	/*
	 * prints every entry in the BST in order, on one line separated by commas
	 */
	private void printInOrder() {
		
		printInOrderRecur(root);
		
	}
	
	
	private void printInOrderRecur(Node n) {
	
		if(n != null) {

			printInOrderRecur(n.getLeft());
			
			System.out.print(n.getValue() + ", ");
			
			printInOrderRecur(n.getRight());
			
		}
		
	}
	
	
}
