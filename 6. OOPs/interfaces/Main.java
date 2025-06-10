package interfaces;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        int enPrice = Engine.price;
        System.out.println(enPrice);
        // c.brake();
        c.acc();
        c.start();
        c.stop();

        // NiceCar car = new NiceCar();

        // car.start();
        // car.stop();
        // car.acc();
        // car.upgradeEngine();
        // car.start();
        // car.stop();
        // car.acc();
        // car.startMusic();
        // car.stopMusic();

        // Engine eng = new PowerEngine();
        // NiceCar car1 = new NiceCar(eng);
        // car1.start();
        // car1.stop();
        // car1.acc();
    }
}
