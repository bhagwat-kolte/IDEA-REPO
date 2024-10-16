package org.amol.dsa.scottb.llist.impl;

/**
 * @author Bhagwat Kolte
 * Java Program to create Linked list
 */
public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public class Node{
        public int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;

        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);

        if (length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        length--;
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if (length == 0 || index < 0 || index > length) return null;
        Node temp = head;

        int i = 0;
        while(temp != null && i != index){
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public boolean set(int index, int value){

        if (length == 0 || index < 0 || index > length) return false;
        Node temp = get(index);

        if (temp != null){
            temp.value = value;
            length++;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){

        if (length == 0 || index < 0 || index > length) return false;
        Node temp = get(index - 1);
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        length++;
        return true;
    }

    public boolean remove(int index){

        if (length == 0 || index < 0 || index > length) return false;
        Node temp = get(index - 1);
        Node temp1 = get(index);
        temp.next = temp1.next;
        length--;
        return true;
    }

    public void reverse(){

        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }

    public int getHead() {
        return head.value;
    }

    public int getTail() {
        return tail.value;
    }

    public int getLength() {
        return length;
    }
}
