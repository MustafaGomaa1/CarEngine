package org.example;

import org.example.models.*;

public class Main {

    static void main() {
        Engine engine = new HybridEngine();
        Car car = new Car(engine);
        car.start();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.brake();
        car.brake();
        car.brake();
        car.brake();
        car.brake();
        car.brake();
        car.brake();
        car.brake();
        car.brake();
        car.brake();
        car.brake();
        car.brake();
        car.stop();
    }
}
