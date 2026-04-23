package org.example.models;

public class Engine {
    private int speed;


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void increase(int carSpeed){
        while (this.speed<carSpeed)
            this.speed++;
    }

    public void decrease(int carSpeed){
        while(this.speed>carSpeed)
            this.speed--;
    }

    @Override
    public String toString(){
        return ""+speed;
    }
}
