package application;

public class Director {
    private static Director director = new Director();

    private Director() {
    }

    public static Director getInstance() {
        return director;
    }
}
