
package familyabstractions;

public abstract class Female extends Siblings {
    public Female(String name) {
        super(name);
    }

    @Override
    public void work() {
      System.out.println(getName() + " is Washing the dishes. ");
    }

    @Override
    public void activity() {
        System.out.println("Cleaning, inside home task, studying.");
    }
    
   public abstract void SonOrDaugtherOfSisterOrBrother();
 
    
}


