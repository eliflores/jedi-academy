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
        System.out.println("Print Tree in level order (recursive):");
        binaryTree.printMeRecursive();
        System.out.println("Print Mirror Tree in level order (recursive):");
        binaryTree.printMyMirrorTreeRecursive();
        System.out.println("Print Tree using BFS (recursive):");
        binaryTree.printMeBSF();
        System.out.println("Print Tree in level order (non-recursive):");
        binaryTree.printMeNonRecursive();
        System.out.println("Print Mirror Tree in level order (non-recursive):");
        binaryTree.printMyMirrorTreeNonRecursive();
    }
}
