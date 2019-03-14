package com.company;

public class ExpressionTree {

    boolean isOperator(char c) {
        if (c == '+' || c == '-'
                || c == '*' || c == '/'
                || c == '^') {
            return true;
        }
        return false;
    }

    boolean isNumber(char c){
        return (Character.isDigit(c));
    }

    boolean isVariable(char c){
        return (Character.isLetter(c));
    }

    boolean isParenthesis(char c){
        if(c== '(' || c== ')'){
            return true;
        }
        return false;
    }

    void inorder(Node t) {
        if (t != null) {
            inorder(t.left);
            System.out.print(t.value + " ");
            inorder(t.right);
        }
    }

    Node constructTree(char Expression[]) {
        Stack nodeStack = new Stack();
        Node t, t1, t2;


        for (int i = 0; i < Expression.length; i++) {

            for(int j=0; j<Expression.length;j++){
                if (isParenthesis(Expression[j])){


                    }
                }

             if (isNumber(Expression[i])) {
                    t = new Node(Expression[i]);
                    nodeStack.push(t);
                }
            else if (isOperator(Expression[i])){
                t = new Node(Expression[i]);
                    //System.out.println(t.value);
                    //System.out.println("/"+"\\");
                t1 = nodeStack.pop();
                t2 = nodeStack.pop();
                t.left = t1;
                    //System.out.print(t.left.value+" ");
                t.right = t2;
                    //System.out.print(t.right.value);
                nodeStack.push(t);
            }
            else if(isParenthesis(Expression[i])){

            }
            else //if (isVariable)
            {
                i++;
            }
        }
        t = nodeStack.peek();
        nodeStack.pop();

        return t;
    }
}
