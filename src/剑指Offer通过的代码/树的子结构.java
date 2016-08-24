package 剑指Offer通过的代码;

public class 树的子结构 {
	 public boolean HasSubtree(TreeNode root1,TreeNode root2) {
	        
    	 boolean flg = false;
         if(root1 != null && root2!= null){
              if(root1.val == root2.val){
    	            flg = check(root1,root2);
    	        }
    	        if(!flg){
    	            flg = HasSubtree(root1.left,root2);
    	            if(!flg){
    	                flg = HasSubtree(root1.right,root2); 
    	            }
    	        }
         }
    	       
         return flg;

     }
    	    
    private boolean check(TreeNode t1,TreeNode t2){
        if(t2 == null)
            return true;
        if(t1 == null && t2 != null)
            return false;
        if(t1.val != t2.val){
            return false;

        }
        return check(t1.left,t2.left) && check(t1.right,t2.right);
    }
}
