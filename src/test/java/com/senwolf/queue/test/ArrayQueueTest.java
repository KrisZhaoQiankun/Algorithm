package com.senwolf.queue.test;

import com.senwolf.queue.ArrayQueue;

/**
 * @author SenWolf
 * @date 2022/3/1 20:10
 */
public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(4);
        // test v1
        queue.enqueue("a");
        queue.enqueue("b");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        // test v2
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("a");
        queue.enqueue("b");
        System.out.println(queue.enqueue("c"));
    }
}
