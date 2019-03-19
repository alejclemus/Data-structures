package com.company;

public class Node {
    Integer nodeType;
    Integer s,l;
    Node small, middle, large, parent;
    Node(Integer nodeType,Integer s, Integer l, Node parent ) {
        this.nodeType=nodeType;
        this.s=s;
        this.l=l;
        this.small=null;
        this.large=null;
        this.large=null;
        this.parent=parent;
    }

    Node search(Node currentNode, Integer item){
        if (currentNode!= null){
            if(currentNode.nodeType==3){
                if(currentNode.s >= item ){
                    return currentNode;
                }
                else {
                    if (item<currentNode.s)
                    {
                        return currentNode.small == null ? currentNode : search(currentNode.small, item);
                    }
                    else if(item > currentNode.l)
                    {
                    return currentNode.large == null ? currentNode : search(currentNode.large, item);
                    }
                    else
                        {
                    return currentNode.middle == null ? currentNode : search(currentNode.middle, item);
                        }
                }
            }
            else {
                if(currentNode.s == item) {
                    return currentNode;
                } else {
                    if(item < currentNode.s) {
                        return currentNode.small == null ? currentNode : search(currentNode.small, item);
                    } else {
                        return currentNode.large == null ? currentNode : search(currentNode.large, item);
                    }
                }
            }
        }
        else return null;
    }
}

