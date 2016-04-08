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

    public String traverseMeBSF() {
        StringBuilder stringBuilder = new StringBuilder();
        traverseBSF(_root, stringBuilder);
        return stringBuilder.toString();
    }

    private void traverseBSF(Node node, StringBuilder stringBuilder) {
        if (node == null) {
            return;
        }
        stringBuilder.append(node._data).append(" ");
        traverseBSF(node._left, stringBuilder);
        traverseBSF(node._right, stringBuilder);
    }

    /**
     * Traverse this tree in level order. Each line represents a level in the tree. Does not use recursion.
     */
    public String traverseMeNonRecursive() {
        StringBuilder stringBuilder = new StringBuilder();
        Queue<Node> queue = new LinkedList<>();
        if (_root != null) {
            queue.add(_root);
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                if (node != null) {
                    stringBuilder.append(node._data).append(" ");
                    queue.add(node._left);
                    queue.add(node._right);
                }
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Traverse a mirror tree from this tree in level order. Each line represents a level in the mirror tree. Dos not use recursion.
     */
    public String traverseMyMirrorTreeNonRecursive() {
        StringBuilder stringBuilder = new StringBuilder();
        Queue<Node> queue = new LinkedList<>();
        if (_root != null) {
            queue.add(_root);
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                if (node != null) {
                    stringBuilder.append(node._data).append(" ");
                    queue.add(node._right);
                    queue.add(node._left);
                }
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Traverse this tree in level order. Each line represents a level in the tree. Uses recursion.
     */
    public String traverseMeLevelOrderRecursive() {
        StringBuilder stringBuilder = new StringBuilder();
        traverseLevelOrderRecursive(_root, stringBuilder);
        return stringBuilder.toString();
    }

    /**
     * Traverse a mirror tree from this tree in level order. Each line represents a level in the mirror tree. Uses recursion.
     */
    public String traverseMyMirrorTreeRecursive() {
        StringBuilder stringBuilder = new StringBuilder();
        traverseMirrorTreeLevelOrder(_root, stringBuilder);
        return stringBuilder.toString();
    }

    private void traverseMirrorTreeLevelOrder(Node node, StringBuilder stringBuilder) {
        int treeHeight = getHeight();
        for (int level = 1; level <= treeHeight; level++) {
            traverseMirrorTreeInLevel(node, level, stringBuilder);
        }
    }

    private void traverseMirrorTreeInLevel(Node node, int level, StringBuilder stringBuilder) {
        if (node != null) {
            if (level == 1) {
                stringBuilder.append(node._data).append(" ");
            } else if (level > 1) {
                traverseMirrorTreeInLevel(node._right, level - 1, stringBuilder);
                traverseMirrorTreeInLevel(node._left, level - 1, stringBuilder);
            }
        }
    }

    private void traverseLevelOrderRecursive(Node node, StringBuilder stringBuilder) {
        int treeHeight = getHeight();
        for (int level = 1; level <= treeHeight; level++) {
            traverseNodesInLevel(node, level, stringBuilder);
        }
    }

    private void traverseNodesInLevel(Node node, int level, StringBuilder stringBuilder) {
        if (node != null) {
            if (level == 1) {
                stringBuilder.append(node._data).append(" ");
            } else if (level > 1) {
                traverseNodesInLevel(node._left, level - 1, stringBuilder);
                traverseNodesInLevel(node._right, level - 1, stringBuilder);
            }
        }
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
