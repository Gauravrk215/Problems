package com.example.demo.test5;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0; // Base case: empty tree
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		int depth = 0;

		while (!queue.isEmpty()) {
			int levelSize = queue.size(); // Number of nodes at the current level
			for (int i = 0; i < levelSize; i++) {
				TreeNode current = queue.poll();

				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
			}
			depth++; // Increment depth after processing the level
		}

		return depth;
	}

	public class TreeNode {
		int val; // Value of the node
		TreeNode left; // Left child
		TreeNode right; // Right child

		// Constructor
		public TreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

	public static void main(String[] args) {
		MaximumDepthofBinaryTree solution = new MaximumDepthofBinaryTree();

		// Example binary tree
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		System.out.println(solution.maxDepth(root)); // Output: 3
	}
}
