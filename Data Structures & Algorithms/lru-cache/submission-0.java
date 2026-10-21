class LRUCache {
    class Node{
    int key;
    int value;
    Node prev;
    Node next;

    Node (int key, int value){
        this.key = key;
        this.value = value;
    }
}
    
    private Map<Integer, Node> cache;
    private Node head;
    private Node tail;
    private int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        head = new Node(0,0);
        tail = new Node (0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!cache.containsKey(key)){
            return -1;
        }
        else {
            Node node = cache.get(key);
            remove(node);
            insertAtFront(node);
            return node.value;
        }
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)){
           Node node = cache.get(key);
           node.value = value;
           remove(node);
           insertAtFront(node);
        }
        else  {
            Node node = new Node (key, value);
            cache.put(key, node);
            insertAtFront(node);
        }
        if (cache.size() > capacity){
            Node stale = tail.prev;
            remove(stale);
            cache.remove(stale.key);
        }
    }

    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev; 
    }

    private void insertAtFront (Node node){
        Node after = head.next;
        head.next = node;
        node.next = after;
        node.prev = head;
        after.prev = node;
       
    }
}
