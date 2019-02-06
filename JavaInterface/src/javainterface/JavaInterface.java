
package javainterface;


public class JavaInterface {


    public static void main(String[] args) {
        
        ITelephone mohPhone;
        // or I can use DeskPhone
        mohPhone = new DeskPhone(12345);
        mohPhone.powerOn();
        mohPhone.callPhone(12345);
        
        
        mohPhone = new MobilePhone(247666);
        mohPhone.powerOn();
        mohPhone.callPhone(247666);
        mohPhone.answer();
    } 
}
