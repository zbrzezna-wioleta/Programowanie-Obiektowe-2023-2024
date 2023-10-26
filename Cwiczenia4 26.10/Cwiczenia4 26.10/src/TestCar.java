public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.speed);
        car1.accelerate(20);
        System.out.println(car1.speed);
        car1.decelerate(5);
        System.out.println(car1.speed);
    }
}
class Car{
    String brand;
    String model;
    int speed;
    void accelerate (int value){
        this.speed+=value;
    }
    void decelerate(int value){
        this.speed-=value;
        if (this.speed <0){
            this.speed =0;
        }
    }
}
