package day5;

class Motorbike {
    private final int releaseYear;
    private final String color;
    private final String model;

    public Motorbike(int releaseYear, String color, String model) {
        this.releaseYear = releaseYear;
        this.color = color;
        this.model = model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
