package leetcode;

import java.util.HashMap;
import java.util.Map;

public class leetcode146 {
    class LRUCache {
        int size;
        Map<Integer, Node> nodeMap = new HashMap<>();
        Node head = new Node(null, null);
        Node tail = new Node(null, null);

        public void addFront(Node node){
            head.next.prev = node;
            node.prev = head;

            node.next = head.next;
            head.next = node;
        }

        public void remove(Node node){
            Node next = node.next;
            Node prev = node.prev;

            prev.next = next;
            next.prev = prev;
        }

        public LRUCache(int capacity) {
            this.size = capacity;
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if(!nodeMap.containsKey(key)){
                return -1;
            }

            Node node = nodeMap.get(key);
            remove(node);
            addFront(node);
            return node.val;
        }

        public void put(int key, int value) {
            if(nodeMap.containsKey(key)){
                Node removeNode = nodeMap.get(key);
                remove(removeNode);
                nodeMap.remove(removeNode.key);
            }

            if(nodeMap.size() >= size){
                Node removeNode = tail.prev;
                remove(removeNode);
                nodeMap.remove(removeNode.key);
            }

            Node node = new Node(key, value);
            nodeMap.put(key, node);
            addFront(node);
        }

        class Node {
            Integer key;
            Integer val;
            Node next;
            Node prev;

            public Node(Integer key, Integer val){
                this.key = key;
                this.val = val;
            }
        }
    }
}
