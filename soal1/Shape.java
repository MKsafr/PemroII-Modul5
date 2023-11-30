package soal1;

public abstract class Shape {
    private String shapeName ;

    public Shape(String name) {
        shapeName = name ;
    }

    protected abstract double area() ;

    public String toString() {
        return shapeName ;
    }
}
