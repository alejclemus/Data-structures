package com.company;

public class Main {

    public static void main(String[] args) {
	ExpressionTree et=new ExpressionTree();
	String expression="3x^2 * (x^2 + 1)^3 + e^2x";
	char[] expressionarray=expression.toCharArray();
	Node root=et.constructTree(expressionarray);
	System.out.println("infix expression is");
	et.inorder(root);
    }
}
