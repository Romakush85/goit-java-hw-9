import java.util.Arrays;

public class MyHashMap<K, V> {
    private int entriesCount;  // amount of entries (size)
    private Entry<K, V>[] table;  // array
    private float loadFactor;     //  entriesCount / table.length
    private static final float DEFAULT_LOADFACTOR = 0.75f;
    private static final int DEFAULT_CAPACITY = 16; // default array length

    public MyHashMap() {
        this.table =new Entry[DEFAULT_CAPACITY];
        this.entriesCount =0;
        this.loadFactor = 0.75f;
    }

    static class Entry<K, V> {

        K key;
        V value;
        Entry<K, V> next;
        int hash;

        public Entry(K key, V value) {
            if (key == null) {throw new IllegalArgumentException("The key is absent");}
            this.key = key;
            this.value = value;
            this.hash = System.identityHashCode(key);
            this.next = null;
        }
    }

    public void put(K key, V value) {
        if(key == null) throw new NullPointerException("The key can't be null");

        Entry<K, V> putEntry = new Entry<>(key, value);
        int index = indexFor(putEntry.hash);

        if(table[index] != null) {
            for(Entry<K,V> entry = table[index]; entry !=null; entry = entry.next) {
                if (entry.key.equals(key)) {
                    System.out.println("Entry with such key is already exist");
                    return;
                }
                continue;
            }
            putEntry.next = table[index];
            table[index] = putEntry;
            entriesCount++;
            resize();
        } else {
            table[index] = putEntry;
            entriesCount++;
            resize();
        }
    }

    public V get(K key) {
        if (key == null) throw new NullPointerException("The key can't be null");
        int index = indexFor(System.identityHashCode(key));
        if (table[index] == null) {
            System.out.println("There is no entry with such key");
        } else {
            for (Entry<K, V> entry = table[index]; entry != null; entry = entry.next) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
                continue;
            }
            System.out.println("There is no entry with such key");
        }
        return null;
    }

    public void remove(K key) {
        if (key == null) throw new NullPointerException("The key can't be null");
        Entry<K, V> removeEntry = new Entry(key, get(key));
        int index = indexFor(removeEntry.hash);
        if (table[index] == null) {
            System.out.println("There is no entry with such key");
            return;
        }
        Entry<K, V> currEntry = table[index];
        Entry<K, V> prevEntry = null;
        while (currEntry.next != null) {
            if (currEntry.key.equals(key)) {
                if (currEntry.equals(table[index])) {
                    table[index] = currEntry.next;
                    entriesCount--;
                } else {
                    prevEntry.next = currEntry.next;
                    entriesCount--;
                }
                prevEntry = currEntry;
                currEntry = currEntry.next;
            }
        }

    }

    public void clear() {
        if(table == null) {
            throw new NullPointerException("HashMap does not exist");
        }

        for(int i = 0; i < table.length; i++) {
            table[i] = null;
        }
        entriesCount = 0;
    }

    public int size() {
        return this.entriesCount;
    }

    private void resize() {
        if(entriesCount / table.length > DEFAULT_LOADFACTOR) {
            Entry<K, V>[] newTable = new Entry[table.length * 2];
            Entry<K, V>[] src = Arrays.copyOf(table, table.length);
            table = newTable;
            entriesCount = 0;

            for (Entry<K, V> entry : src) {
                while(entry != null) {
                    put(entry.key, entry.value);
                    entry = entry.next;
                }
                continue;
            }
        } else {
            return;
        }
    }

    private int indexFor(int hash) {
        return (int) hash % table.length;
    }



}
