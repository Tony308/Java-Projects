import org.w3c.dom.css.Rect;

public class Rectangle extends Shape implements perimeter {

    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.area = calcArea();
        this.width = width;
        this.height = height;
    }

    Rectangle(double length) {
        this.width = length;
        this.height = length;
        this.area = calcArea();
    }


    @Override
    public double getPerimeter(){
        return (width+height)*2;
    }

    @Override
    public double calcArea() {
        return width*height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}