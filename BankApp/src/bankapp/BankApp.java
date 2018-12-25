
package bankapp;

public class BankApp {

    public static void main(String[] args) {
   BankClass bank1 = new BankClass("Mohammad", 2000);
   BankClass bank2 = new BankClass();
   BankClass bank4 = new BankClass("Nemat");
   
   System.out.println("The account owner is = "+bank1.getName()+". The account Balance is = "+bank1.getBalance());
   System.out.println("The account owner is = "+bank2.getName()+". The account Balance is = "+bank2.getBalance());
   System.out.println("The account owner is = "+bank4.getName()+". The account Balance is = "+bank4.getBalance());
   bank1.withDraw(1000);
    }
    
}
