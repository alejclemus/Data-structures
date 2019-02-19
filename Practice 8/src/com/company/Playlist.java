package com.company;

public class Playlist {

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


    public void addSong(String n, String a)
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

    public void playNext()
    {

    }

    public void playPrevious(){

    }

    public void printPlaylist(Node node)
    {
        Node last = null;
        System.out.println("Playlist: \n");
        while (node != null) {
            System.out.print(node.song + " ");
            last = node;
            node = node.next;
        }

    }

}