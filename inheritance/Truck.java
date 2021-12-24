package ru.codeinside.lessons.javacore.inheritance;

import ru.codeinside.lessons.javacore.inheritance.enums.VehicleColor;
import ru.codeinside.lessons.javacore.inheritance.src.ru.codeinside.lessons.javacore.inheritance.Vehicle;

public class Truck extends Vehicle {
    boolean isCanvasBack;

    public Truck(int yearOfProduction, VehicleColor color, boolean isCanvasBack){
        super(yearOfProduction, color);
        this.isCanvasBack = isCanvasBack;
    }

    public void setCanvasBack(boolean isCanvasBack){
        this.isCanvasBack = isCanvasBack;
    }

    public boolean isCanvasBack(){
        return isCanvasBack;
    }
    @Override
    public String getVehicleInfo() {
        return String.format("Vin:" + getVin() + "\n" + "yearOfProduction:" +  getYearOfProduction() + "\n" + "color:" + getColor() + "\n" + "isCanvasBack:" + isCanvasBack()) ;
    }
}
