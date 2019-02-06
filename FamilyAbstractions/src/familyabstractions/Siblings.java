
package familyabstractions;

public abstract class Siblings {
    private String name;
    
    public Siblings(String name) {
        this.name = name;
    }
    
    
    public abstract void work();
    public abstract void activity();
    
    
    public String getName() {
        return name;
    }
    
}
