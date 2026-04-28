package lab7.forms;

public class Triangle extends Form {
    private float base, height;

    public Triangle() {
        super();
    }

    public Triangle(float base, float height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle: " + super.toString() + "; base=" + base + "  height=" + height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangle) {
            Triangle t = (Triangle) obj;
            if (super.equals(t)) {
                return this.base == t.base && this.height == t.height;
            }
        }
        return false;
    }
}