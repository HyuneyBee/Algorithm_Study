package leetcode;

public class leetcode226 {
    public TreeNode invertTree(TreeNode root) {
        inOrder(root);
        return root;
    }

    public void inOrder(TreeNode node){
        if(node == null) return;

        inOrder(node.left);
        inOrder(node.right);

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }


    public class TreeNode {
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

}
