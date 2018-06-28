public abstract class Shape {
    double area;

    public abstract double calcArea();

    @Override
    public String toString(){
        return "Area : " + area;
    }


}
