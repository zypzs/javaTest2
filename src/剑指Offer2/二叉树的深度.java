package ��ָOffer2;

public class ����������� {
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
