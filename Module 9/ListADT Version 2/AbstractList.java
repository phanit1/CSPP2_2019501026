abstract class AbstractList implements ListInterface {
    int[] list;
    int size;
    int capacity;

    AbstractList() {
        this.list = new int[10];
        this.size = 0;
        this.capacity = 10;
    }
     public abstract void add(int item);
    
     public abstract void resize();

    public int size() {
        return this.size;
    }

    public int get(final int index) {
        if (index < this.size && index >= 0) { //validation
            return this.list[index];
        }
        return -1;
    }

    abstract public int indexOf(int item);

    public boolean contains(final int item) {
        for (int i = 0; i < this.size; i++) {
            if (this.list[i] == item) {
                return true;
            }
        }
        return false;
    }
    public String toString() {
        String out = "[";
        for (int i = 0; i < this.size - 1; i++) {
            out = out + list[i] + ",";
        }
        out = out + list[size - 1] + "]";
        return out;
    }
    public void remove(int index) {
        if (index < size && index>0) {
            int i = index;
            for (int j = i + 1; j < size; j++) {
                this.list[i] = this.list[j];
                i++;
            }
            this.list[this.size] = 0;
            this.size--;
        }
    }
}

