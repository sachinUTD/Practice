package scr.amazon;

public class BST_RangeSum {

	    int rage_sum;
	    public int rangeSumBST(TreeNode root, int L, int R) 
	    {
	        rage_sum=0;
	        dfs(root,L,R);
	        return rage_sum;
	        
	    }
	    
	    public void dfs(TreeNode root, int L , int R){
	        
	        if(root!=null)
	        {
	            if(root.val>=L && root.val<=R){
	             rage_sum += root.val;   
	            }
	            if(root.val>L)
	            {
	                dfs(root.left,L,R);
	            }
	            if(root.val<R){
	                dfs(root.right,L,R);
	            }
	        }
	    }
}



 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
