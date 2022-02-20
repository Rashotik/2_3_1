package web.model;

public class Car {
    private int year;
    private String model;
    private int series;

    public Car() {}

    public Car(int year, String model, int series) {
        this.year = year;
        this.model = model;
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
