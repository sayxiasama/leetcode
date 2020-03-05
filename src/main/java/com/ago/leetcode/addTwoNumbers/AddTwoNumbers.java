package com.ago.leetcode.addTwoNumbers;

/**
 * @ClassName:AddTwoNumbers
 * @Describe:
 * @Data:2020/3/515:41
 * @Author:Ago
 * @Version 1.0
 */
public class AddTwoNumbers {
    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     *
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     *
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     *
     * 示例：
     *
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     *
     */

//    public NodeList addTwoNumbers(NodeList l1 , NodeList l2){
//            NodeList  pre = new NodeList();
//            int cur = 0; //进位标记
//            while( l1 != null || l2 != null){
//                int x = l1 == null ? 0 :l1.head.data;
//                int y = l2 == null ? 0 :l2.head.data;
//                int sum = x + y + cur;
//                cur = sum / 10; // 进位标记
//                sum = sum % 10; // 实际存储
//
//                Node node= new Node;
//                node.data = sum;
//
//
//            }



//    }



    public static void main(String[] args) {
        createNodeList();
    }

    private static void createNodeList() {
        NodeList nodeList = new NodeList();
        NodeList nodeList2 = new NodeList();

        nodeList.add(2);
        nodeList.add(4);
        nodeList.add(3);

        nodeList2.add(5);
        nodeList2.add(6);
        nodeList2.add(4);

        nodeList.printNode(nodeList.getNode(0));
        nodeList2.printNode(nodeList2.getNode(0));
    }

}
