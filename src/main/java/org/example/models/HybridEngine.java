package org.example.models;

public class HybridEngine extends Engine{
    private String currentEngineType;
    private ElectricEngine electricEngine;
    private GasEngine gasEngine;

    public HybridEngine(){
        this.electricEngine =new ElectricEngine();
        this.currentEngineType="Electrical Engine";
    }

    @Override
    public void increase(int carSpeed){
        if(carSpeed>50){
           super.increase(carSpeed);
           electricEngine=null;
           gasEngine = new GasEngine();
           currentEngineType="Gas Engine";
        }
        super.increase(carSpeed);
    }
    @Override
    public void decrease(int carSpeed){
        if(carSpeed<=50 && currentEngineType.equals("Electrical Engine")){
            super.decrease(carSpeed);
        } else if (carSpeed<=50 && currentEngineType.equals("Gas Engine")){
            this.currentEngineType="Electrical Engine";
            this.electricEngine=new ElectricEngine();
            this.gasEngine=null;
            super.decrease(carSpeed);
        }
        else
            super.decrease(carSpeed);
    }

    @Override
    public String toString(){
        return super.toString()+" "+currentEngineType;
    }

}
