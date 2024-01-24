
abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Inside Rectangle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Inside Square");
    }
}

class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {}

    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    public Shape getShape(String shapeType) {
        if ("rectangle".equals(shapeType)) {
            return new Rectangle();
        } else if ("square".equals(shapeType)) {
            return new Square();
        } else {
            return null;
        }
    }
}

public class factory {
    public static void main(String[] args) {
        ShapeFactory shapeFactory1 = ShapeFactory.getInstance();
        ShapeFactory shapeFactory2 = ShapeFactory.getInstance();

        System.out.println("Address of shapeFactory 1: "+shapeFactory1);
        System.out.println("Address of shapeFactory 2: "+shapeFactory2);


        Shape shape1=shapeFactory1.getShape("rectangle");
        shape1.draw();

        Shape shape2=shapeFactory1.getShape("square");
        shape2.draw();
      
    }
}