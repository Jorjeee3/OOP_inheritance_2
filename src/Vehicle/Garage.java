package Vehicle;

class Garage<T extends Vehicle> {
    private T vehicle;

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T name) {
        this.vehicle = name;
    }
}
