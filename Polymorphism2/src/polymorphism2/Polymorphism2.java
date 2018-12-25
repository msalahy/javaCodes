
package polymorphism2;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels=4;
        this.engine=true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    
    public String startEngine(){
        return "Car -> accelerate()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

class Ford33 extends Car {
    public Ford33(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName()+"-> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+"-> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+"-> brake()";
    }
}

class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+"-> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+"-> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+"-> brake()";
    }
}



public class Polymorphism2 {

    public static void main(String[] args) {

        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        
        
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        
        Ford33 ford33 = new Ford33(6, "Ford Falcon");
        System.out.println(ford33.startEngine());
        System.out.println(ford33.accelerate());
        System.out.println(ford33.brake());
                
        Holden holden = new Holden(6, "Ford Falcon");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
    
}
