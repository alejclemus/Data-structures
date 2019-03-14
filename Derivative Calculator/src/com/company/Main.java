package com.company;

public class Main {

    public static void main(String[] args) {
	ExpressionTree et=new ExpressionTree();
	toPostfix postfix=new toPostfix();
	String expression="3*x^2*(x^2 + 1)^3+e^2*x";
	String convertedExpression=postfix.convert(expression);
	char[] expressionarray=convertedExpression.toCharArray();
	Node root=et.constructTree(expressionarray);
	System.out.println("infix expression is");
	et.inorder(root);
    }
}
