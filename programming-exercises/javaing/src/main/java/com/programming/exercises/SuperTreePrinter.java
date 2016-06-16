package com.programming.exercises;

import java.util.Scanner;

import com.programming.datastructures.BinaryTree;

public class SuperTreePrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        int numberOfNodes = in.nextInt();
        for (int i = 0; i < numberOfNodes; i++) {
            int data = in.nextInt();
            binaryTree.insert(data);
        }

        System.out.println("Tree Height: " + binaryTree.getHeight());

        System.out.println("Print Tree in level order (recursive): " + binaryTree.traverseMeLevelOrderRecursive());
        System.out.println("Print Mirror Tree in level order (recursive): " + binaryTree.traverseMirrorTreeRecursive());
        System.out.println("Print Tree using BF (recursive): " + binaryTree.traverseMeBreadthFirstRecursive());

        System.out.println("Print Tree in level order (non-recursive): " + binaryTree.traverseMeLevelOrderNonRecursive());
        System.out.println("Print Mirror Tree in level order (non-recursive): " + binaryTree.traverseMyMirrorTreeNonRecursive());
        System.out.println("Print Tree using BF (non-recursive): " + binaryTree.traverseMeBreadthFirstNonRecursive());
    }
}
