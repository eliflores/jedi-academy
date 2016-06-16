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
    public void traverseMeBreadthFirstRecursive() throws Exception {
        assertThat(binaryTree.traverseMeBreadthFirstRecursive(), is("5 4 2 3 8 7 10 12 "));
    }

    @Test
    public void traverseMeLevelOrderNonRecursive() throws Exception {
        assertThat(binaryTree.traverseMeLevelOrderNonRecursive(), is("5 4 8 2 7 10 3 12 "));
    }

    @Test
    public void traverseMyMirrorTreeNonRecursive() throws Exception {
        assertThat(binaryTree.traverseMyMirrorTreeNonRecursive(), is("5 8 4 10 7 2 12 3 "));
    }

    @Test
    public void traverseMeLevelOrderRecursive() throws Exception {
        assertThat(binaryTree.traverseMeLevelOrderRecursive(), is("5 4 8 2 7 10 3 12 "));
    }

    @Test
    public void traverseMirrorTreeRecursive() throws Exception {
        assertThat(binaryTree.traverseMirrorTreeRecursive(), is("5 8 4 10 7 2 12 3 "));
    }

    @Test
    public void traverseMeBreadthFirstNonRecursive() throws Exception {
        assertThat(binaryTree.traverseMeBreadthFirstNonRecursive(), is("5 4 2 3 8 7 10 12 "));
    }
}