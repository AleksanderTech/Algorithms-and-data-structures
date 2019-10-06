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

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }
}
