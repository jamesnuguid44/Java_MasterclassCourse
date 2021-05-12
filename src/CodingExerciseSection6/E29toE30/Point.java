package CodingExerciseSection6.E29toE30;

public class Point {
    private int x;
    private int y;

    public Point(){
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //methods
    public double distance(){
        double distances = ((0-x)*(0-x))+((0-y)*(0-y));
        return Math.sqrt(distances);
    }

    public double distance(int x,int y){
        double distances = ((x-this.x)*(x-this.x))+((y-this.y)*(y-this.y));
        return Math.sqrt(distances);
    }

    public double distance(Point another){
        double distances = ((another.x-this.x)*(another.x-this.x))+((another.y-this.y)*(another.y-this.y));
        return Math.sqrt(distances);
    }
}
