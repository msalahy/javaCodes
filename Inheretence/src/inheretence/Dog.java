
package inheretence;


public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    
    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth,String coat){
    super(name, 1, 1, size, weight);
    this.eyes=eyes;
    this.legs=legs;
    this.tail=tail;
    this.teeth=teeth;
    this.coat=coat;
    }
    private void chew(){
        System.out.println("chew() is called.");
    }
    @Override
    public void eat(){
        System.out.println("Dog.eat() is called.");
        chew();
     super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk() is called");
        super.move(5);
    }
    public void run(){
        System.out.println("Dog.run() is called");
      super.move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
    
    
    
}
