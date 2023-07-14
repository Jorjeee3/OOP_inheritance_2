package ParameterizedArray;

public class ParameterizedArray<T> {
    private T[] array;

    public T getVehicle(int index) {
        return this.array[index];
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}
