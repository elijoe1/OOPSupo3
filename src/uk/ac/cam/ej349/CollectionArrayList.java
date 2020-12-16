package uk.ac.cam.ej349;

import java.util.AbstractList;
import java.util.Arrays;

public class CollectionArrayList<E> extends AbstractList<E>{
    private Object[] array;
    private int size;
    private int capacity;

    @Override
    public E get(int index) {
        if (index >= 0 && index < size) {
            return (E)array[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E set(int index, E element) {
        if (index >= 0 && index < size()) {
            E toReturn = (E)array[index];
            array[index] = element;
            return toReturn;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void add(int index, E element) {
        if (index >= 0 && index <= size()) {
            if (size == capacity) {
                Object[] temp = new Object[capacity * 2];
                for (int i = 0; i < size; i++) {
                    temp[i] = array[i];
                }
                capacity *= 2;
                array = temp;
                add(index, element);
            } else {
                for (int i = size; i >= index; i--) {
                    array[i + 1] = array[i];
                }
                array[index] = element;
                size += 1;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean add(E element) {
        add(size(), element);
        return true;
    }

    public CollectionArrayList() {
        array = new Object[10];
        capacity = 10;
        size = 0;
    }

    @Override
    public String toString() {
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, size());
        return Arrays.toString(newArray);
    }

}
