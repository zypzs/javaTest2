package 剑指Offer2;

public class 二叉树的深度 {
	public int TreeDepth(TreeNode pRoot)
    {
       if(pRoot == null){
           return 0;
       }
        int nLeft = TreeDepth(pRoot.left);
        int nRight = TreeDepth(pRoot.right);
        return (nLeft > nRight) ? (nLeft + 1) : (nRight + 1);
    }
}
