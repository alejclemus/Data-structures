package com.company;

public class Company {
    Node head;

    class Node {
        Worker worker;
        Node next;

        Node(int s, int d, String n)
        {
            worker=new Worker(s,d,n);
        }
    }

    void availableWorkers(){
        head=new Node(420-57-2435,0,"Gusti Ádhamh Hasenkamp");
        Node second=new Node(574-70-1745,0,"Indumathi Gianna Norwood");
        Node third=new Node(527-53-2977,0,"Emil Börje Porcher");
        Node fourth=new Node(522-93-8415,0,"Hadi Olle Donohoe");
        Node fifth=new Node(401-35-8118 ,0,"Gertrude Molle Hearn");

            head.next=second;
            second.next=third;
            third.next=fourth;
            fourth.next=fifth;
    }

    void print(){

    }

}
