class List extends AbstractList {

    // int[] list;
    // int size;
    // int capacity;
    List() {
        super();
    }

    public void add(final int item) {
        list[size] = item;
        size++;
        if (size == capacity) {
            resize();
        }
    }
    public void resize() {
        list = java.util.Arrays.copyOf(list, capacity * 2);
        capacity = capacity * 2;
    }
    public int indexOf(final int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return i;
            }
        }
        return -1;

    }
}