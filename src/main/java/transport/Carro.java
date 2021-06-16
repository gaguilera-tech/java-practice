package transport;

public class Carro {
    private String color;
    private int year;
    private String marca;

    public Carro() {
    }

    public Carro(String color, int year, String marca) {
        this.color = color;
        this.year = year;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", marca='" + marca + '\'' +
                '}';
    }
}
