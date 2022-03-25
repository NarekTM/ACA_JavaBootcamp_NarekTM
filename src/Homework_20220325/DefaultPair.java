package Homework_20220325;

public class DefaultPair<K, V> implements Pair<K, V>{
    private K key;
    private V value;

    @Override
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
