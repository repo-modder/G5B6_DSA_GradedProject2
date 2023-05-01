package com.gl.client;

import java.util.Scanner;

import com.gl.dsa.BinarySearchTree;

public class Client {
	public static void main(String[] args) {
		BinarySearchTree tree= new BinarySearchTree();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of nodes : ");
		int n = sc.nextInt();
		System.out.println("enter the nodes : ");
		for(int i=0; i<n; ++i) {
			int j = sc.nextInt();
			tree.insert(j);
		}
		
//		tree.insert(50);
//		tree.insert(30);
//		tree.insert(60);
//		tree.insert(10);
//		tree.insert(55);
		
		System.out.println("Output : ");
		tree.displaySkewedTree();
		System.out.println();
	}
}
