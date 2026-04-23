package org.example.models;

public class Car {
    private int speed;
    private Engine carEngine;
    private boolean isStart;

    public Car(Engine carEngine){
        this.carEngine = carEngine;
        this.isStart=false;
    }

    public Engine getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(Engine carEngine) {
        this.carEngine = carEngine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void start(){
        this.isStart=true;
        this.speed=0;
        System.out.println("car started!");
    }

    public void stop(){
        if(!isStart){
            System.out.println("You Must Start The Car First!");
        }
        else {
        while(this.speed>0){
            brake();
        }
        System.out.println("Car Stop");
        }
    }
    public void accelerate(){
        if(!isStart){
            System.out.println("You Must Start The Car First!");
        }
        else {
        if(this.speed<200){
            this.speed+=20;
            carEngine.increase(speed);
            System.out.println("Car Speeded Up:"+this.speed+"\nEngine Speed:"+carEngine.toString());
        }
        else
            System.out.println("Can't SpeedUp");}
    }

    public void brake(){
        if(!isStart){
            System.out.println("You Must Start The Car First!");
        }else {
        if(this.speed>0 && this.speed!=0){
            this.speed-=20;
            carEngine.decrease(speed);
            System.out.println("Car SpeededDown:"+this.speed+"\nEngine Speed:"+carEngine.toString());
        }
        else
            System.out.println("Car is already Stop");}
    }
}
