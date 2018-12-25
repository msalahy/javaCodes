
package swichstatement;

public class SwichStatement {

    public static void main(String[] args) {

    // System.out.println(isLeapYear(2000));
  getDaysInMonth(2, 1600);
    }
    public static void getDaysInMonth(int month, int year){
        String MonthOfName = "Unknown";
        int number_Of_DaysInMonth = 0;
        switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if (year % 400 == 0) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}

  
   
      


  










/*
switch(year){
    case 0:
        System.out.println("zero");
        break;
    case 1:
        System.out.println("one");
        break;
    case 2:
        System.out.println("tow");
        break;
     case 3:
        System.out.println("three");
        break;
      case 4:
        System.out.println("four");
        break;
      default:
          System.out.println("NANANANANA");













    switch(day){
        case 0:
    System.out.println("Saturday");
      break;
        case 1:
    System.out.println("Sunday");
      break;
        case 2:
    System.out.println("Monday");
      break;
              case 3:
    System.out.println("Tuesday");
      break;
              case 4:
    System.out.println("Wednesday");
      break;
              case 5:
    System.out.println("Thursday");
      break;
              case 6:
    System.out.println("Friday");
      break;
      default:
       System.out.println("NOT SURE");
              }

    */