package com.company;
import static java.lang.String.format;

public class toPostfix {
    boolean isOperator(char c) {
        if (c == '+' || c == '-'
                || c == '*' || c == '/'
                || c == '^') {
            return true;
        }
        return false;
    }

     boolean checkPrecedence(char c1, char c2){
        if((c2 == '+' || c2 == '-') && (c1 == '+' || c1 == '-'))
            return true;
        else if((c2 == '*' || c2 == '/') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
            return true;
        else if((c2 == '^') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
            return true;
        else
            return false;
    }

     String convert(String infix){
        String postfix = "";
        Stack s = new Stack();
        Node node, symbol;
        node=new Node('#');
        s.push(node);

        for(int i = 0; i < infix.length(); i++){
            char inputSymbol = infix.charAt(i);
            if(isOperator(inputSymbol)){  //if (isOperator)
                while(checkPrecedence(inputSymbol, s.peek().value))
                    postfix += s.pop().value;
                symbol=new Node(inputSymbol);
                s.push(symbol);
            }
            else if(inputSymbol == '(')
            {symbol=new Node(inputSymbol);
                s.push(symbol); } //if (isLeftParenthesis)
            else if(inputSymbol == ')'){
                while(s.peek().value != '(')
                    postfix += s.pop().value;
                s.pop();
            } //rightParenthesis
            else
                postfix += inputSymbol;
        }

        while(s.peek().value != '#'){
            postfix += s.pop().value;

        }

        return postfix;
    }
}
