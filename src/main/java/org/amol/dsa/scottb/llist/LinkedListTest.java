package org.amol.dsa.scottb.llist;

import org.amol.dsa.scottb.llist.impl.LinkedList;
import org.w3c.dom.Node;


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
        list.printList();

        System.out.println("Removed = " + list.removeLast().value);

        list.printList();
        list.prepend(876);
        list.printList();

        System.out.println("Removed = " + list.removeFirst().value);
        list.printList();

        System.out.println("Get = " + list.get(3).value);
        boolean flg = list.set(3, 8765);
        list.printList();

        boolean flg1 = list.insert(2, 333);
        list.printList();

        boolean flg2 = list.remove(2);
        list.printList();

        list.reverse();
        list.printList();
    }
}
