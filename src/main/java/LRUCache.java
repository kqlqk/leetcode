package main.java;

import java.util.*;

public class LRUCache {

//    public static void main(String[] args) {
//        LRUCache lRUCache = new LRUCache(2);
//        lRUCache.put(2, 1);
//        lRUCache.put(1, 1);
//        lRUCache.put(2, 3);
//        lRUCache.put(4, 1);
//        lRUCache.get(1);
//        lRUCache.get(2);
//    }

    private final int capacity;
    private final Node head;
    private final Node tail;
    private final Map<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;

        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    //O(1)
    public int get(int key) {
        if (map.containsKey(key)) {
            Node resNode = map.get(key);
            int ans = resNode.value;

            map.remove(key);
            deleteNode(resNode);
            addNode(resNode);

            map.put(key, head.next);
            return ans;
        }
        return -1;
    }

    //O(1)
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            map.remove(key);
            deleteNode(node);
        }

        if (map.size() == capacity) {
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }

        addNode(new Node(key, value));
        map.put(key, head.next);
    }

    private void addNode(Node node) {
        Node temp = head.next;

        node.next = temp;
        node.prev = head;

        head.next = node;
        temp.prev = node;
    }

    private void deleteNode(Node node) {
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

}
