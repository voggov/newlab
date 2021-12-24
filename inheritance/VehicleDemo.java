package ru.codeinside.lessons.javacore.inheritance.src.ru.codeinside.lessons.javacore.inheritance;

import ru.codeinside.lessons.javacore.inheritance.Truck;
import ru.codeinside.lessons.javacore.inheritance.enums.VehicleColor;
import java.lang.reflect.*;

public class VehicleDemo {
    public static void main(String[] args) {
        Car mersedes = new Car(2021, VehicleColor.RED,true,false);
        System.out.println(mersedes.getVehicleInfo());
        System.out.println("////////////////////////");
        Truck kamaz = new Truck(2000,VehicleColor.BLACK,false);
        System.out.println(kamaz.getVehicleInfo());
        System.out.println("///////////////////////////////////////////////////////////////");
        Class clss = kamaz.getClass();
        Type classValue = clss.getClass();
        System.out.println(((Class<?>) classValue).getName());
        Field[] fields = clss.getFields();
        for (var i : fields){
            System.out.println(i.getName());
            System.out.println(Modifier.toString(i.getModifiers()));

        }
        Method[] methods = clss.getMethods();
        for (var i : methods){
            System.out.println(i.getName());
            System.out.println((Modifier.toString(i.getModifiers())));
        }
        Constructor[] constructors = clss.getConstructors();
        for (var i : constructors){
            System.out.println(i.getName());
        }

    }
}
