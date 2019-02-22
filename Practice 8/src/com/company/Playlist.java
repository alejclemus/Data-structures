package com.company;


 class Playlist {

    Node head;

    class Node {
        Song song;
        Node next;
        Node previous;

        Node(String name, String artist)
        {
            song=new Song(name,artist);
        }
    }


    void addSong(String n, String a)
    {
        Node newNode = new Node(n,a);
        Node last = head;
        newNode.next = null;

        if (head == null) {
            newNode.previous = null;
            head = newNode;
            return;
        }

        while (last.next != null)
        {
            last = last.next;
        }

        last.next = newNode;

        newNode.previous = last;
    }

    void playNow(Node node)
    {
        head=node;
    }

    void playNext(Node node)
    {
        node=node.next;
        head=node;
    }

    void playPrevious(Node node){
        node=node.previous;
        head=node;
    }


    void printPlaylist(Node node)
    {

        System.out.println("Playlist: ");
        while (node != null) {
            System.out.print(node.song.name +" -"+node.song.artist+ "\n");
            node = node.next;
        }

    }

}