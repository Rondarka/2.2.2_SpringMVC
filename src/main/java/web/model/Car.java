package web.model;

public class Car {
    private int series;
    private String model;
    private String color;

    public Car(int series, String model, String color) {
        this.series = series;
        this.model = model;
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "Год выпуска " + series +
                ", модель " + model +
                ", цвет " + color;
    }
}
