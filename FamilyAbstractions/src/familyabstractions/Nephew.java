
package familyabstractions;

public class Nephew extends Female{

    public Nephew(String name) {
        super(name);
    }
            @Override
    public void work() {
        System.out.println(getName() + " is working out side home");
    }
    
    @Override
    public void SonOrDaugtherOfSisterOrBrother() {
        System.out.println(getName()+" is son of "+Male.class.getName());
    }
    
}
