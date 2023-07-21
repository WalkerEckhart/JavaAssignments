import java.text.MessageFormat;

public class CafeJava {
    public static void main(String[] args) {
    //APP VARIABLES
        String greeting = "Welcome to Java Cafe, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready!";
        String displayTotal = ", your total is $";
    
    //MENU VARIABLES
        double mochaPrice = 2.99;
        double cappucinoPrice = 3.99;
        double coffeePrice = 1.99;
        double lattePrice = 2.50;
    
    //CUSTOMER VARIABLES
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

    //ORDER COMPLETIONS
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;

    //ORDER STATUS MESSAGE
            //Sam
            double order2Total = lattePrice * 2;
        if (isReadyOrder2) {
            System.out.println(MessageFormat.format("{0} {1}!\n{1}{2}{3}.", greeting, customer2, displayTotal, order2Total));
        } else {
            System.out.println(MessageFormat.format("{1}{0}!", pendingMessage, customer2));
        }
            //Jimmy
                double order3Total = lattePrice - coffeePrice;
                String noticeMessage = "You've already paid ";
        if (isReadyOrder3) {
            System.out.println(MessageFormat.format("{0} {1}!\n{5}{4}.\n{1}{2}{3}.", greeting, customer3, displayTotal, order3Total, coffeePrice, noticeMessage));
            
        }
            //Cindhuri
        if (isReadyOrder1) {
            System.out.println(MessageFormat.format("{0} {1}!\n{1}{2}.", greeting, customer1, displayTotal)) ;
        } else {
            System.out.println(MessageFormat.format("{0}{1}! {1}{2}.",greeting, customer1, pendingMessage));
        }
            //Noah
        if (isReadyOrder4) {
            System.out.println(MessageFormat.format("{0}{1}! {1}{2}{3}", greeting, customer4, displayTotal, cappucinoPrice)); 
        } else {
            System.out.println(MessageFormat.format("{0}{1}! {1}{2}.",greeting, customer4, pendingMessage));
        }
    }
    
}
