package com.alek.datastructure.tree;

public class Tree {

    private TreeNode root;

    public void insert(int value) {

        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public TreeNode get(int value) {

        if (root != null) {
            return root.get(value);
        } else return null;
    }

    public TreeNode min() {

        if (root != null) {
            return root.min();
        } else {
            return null;
        }
    }

    public TreeNode max() {

        if (root != null) {
            return root.max();
        } else {
            return null;
        }
    }

    public void delete(int value) {

        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {

        if (subtreeRoot == null) {
            return subtreeRoot;
        }
        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeftNode(delete(subtreeRoot.getLeftNode(), value));
        } else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRightNode(delete(subtreeRoot.getRightNode(), value));
        } else {
            if (subtreeRoot.getLeftNode() == null) {
                return subtreeRoot.getRightNode();
            } else if (subtreeRoot.getRightNode() == null) {
                return subtreeRoot.getLeftNode();
            }
        }
        return subtreeRoot;
    }

    public void traverseInOrder() {

        if (root != null) {
            root.traverseInOrder();
        }
    }
}
