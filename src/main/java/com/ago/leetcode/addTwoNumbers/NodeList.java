package com.ago.leetcode.addTwoNumbers;

/**
 * @ClassName:NodeList
 * @Describe:
 * @Data:2020/3/515:48
 * @Author:Ago
 * @Version 1.0
 */
public class NodeList {
    public Node head;

    private Node last;

    private int size;

    public void add(int data) {
        // 创建当前链表,如果head结点为null 则头节点指向创建的链表
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        // 如果head节点不为空,遍历链表找到尾节点 添加
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        size++;
        temp.next = newNode;
        last = newNode;
        return;
    }

    public void printNode(Node node) {
        if (node != null) {
            System.out.println(node.data);
            node = node.next;
            printNode(node);
        }
    }

    /**
     * 获取指定结点
     *
     * @param index
     * @return
     */
    public Node getNode(int index) {
        checkIndex(index);
        Node temp = head;
        int j = 0;
        while (temp.next != null && j < index) {
            temp = temp.next;
            j++;
        }
        return temp;
    }

    private void checkIndex(int index) throws IllegalAccessError {
        if (index < 0 || index > this.getSize()) {
            throw new IllegalAccessError("下标参数异常");
        }
    }

    /**
     * 获取链表长度
     *
     * @return
     */
    public int getSize() {
        return size;
    }

}
