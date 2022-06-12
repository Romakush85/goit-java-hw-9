import java.util.Arrays;

public class MyArrayList<T> {
    private int elemCount;
    private T[] list;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;

    public MyArrayList() {
        this.list =(T[]) new Object[DEFAULT_CAPACITY];
        this.elemCount = 0;
        this.capacity = 10;
    }

    public MyArrayList(int capacity) {
        if(capacity <= 0 ) throw new IllegalArgumentException("Wrong capacity");
        this.list =(T[]) new Object[capacity];
        this.elemCount = 0;
        this.capacity = capacity;
    }

    public MyArrayList(T[] list) {
        if (list.length >= DEFAULT_CAPACITY) {
            this.list =(T[]) new Object[list.length * 2];
            this.capacity = list.length * 2;
        } else {
            this.list = (T[]) new Object[DEFAULT_CAPACITY];
            this.capacity = 10;
        }
        this.elemCount = 0;
        for (T elem: list) {
            if(elem != null) {
                this.list[elemCount] = elem;
                this.elemCount++;
            }
        }
    }

    private void increase() {
        T[] newList = Arrays.copyOf(this.list, this.capacity *2);
        this.list = newList;
        this.capacity = list.length;
    }

    public void add(Object value) {
            this.elemCount++;
            if(this.elemCount == this.capacity) {
                increase();
            }
            this.list[elemCount] =(T) value;
    }

    public int size() {
        return this.elemCount;
    }

    public void remove(int index) {
        if(index < 0 && index > elemCount) throw new IllegalArgumentException("Wrong index");
        for(int i = index; i <= elemCount; i++ ) {
            this.list[i] = this.list[i + 1];
        }
        elemCount--;
    }

    public void clear() {
        for (int i = 0; i <= elemCount; i++) {
            list[i] = null;
        }
        elemCount = 0;
    }

    public T get(int index) {
        if(index < 0 && index > elemCount) {
            throw new IllegalArgumentException("Wrong index");
        }
        return list[index];
    }

    @Override
    public String toString() {
        String result = "";
        for (Object elem: this.list) {
           if (elem != null) {
               result += elem + " ";
           }
           continue;
        };
        return "[" + result.trim() + "]";
    }
}
