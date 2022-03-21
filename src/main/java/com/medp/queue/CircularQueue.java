package com.medp.queue;

/**
 * @author MEDP
 * @date 2022/3/1 20:20
 */
public class CircularQueue {
    // 数组：items 数组大小n
    private String[] items;
    private int n = 0;
    // head表示队头下标，tail表示队尾下标
    private int head = 0;
    private int tail = 0;

    // 申请一个大小为capacity的数组
    public CircularQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    // 入队
    // (tail+1)%n在环形队列里面知道自己的位置
    public boolean enqueue(String item) {
        // 队满的条件
        if ((tail + 1)%n==head) return false;
        items[tail] = item;
        tail = (tail + 1)%n;
        return true;
    }

    // 出队
    public String dequeue() {
        // 队列为空的条件
        if (head == tail) return null;
        String ret = items[head];
        head = (head + 1) % n;
        return ret;
    }
}
