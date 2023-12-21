public class Class1 {
    public double x1,x2,y1,y2;

    public Class1(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    // Определение является ли прямоугольник квадратом
    public boolean isSquare() {
        double sideLength = Math.sqrt(Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2);
        double diagonalLength = Math.sqrt(Math.pow(x1 - x2, 2)) + Math.pow(y1 - y2, 2);
        if (sideLength == diagonalLength){
            return true;
        } else {
            return false;
        }
    }

}
