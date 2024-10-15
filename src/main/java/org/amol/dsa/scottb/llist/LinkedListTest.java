package org.amol.dsa.scottb.llist;

import org.amol.dsa.scottb.llist.impl.LinkedList;

/**
 * @author Bhagwat Kolte
 * java program to check LinkedList implementation
 */
public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList list = new LinkedList(4);

        list.append(6);
        list.append(16);
        list.append(62);
        list.append(26);
        list.append(64);

//        System.out.println("Head = " + list.getHead());
//        System.out.println("Tail = " + list.getTail());
//        System.out.println("Length = " + list.getLength());

        list.printList();

    }
}
