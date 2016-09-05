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

        System.out.println("Print Tree DFS (recursive): " + binaryTree.traverseMeDepthFirstRecursive());
        System.out.println("Print Mirror Tree BFS (recursive): " + binaryTree.traverseMirrorTreeRecursive());
        System.out.println("Print Tree using DFS (non-recursive): " + binaryTree.traverseMeDepthFirstNonRecursive());

        System.out.println("Print Tree BFS (non-recursive): " + binaryTree.traverseMeBreathFirstNonRecursive());
        System.out.println("Print Mirror Tree BFS (non-recursive): " + binaryTree.traverseMyMirrorTreeNonRecursive());
        System.out.println("Print Tree using BFS (non-recursive): " + binaryTree.traverseMeBreadthFirstRecursive());
    }
}
