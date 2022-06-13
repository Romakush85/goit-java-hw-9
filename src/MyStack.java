public class MyStack<T> {
    private static class Node<T>{
        T value;
        MyStack.Node<T> next;
        MyStack.Node<T> prev;

        public Node(T value){
            this.value = value;
        }

        public String toString() {
            return value.toString();
        }

    }
    private int size;
    private MyStack.Node<T> first;
    private MyStack.Node<T> last;

    public void push(T node){
        MyStack.Node<T> nextNode = new MyStack.Node<T>(node);
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

    public MyStack.Node<T> get(int index){
        if(index < 0 || index > size - 1) {
            throw new IllegalArgumentException("Wrong index");
        }
        int count = 0;
        for(MyStack.Node<T> node = first; node != null; node = node.next){
            if(count == index) {
                return node;
            }
            count++;
        }
        return null;
    }

    public void remove(int index) {
        MyStack.Node<T> nodeToRemove = get(index);
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

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public Node<T> peek() {
        return last;
    }

    public Node<T> pop() {
        Node<T> result = last;
        if(last == null) {
            throw new UnsupportedOperationException("The queue is empty");
        }
        last = last.prev;
        last.next = null;
        size--;
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (MyStack.Node<T> node = first; node != null; node = node.next) {
            result += node.value + " ";
        };
        return "[" + result.trim() + "]";
    }


}
