package Flowers;
import java.time.LocalDate;

public class Flower {
    private double cost;
    private LocalDate receiptDate;
    private int expirationDate;
    private String color;

    Flower(double cost, LocalDate receiptDate, int expirationDate, String color){
        this.cost = cost;
        this.receiptDate = receiptDate;
        this.expirationDate = expirationDate;
        this.color = color;
    }

    public double getCost() {
        return this.cost;
    }

    public LocalDate getDate() {
        return this.receiptDate;
    }

    public int getExpirationDate() {
        return this.expirationDate;
    }

    public String getColor() {
        return this.color;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
