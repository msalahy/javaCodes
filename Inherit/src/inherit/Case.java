
package inherit;


public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions Dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions Dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.Dimensions = Dimensions;
    }
    public void pressPowerButton(){
        System.out.println("Power button pressed.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return Dimensions;
    }
     
}
