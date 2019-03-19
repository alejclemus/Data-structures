package com.company;

public class Btree {
    String[] keys;
    int t;
    Node root;

    String traverse(Node currentNode){
        String result="";
        if (currentNode != null)
        {
            result+= traverse(currentNode.small);
                    if(currentNode.s!=null)
                    {
                        result+=currentNode.s+" ";
                    }
                    else {

                    }
             result+=traverse(currentNode.middle);
                    if(currentNode.l!=null){
                        result+=currentNode.l+" ";
                    }
              result+=traverse(currentNode.large);
        }
        return result;
    }

}
