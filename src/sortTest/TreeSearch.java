package sortTest;

/**
 * ����������ʵ������Ͳ���
 * @author Administrator
 *
 */
public class TreeSearch {
	static boolean isExcute;  //�����isExcute���óɾ�̬�������ڼ�ؽڵ��Ƿ��Ѿ��ɹ�����
	
	/**
	 * ��������������
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
	 * ����ڵ�
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
		 * �ж�isExcute��־�������������Ϊ�ֲ��������ݹ��ʱ�����ֽڵ㸲��
		 * Ŀǰ�������þ�̬��������⻹û���뵽�õİ취
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
	 * ��������������������õ��Ľ������������
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
     * ������������������ҪѰ�ҵĽڵ�
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
