
package encupsolation;


public class Encupsolation {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name="Tim";
//        player.health=20;
//        player.weapon="Sword";
//        
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        
//        damage=11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
   
    
//    EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
//    System.out.println("Initiall health is " +player.getHealth());
//    
//    
    
    Printer printer = new Printer(50, false);
    System.out.println("intial page count = "+printer.getPagesPrinted());
    int pagesPrinted=printer.printPages(4);
    System.out.println("Pages printed was "+pagesPrinted+"new totoal is "+printer.getPagesPrinted());
    
    int addToner=printer.addToner(1210);
    pagesPrinted=printer.printPages(2);
    System.out.println("Pages printed was "+pagesPrinted+"new totoal is "+printer.getPagesPrinted());
}
}
