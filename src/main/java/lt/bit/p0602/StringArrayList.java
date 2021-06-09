package lt.bit.p0602;

public class StringArrayList implements StringList{

    private String[] array;
    private int size;

    public StringArrayList() {
        this(10);
    }

    public StringArrayList(int arraySize) {
        array = new String[arraySize];
    }
    @Override
    public void add(String s) {
        array[size++] = s;
    }

    @Override
    public void add(int index, String s) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public String get(int index) {
        if(index >=0 && index < size) {
            return array[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("index: " + index +
                    " but array size " + size);
        }
    }

    @Override
    public int size() {
        return size;
    }
}
