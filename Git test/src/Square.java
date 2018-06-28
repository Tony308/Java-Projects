public class Square extends  Rectangle  {

    double sideLength;
    public Square(double sideLength) {
        super(sideLength, sideLength);
        this.sideLength = sideLength;
        this.area = calcArea();
    }

    @Override
    public double calcArea() {
        return sideLength * sideLength;
    }

}
