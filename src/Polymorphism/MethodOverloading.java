package Polymorphism;

/*
     Method Overloading is when a class has multiple methods with the same name,
     but the number, types, and order of parameters and the return type of the methods are different.
     Java allows the user freedom to use the same name for various functions
     as long as it can distinguish between them by the type and number of parameters.
*/
class Shape {
    public void area() {
        System.out.println("Find area ");
    }
    public void area(int r) {
        System.out.println("Circle area = "+3.14*r*r);
    }

    public void area(double b, double h) {
        System.out.println("Triangle area="+0.5*b*h);
    }
    public void area(int l, int b) {
        System.out.println("Rectangle area="+l*b);
    }


}

class ShapeMain {
    public static void main(String[] args) {
        Shape myShape = new Shape();  // Create a Shapes object

        myShape.area();
        myShape.area(5);
        myShape.area(6.0,1.2);
        myShape.area(6,2);

    }
}