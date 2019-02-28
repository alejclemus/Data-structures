package com.company;

public class Company {
    Node head;

    class Node {
        Workers worker;
        Node next;

        Node(int s, String n)
        {
            worker=new Workers(s,n);
        }
    }

    void availableWorkers(){
        head=new Node(420-57-2435,"Gusti Ádhamh Hasenkamp");
        Node second=new Node(574-70-1745,"Indumathi Gianna Norwood");
        Node third=new Node(527-53-2977,"Emil Börje Porcher");
        Node fourth=new Node(522-93-8415,"Hadi Olle Donohoe");
        Node fifth=new Node(401-35-8118 ,"Gertrude Molle Hearn");

            head.next=second;
            second.next=third;
            third.next=fourth;
            fourth.next=fifth;
    }

}
