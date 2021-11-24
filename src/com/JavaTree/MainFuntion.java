package com.JavaTree;

import java.util.Scanner;

public class MainFuntion {
	public static void main(String[] args) {

		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(11);
		binaryTree.add(65);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(63);
		binaryTree.add(67);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice 1-> inOrder " + "2-> postOrder" + "3-> preOrder");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			binaryTree.inOrder();
			break;
		case 2:
			binaryTree.postOrder();
			break;
		case 3:
			binaryTree.preOrder();

		default:
			break;
		}

	}
}
