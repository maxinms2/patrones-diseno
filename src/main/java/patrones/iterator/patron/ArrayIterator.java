package patrones.iterator.patron;

class ArrayIterator implements Iterator {
    private int[] array;
    private int position;

    public ArrayIterator(int[] array) {
        this.array = array;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < array.length;
    }

    @Override
    public int next() {
        return array[position++];
    }
}