public class MyQueue<T> {
    private static class Node<T>{
        T value;
        MyQueue.Node<T> next;
        MyQueue.Node<T> prev;

        public Node(T value){
            this.value = value;
        }

        public String toString() {
            return value.toString();
        }

    }
    private int size;
    private MyQueue.Node<T> first;
    private MyQueue.Node<T> last;

    public void add(T node){
        MyQueue.Node<T> nextNode = new MyQueue.Node<T>(node);
        size++;
        if(first == null) {
            first = nextNode;
            last = nextNode;
            nextNode.next = null;
            nextNode.prev = null;
        } else {
            last.next = nextNode;
            nextNode.prev = last;
            nextNode.next = null;
            last = nextNode;
        }
    }

    public int size() {
        return this.size;
    }

    public MyQueue.Node<T> get(int index){
        if(index < 0 || index > size - 1) {
            throw new IllegalArgumentException("Wrong index");
        }
        int count = 0;
        for(MyQueue.Node<T> node = first; node != null; node = node.next){
            if(count == index) {
                return node;
            }
            count++;
        }
        return null;
    }

    public void remove(int index) {
        MyQueue.Node<T> nodeToRemove = get(index);
        if(nodeToRemove == first) {
            first = nodeToRemove.next;
            nodeToRemove.next.prev = null;
            nodeToRemove.next = null;
            nodeToRemove.value = null;
            size--;
            return;
        }
        if(nodeToRemove == last) {
            last = nodeToRemove.prev;
            nodeToRemove.prev.next = null;
            nodeToRemove.prev = null;
            nodeToRemove.value = null;
            size--;
            return;
        }
        nodeToRemove.prev.next = nodeToRemove.next;
        nodeToRemove.next.prev = nodeToRemove.prev;
        nodeToRemove.next = null;
        nodeToRemove.prev = null;
        nodeToRemove.value = null;
        size--;
    }

    public Node<T> peek() {
        return first;
    }

    public Node<T> poll() {
        Node<T> result = first;
        if(first == null) {
            throw new UnsupportedOperationException("The queue is empty");
        }
        first = first.next;
        first.next.prev = null;
        first.prev = null;
        size--;
        return result;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public String toString() {
        String result = "";
        for (MyQueue.Node<T> node = first; node != null; node = node.next) {
            result += node.value + " ";
        };
        return "[" + result.trim() + "]";
    }
}
