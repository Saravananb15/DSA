package leetcode;

public class TreeNode {
	public static void main(String[] args) {

	}

	public TreeNode invertTree(TreeNode root) {
		helper(root.left, root.right);
		return root;
	}

	public static void helper(TreeNode left, TreeNode right) {
		int temp = left.val;
		left.val = right.val;
		right.val = temp;
	}

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
	}
}
