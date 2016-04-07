package com.programming.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private Node _root;

    public void insert(int data) {
        _root = insert(_root, data);
    }

    public int getHeight() {
        return getHeight(_root);
    }

    private int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root._left), getHeight(root._right));
    }

    public void printMeBSF() {
        printMeBSF(_root);
        System.out.println("  ");
    }

    private void printMeBSF(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node._data + " ");
        printMeBSF(node._left);
        printMeBSF(node._right);
    }

    /**
     * Print trees in level order. Each line represents a level in the tree. Does not use recursion.
     */
    public void printMeNonRecursive() {
        Queue<Node> queue = new LinkedList<>();
        if (_root != null) {
            queue.add(_root);
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                if (node != null) {
                    System.out.print(node._data + " ");
                    queue.add(node._left);
                    queue.add(node._right);
                }
            }
        }
        //TODO Do not like this line below, rather return a string with the nodes data and let the caller print it.
        System.out.println("  ");
    }

    /**
     * Print a mirror tree from original tree in level order. Each line represents a level in the mirror tree. Dos not use recursion.
     */
    public void printMyMirrorTreeNonRecursive() {
        Queue<Node> queue = new LinkedList<>();
        if (_root != null) {
            queue.add(_root);
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                if (node != null) {
                    System.out.print(node._data + " ");
                    queue.add(node._right);
                    queue.add(node._left);
                }
            }
        }
        //TODO Do not like this line below, rather return a string with the nodes data and let the caller print it.
        System.out.println(" ");
    }

    /**
     * Print trees in level order. Each line represents a level in the tree. Uses recursion.
     */
    public void printMeRecursive() {
        printLevelOrder(_root);
        //TODO Do not like this line below, rather return a string with the nodes data and let the caller print it.
        System.out.println("  ");
    }

    /**
     * Print a mirror tree from original tree in level order. Each line represents a level in the mirror tree. Uses recursion.
     */
    public void printMyMirrorTreeRecursive() {
        printMirrorTreeLevelOrder(_root);
        //TODO Do not like this line below, rather return a string with the nodes data and let the caller print it.
        System.out.println("  ");
    }

    private void printMirrorTreeLevelOrder(Node node) {
        int treeHeight = getHeight();
        for (int level = 1; level <= treeHeight; level++) {
            printMirrorTreeNodesInLevel(node, level);
        }
    }

    private void printMirrorTreeNodesInLevel(Node node, int level) {
        if (node != null) {
            if (level == 1) {
                System.out.print(node._data + " ");
            } else if (level > 1) {
                printMirrorTreeNodesInLevel(node._right, level - 1);
                printMirrorTreeNodesInLevel(node._left, level - 1);
            }
        }
    }

    private void printLevelOrder(Node node) {
        int treeHeight = getHeight();
        for (int level = 1; level <= treeHeight; level++) {
            printNodesInLevel(node, level);
        }
    }

    private void printNodesInLevel(Node node, int level) {
        if (node != null) {
            if (level == 1) {
                System.out.print(node._data + " ");
            } else if (level > 1) {
                printNodesInLevel(node._left, level - 1);
                printNodesInLevel(node._right, level - 1);
            }
        }
    }

    private Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (data <= node._data) {
                node._left = insert(node._left, data);
            } else {
                node._right = insert(node._right, data);
            }
        }

        return node;
    }

    private static class Node {
        Node _left;
        Node _right;
        int _data;

        Node(int data) {
            _left = null;
            _right = null;
            _data = data;
        }
    }
}
