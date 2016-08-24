package sortTest;

/**
 * 搜索二叉树实现排序和查找
 * @author Administrator
 *
 */
public class TreeSearch {
	static boolean isExcute;  //这里把isExcute设置成静态变量用于监控节点是否已经成功插入
	
	/**
	 * 构建搜索二叉树
	 * @param arr
	 * @return
	 */
	public  TreeNode createTree(int []arr){
		TreeNode root = new TreeNode(arr[0],0,null,null);
		for(int i = 1;i < arr.length; i++){
			isExcute = false;
			insertNode(root,arr[i],i);
		}
		return root;
	}
	
	/**
	 * 插入节点
	 * @param node
	 * @param key
	 */
	public  void insertNode(TreeNode node,int key,int index){
		if(node == null){
			return;
		}
		if(node.data > key){
			insertNode(node.left,key, index);
		}else{
			insertNode(node.right,key,index);
		}
		/**
		 * 判断isExcute标志，如果不设置其为局部变量，递归的时候会出现节点覆盖
		 * 目前除了设置静态变量解决外还没有想到好的办法
		 */
		if(!isExcute){
			TreeNode current = new TreeNode(key,index,null,null);
			
			if(node.data > key){
				node.left = current;
			}else{
				node.right = current;
			}
			
			isExcute = true;
		}
	}
	
	/**
	 * 利用中序遍历二叉树，得到的结果就是排序结果
	 * @param root
	 */
	public void LDR_BST(TreeNode root){
		if(root != null){
			LDR_BST(root.left);
			System.out.print(root.data + " ");
			LDR_BST(root.right);
		}
	}
    /**
     * 在搜索二叉树中搜索要寻找的节点
     * @param args
     */
	public int search(TreeNode root,int key){
		if(root == null){
			return -1;
		}
		if(root.data == key){
			return root.index;
		}
		if(root.data > key){
			return search(root.left,key);
		}else{
			return search(root.right,key);
		}
	}
	
	public static void main(String[] args) {
		int []arr = {12,45,9,42,41,37,89,66,17};
		TreeSearch ts = new TreeSearch();
		TreeNode root = ts.createTree(arr);
		ts.LDR_BST(root);
		System.out.println();
		System.out.println(ts.search(root, 37));
	}
}

class TreeNode{
	public int data;
	public int index;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int data,int index,TreeNode left,TreeNode right){
		this.data = data;
		this.index = index;
		this.left = left;
		this.right = right;
	}
}
