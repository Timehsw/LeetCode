package main.com.hsw.linkedlist;

/**
 * Created by hushiwei on 2018/12/18.
 * desc :
 */
public class SinglyLinkedList {

    /**
     * 单链表节点对象
     */
    public static class Node {

        private int  data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }


}
