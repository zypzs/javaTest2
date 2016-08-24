package 剑指Offer通过的代码;

public class 二叉树的镜像 {
	public void Mirror(TreeNode root) {
        if(root != null){
            Mirror(root.left);
            Mirror(root.right);
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }
}
