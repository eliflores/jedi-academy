package com.programming.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BinaryTreeTest {
    private BinaryTree binaryTree;

    @Before
    public void setUp() throws Exception {
        binaryTree = new BinaryTree();
        binaryTree.insert(5);
        binaryTree.insert(4);
        binaryTree.insert(8);
        binaryTree.insert(2);
        binaryTree.insert(7);
        binaryTree.insert(10);
        binaryTree.insert(3);
        binaryTree.insert(12);
    }

    @Test
    public void getHeight() throws Exception {
        BinaryTree emptyTree = new BinaryTree();
        assertThat(emptyTree.getHeight(), is(0));
        assertThat(binaryTree.getHeight(), is(4));
    }

    @Test
    public void traverseMeDepthFirstRecursive() throws Exception {
        assertThat(binaryTree.traverseMeDepthFirstRecursive(), is("5 4 2 3 8 7 10 12 "));
    }

    @Test
    public void traverseMeBreathFirstNonRecursive() throws Exception {
        assertThat(binaryTree.traverseMeBreathFirstNonRecursive(), is("5 4 8 2 7 10 3 12 "));
    }

    @Test
    public void traverseMyMirrorTreeNonRecursive() throws Exception {
        assertThat(binaryTree.traverseMyMirrorTreeNonRecursive(), is("5 8 4 10 7 2 12 3 "));
    }

    @Test
    public void traverseMeBreadthFirstRecursive() throws Exception {
        assertThat(binaryTree.traverseMeBreadthFirstRecursive(), is("5 4 8 2 7 10 3 12 "));
    }

    @Test
    public void traverseMirrorTreeRecursive() throws Exception {
        assertThat(binaryTree.traverseMirrorTreeRecursive(), is("5 8 4 10 7 2 12 3 "));
    }

    @Test
    public void traverseMeDepthFirstNonRecursive() throws Exception {
        assertThat(binaryTree.traverseMeDepthFirstNonRecursive(), is("5 4 2 3 8 7 10 12 "));
    }

    @Test
    public void findNode() throws Exception {
        BinaryTree.Node node = binaryTree.findNode(10);
        assertNotNull(node);
        assertThat(node.getData(), is(10));

        BinaryTree.Node notFoundNode = binaryTree.findNode(20);
        assertNull(notFoundNode);
    }

    @Test
    public void isLeaf() throws Exception {
        assertFalse(binaryTree.isLeaf(5));
        assertFalse(binaryTree.isLeaf(4));
        assertFalse(binaryTree.isLeaf(2));
        assertTrue(binaryTree.isLeaf(3));
        assertTrue(binaryTree.isLeaf(7));
        assertTrue(binaryTree.isLeaf(12));

    }

    @Test
    public void hasCycle() throws Exception {
        assertFalse(binaryTree.hasCycle());

        BinaryTree binaryTreeWithCycle = new BinaryTree();
        binaryTreeWithCycle.insert(5);
        binaryTreeWithCycle.insert(4);
        binaryTreeWithCycle.insert(8);
        binaryTreeWithCycle.insert(2);
        binaryTreeWithCycle.insert(3);

        // Here we'll insert the cycle.
        BinaryTree.Node node = binaryTreeWithCycle.findNode(3);
        BinaryTree.Node nodeToCycleTo = binaryTreeWithCycle.findNode(4);
        node.setLeft(nodeToCycleTo);

        assertTrue(binaryTreeWithCycle.hasCycle());
    }
}