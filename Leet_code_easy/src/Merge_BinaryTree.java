package scr.amazon;

public class Merge_BinaryTree {

	public static void main(String[] args) {
		TreeNode1 t1 = null;
		TreeNode1 t2 = null;
		TreeNode1 t3 = binaryTreeMrg(t1,t2);
		
		
	}

	private static TreeNode1 binaryTreeMrg(TreeNode1 t1, TreeNode1 t2) {
		if(t1==null){
	         return t2;
	        }
	        if(t2==null){
	            return t1;
	        }
	        t1.val +=t2.val;
	        t1.left = binaryTreeMrg(t1.left,t2.left);
	        t1.right = binaryTreeMrg(t1.right,t2.right);
	        return t1;
	}
}

class TreeNode1 {
     int val;
     TreeNode1 left;
     TreeNode1 right;
     TreeNode1() {}
     TreeNode1(int val) { this.val = val; }
     TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }