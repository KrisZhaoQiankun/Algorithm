package com.senwolf.array;

import org.w3c.dom.ls.LSException;

import java.util.LinkedList;
import java.util.List;

/**
 * @author SenWolf
 * @date 2021/12/19 19:50
 * 单链表反转
 */
public class LinkListReverse {



    private static class ListNode {
        private String data;
        private ListNode next;

        private ListNode(String data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return this.data;
        }
    }

    public static void reverseLinkList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tempNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNode;
        }
    }

    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode);
            listNode = listNode.next;
        }
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode("c", null);
        ListNode node2 = new ListNode("b", node3);
        ListNode node1 = new ListNode("a", node2);
        // printListNode();
        printListNode(node3);
        reverseLinkList(node1);

        printListNode(node3);

        int[] a = new int[]{1,2};

    }
}
