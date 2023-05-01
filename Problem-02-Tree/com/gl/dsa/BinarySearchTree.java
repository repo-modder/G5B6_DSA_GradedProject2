package com.gl.dsa;

import java.util.HashSet;
import java.util.Set;

public class BinarySearchTree {
	
	private static class Node{
		int val;
		Node left;
		Node right;
		
		public Node (int val) {
			this.val = val;
			this.left=null;
			this.right=null;
		}
	}
	
	private Node root;
	
	public BinarySearchTree() {
		root=null;
	}
	
	public void insert(int val) {
		root = insert(root,val);
	}
	
	public Node insert(Node node, int val) {
		if(node == null) {
			node = new Node(val);
		} 
		if (node.val > val){
			node.left = insert(node.left,val);
		}
		if (node.val < val){
			node.right = insert(node.right,val);
		}
		return node;
	}
	
	
	public void displaySkewedTree() {
		displaySkewedTree(root);
	}
	
	private void displaySkewedTree(Node node) {
		if(node == null) {
			return;
		}
		displaySkewedTree(node.left);
		System.out.print(node.val + " ");
		displaySkewedTree(node.right);
	}	
}
