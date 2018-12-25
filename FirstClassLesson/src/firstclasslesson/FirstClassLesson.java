
package firstclasslesson;

public class FirstClassLesson
{
    public static void main(String[] args) {
	// Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        
        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        
        
        
        VipCustomer person1 = new VipCustomer(); // "12345", 0.00, "Bob Brown", "myemail@bob.com",
        System.out.println(person1.getName());
        
        VipCustomer person2 = new VipCustomer("Bob", 23444.000);
        System.out.println(person2.getName());
        System.out.println(person2.getEmailAddress());
        
        VipCustomer person3 = new VipCustomer("tim", 344.000, "lala@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
        
    }
}





//        Scanner input = new Scanner(System.in);
//        Car porsche = new Car();
//        Car holden = new Car();
//        System.out.println("Please enter the model");
//        porsche.setModel(input.nextLine());
//        System.out.println("The model is "+porsche.getModel());
//        
//        Bank Mohammad = new Bank();
//        System.out.println("Please enter the customer name: ");
//        Mohammad.setName(input.nextLine());
//        System.out.println("Please enter the customer acount number: ");
//        Mohammad.setAcountNumber(input.nextInt());
//        
//        System.out.println("Your availabel money? ");
//        Mohammad.setDepositFund(input.nextInt());
//                
//        System.out.println("How much money you want to deposit ? ");
//        Mohammad.addedDepositFund(input.nextInt());
//        
//                        
//        System.out.println("How much money you want to withraw today ? ");
//        Mohammad.withrawFund(input.nextInt());
//        
//        System.out.println("The customer name is "+Mohammad.getName()+", and "+" his account number is: "+Mohammad.getAcountNumber()+" " +". His available balance is"+
//                Mohammad.getDepositFund()+"."+"His new account balance after depositing is"+Mohammad.addedFund()+". "
//        +"Lets see if he can withraw"+Mohammad.getwithrawFund());
//    }

