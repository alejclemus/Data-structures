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

    private boolean checkPrecedence(char c1, char c2){
        if((c2 == '+' || c2 == '-') && (c1 == '+' || c1 == '-'))
            return true;
        else if((c2 == '*' || c2 == '/') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
            return true;
        else if((c2 == '^') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
            return true;
        else
            return false;
    }

    public String convert(String infix){
        System.out.printf("%-8s%-10s%-15s\n", "Input","Stack","Postfix");
        String postfix = "";
        Stack s = new Stack();
        Node node, symbol;
        node=new Node('#');
        s.push(node);

        System.out.printf("%-8s%-10s%-15s\n", "",format(s.toString()),postfix);

        for(int i = 0; i < infix.length(); i++){
            char inputSymbol = infix.charAt(i);
            if(isOperator(inputSymbol)){  //if (isOperator)
                while(checkPrecedence(inputSymbol, s.peek().value))
                    postfix += s.pop();
                symbol=new Node(inputSymbol);
                s.push(symbol);
            }
            else if(inputSymbol == '(')
            {symbol=new Node(inputSymbol);
                s.push(symbol); } //if (isLeftParenthesis)
            else if(inputSymbol == ')'){
                while(s.peek().value != '(')
                    postfix += s.pop();
                s.pop();
            } //rightParenthesis
            else
                postfix += inputSymbol;
            System.out.printf("%-8s%-10s%-15s\n", ""+inputSymbol,format(s.toString()),postfix);
        }

        while(s.peek().value != '#'){
            postfix += s.pop();
            System.out.printf("%-8s%-10s%-15s\n", "",format(s.toString()),postfix);

        }

        return postfix;
    }
}
