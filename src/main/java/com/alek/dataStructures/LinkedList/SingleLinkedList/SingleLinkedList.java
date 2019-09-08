package com.alek.dataStructures.LinkedList.SingleLinkedList;

public class SingleLinkedList<E> {

    private Node<E> headNode;

    private static class Node<E> {

        private E element;
        private Node<E> nextNode;

        public Node(E element) {
            this.element = element;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public String toString() {
            return element.toString();
        }
    }

    public void addToFront(E element) {
        Node<E> node = new Node(element);

        node.setNextNode(headNode);
        headNode = node;
    }

    public boolean isEmpty() {
        return headNode == null;
    }

    public boolean add(int index, E element) {
        return false;
    }

    public E remove(int index) {

        return null;
    }

    public int size() {
        int size = 0;
        Node<E> currentNode = headNode;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.nextNode;
        }
        return size;
    }


    public E get(int index) {
        if (isEmpty() || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index);
        }

        Node<E> currentNode = headNode;
        int currentIndex = index;
        while (currentIndex > 0) {
            if (currentNode == null) {
                throw new IndexOutOfBoundsException("Index " + index);
            }
            currentNode = currentNode.nextNode;
            currentIndex--;
        }

        return currentNode.element;
    }


    public void printList() {

        Node<E> current = headNode;
        System.out.print("HEAD -> ");
        while (current != null) {

            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextNode();
        }
        System.out.println("null");
    }
}
