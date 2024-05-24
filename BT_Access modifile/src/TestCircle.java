public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5,"Xanh" );
        System.out.println("Ban kinh la :" + circle.getRadius());
        System.out.println("Dien tich  la :" + circle.getArea());
        System.out.println("Color: " + circle.getColor());
        System.out.println("\n");

        Circle circle1 = new Circle();
        System.out.println("Ban kinh la :" + circle1.getRadius());
        System.out.println("Dien tich  la :" + circle1.getArea());
        System.out.println("Color: " + circle1.getColor());
    }
}
