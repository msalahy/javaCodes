
package familyabstractions;

public class Male extends Siblings {
    
    public Male(String name) {
        super(name);
    }
        @Override
    public void work() {
        System.out.println(getName() + " is working out side home");
    }

    @Override
    public void activity() {
        System.out.println(getName()+" is Shopping, labor forcing, and studying.");
    }
    
    
      // public abstract void SonOrDaugtherOfSisterOrBrother();
 
}
