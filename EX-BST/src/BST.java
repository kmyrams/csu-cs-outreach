
public class BST {

	private Node root;  
	
	
	public BST(int value) {
		
		root = new Node(value);
		
	}
	
	/*Correct Output: 
	  
23 already exists in the BST
5 already exists in the BST
2 doesn't exist in the BST
64 exists in the BST
95 exists in the BST
53 doesn't exist in the BST
12 exists in the BST
5, 12, 19, 23, 35, 50, 63, 64, 78, 95, 
	  
	 */
	
	
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
		
		
		
	}



	/*
	 * add i to the BST,
	 * if i is already in the BST, print an error and don't add i again
	 */
	private void add(int i) {

		
		
	}

	
	/*
	 * prints every entry in the BST in order, on one line separated by commas
	 */
	private void printInOrder() {
		
		
		
	}
	
	
	
}
