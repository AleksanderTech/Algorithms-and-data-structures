package com.alek.datastructure.tree;

public class TreeNode {

    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public void insert(int value) {

        if (value == data) {
            return;
        } else if (value > data) {
            if (rightNode == null) {
                rightNode = new TreeNode(value);
            } else {
                rightNode.insert(value);
            }
        } else {
            if (leftNode == null) {
                leftNode = new TreeNode(value);
            } else {
                leftNode.insert(value);
            }
        }
    }

    public TreeNode get(int value) {

        if (data == value) {
            return this;
        } else if (value < data) {
            if (leftNode != null) {
                return leftNode.get(value);
            }
        } else {
            if (rightNode != null) {
                return rightNode.get(value);
            }
        }
        return null;
    }

    public TreeNode min() {

        if (leftNode != null) {
            return leftNode.min();
        } else {
            return this;
        }
    }

    public TreeNode max() {

        if (rightNode != null) {
            return rightNode.max();
        } else {
            return this;
        }
    }

    public void delete(TreeNode node, int value) {

        if (data == value) {


        } else if (value < data) {
            if (leftNode != null) {
                leftNode.get(value);
            }
        } else {
            if (rightNode != null) {
                rightNode.get(value);
            }
        }
    }

    public void traverseInOrder() {

        if (leftNode != null) {
            leftNode.traverseInOrder();
        }
        System.out.println("Data: " + data + ", ");
        if (rightNode != null) {
            rightNode.traverseInOrder();
        }
    }
}
