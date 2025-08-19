package leetcode;

import java.util.PriorityQueue;

public class leetcode230 {
    int result = 0;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return result;
    }

    public void inOrder(TreeNode node, int k){
        inOrder(node.left, k);

        count++;
        if(count == k){
            result = node.val;
            return;
        }

        inOrder(node.right, k);
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



