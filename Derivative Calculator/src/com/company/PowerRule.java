package com.company;
import com.company.ExpressionTree;

public class PowerRule {

    void printInorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.value + " ");

        /* now recur on right child */
        printInorder(node.right);
    }
}
