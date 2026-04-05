class DynamicArray {
    int[] arr;
    int size;
    int capacity;

    public DynamicArray(int capacity) {
        if(capacity>0){
            this.capacity = capacity;
            arr = new int[capacity];
        }

    }

    public int get(int i) {
        return arr[i];

    }

    public void set(int i, int n) {
        arr[i]= n;

    }

    public void pushback(int n) {
        if (size == capacity){
            resize();
        }

        arr[size]=n;
        size++;

    }

    public int popback() {
        size--;
        return arr[size];

    }

    public void resize() {
        capacity = 2 * capacity;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return size;
        
        

    }

    public int getCapacity() {
        return capacity;

    }
}