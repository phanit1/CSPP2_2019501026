class OrderedList extends AbstractList {
    
    OrderedList () {
        super();
    }
    public void add(int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] <= item) {
                insertAt(item,i);
                break;
        }
    }
}
public void insertAt (int item , int index) {
    for(int i = size - 1; i > index; i--) {
        list[i] = list[i- 1];
    }
    list[index] = item;
}
public int indexOf(int item) {
    return binarySearch(list, 0, size, item);
    }
public void resize() {
        list = java.util.Arrays.copyOf(list, capacity * 2);
        capacity = capacity * 2;
    }
public int binarySearch(int arr[], int l, int r, int x) 
	{ 
		if (r >= l) { 
			int mid = l + (r - l) / 2; 

			if (arr[mid] == x) 
                return mid; 
            if (arr[mid] > x) 
				return binarySearch(arr, l, mid - 1, x); 
            return binarySearch(arr, mid + 1, r, x); 
        } 
        return -1; 
    } 
}