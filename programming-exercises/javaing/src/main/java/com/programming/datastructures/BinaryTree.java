package com.programming.datastructures;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

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

    public Node findNode(int data) {
        return findNodeBreadthFirst(_root, data);

    }

    private Node findNodeBreadthFirst(Node root, int data) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node != null) {
                if (node._data == data) {
                    return node;
                }
                queue.add(node._left);
                queue.add(node._right);
            }
        }
        return null;
    }

    public boolean isLeaf(int data) {
        Node node = findNodeBreadthFirst(_root, data);
        return node != null && node._right == null && node._left == null;

    }

    public boolean hasCycle() {
        Set<Integer> alreadyVisitedNodes = new HashSet<>();
        return hasCycleDepthFirst(_root._left, alreadyVisitedNodes) || hasCycleDepthFirst(_root._right, alreadyVisitedNodes);
    }

    private boolean hasCycleDepthFirst(Node root, Set<Integer> alreadyVisitedNodes) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node != null) {
                if (alreadyVisitedNodes.contains(node._data)) {
                    return true;
                }
                alreadyVisitedNodes.add(node._data);
                queue.add(node._left);
                queue.add(node._right);
            }
        }
        return false;
    }

    public String traverseMeDepthFirstRecursive() {
        StringBuilder stringBuilder = new StringBuilder();
        traverseDepthFirst(_root, stringBuilder);
        return stringBuilder.toString();
    }

    private void traverseDepthFirst(Node node, StringBuilder stringBuilder) {
        if (node == null) {
            return;
        }
        stringBuilder.append(node._data).append(" ");
        traverseDepthFirst(node._left, stringBuilder);
        traverseDepthFirst(node._right, stringBuilder);
    }

    public String traverseMeDepthFirstNonRecursive() {
        StringBuilder stringBuilder = new StringBuilder();
        if (_root != null) {
            stringBuilder.append(_root._data).append(" ");
            stringBuilder.append(traverseTreeNonRecursive(_root._left));
            stringBuilder.append(traverseTreeNonRecursive(_root._right));
        }
        return stringBuilder.toString();
    }

    private String traverseTreeNonRecursive(Node root) {
        StringBuilder stringBuilder = new StringBuilder();
        Queue<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
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


    public String traverseMeBreathFirstNonRecursive() {
        if (_root != null) {
            return traverseTreeNonRecursive(_root);
        }
        return "";
    }

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

    public String traverseMeBreadthFirstRecursive() {
        StringBuilder stringBuilder = new StringBuilder();
        traverseBreadthFirstRecursive(_root, stringBuilder);
        return stringBuilder.toString();
    }


    public String traverseMirrorTreeRecursive() {
        StringBuilder stringBuilder = new StringBuilder();
        traverseMirrorTreeBreadthFirst(_root, stringBuilder);
        return stringBuilder.toString();
    }

    private void traverseMirrorTreeBreadthFirst(Node node, StringBuilder stringBuilder) {
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

    private void traverseBreadthFirstRecursive(Node node, StringBuilder stringBuilder) {
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

    static class Node {
        private Node _left;
        private Node _right;
        private int _data;

        private Node(int data) {
            _left = null;
            _right = null;
            _data = data;
        }

        void setLeft(Node node) {
            _left = node;
        }

        void setRight(Node node) {
            _right = node;
        }

        public int getData() {
            return _data;
        }
    }
}
