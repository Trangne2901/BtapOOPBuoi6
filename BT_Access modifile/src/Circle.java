public class Circle {
    private  double radius;
    private String color;
    public Circle (){
        this.radius = 1.0;
        this.color =  "red";
    }
    public Circle ( double radius, String color){
        this.radius = radius;
        this.color = color;

    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
}
