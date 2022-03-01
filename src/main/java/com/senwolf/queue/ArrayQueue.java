package com.senwolf.queue;

/**
 * 用数组实现的队列
 *
 * @author SenWolf
 * @date 2022/3/1 20:01
 */
public class ArrayQueue {
    // 数组：items 数组大小n
    private String[] items;
    private int n = 0;
    // head表示队头下标，tail表示队尾下标
    private int head = 0;
    private int tail = 0;

    // 申请一个大小为capacity的数组
    public ArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    // 入队操作
    public boolean enqueue(String item) {
        // 队列中有空间有可能也无法进行入队
        // v1
        // 如果tail==n表示队列已经满了
        /*if (tail == n) return false;
        items[tail] = item;
        ++tail;
        return true;*/
        if (tail == n) {
            if (head == 0) return false;
            for (int i = head; i < tail; i++) {
                items[i-head] = items[i];
            }
            tail -= head;
            head = 0;
        }
        items[tail] = item;
        ++tail;
        return true;
    }

    // 出队
    public String dequeue() {
        // 如果head == tail 表示队列为空
        if (head == tail) return null;
        return items[head++];
    }

}
