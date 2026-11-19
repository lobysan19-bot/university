import java.util.Scanner;
class SmartRestaurantOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double drinkp=15.50;
        final double studentdiscount=0.10;
        final double odiscount=0.05;
        final double rate= 0.10;
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter meal price: ");
        double mealPrice = sc.nextDouble();
        System.out.print("Enter number of drinks: ");
        int drinks = sc.nextInt();
        System.out.print("Is the customer a student? (true/false): ");
        boolean student = sc.nextBoolean();
        System.out.print("Enter service rating (1-5): ");
        int rating = sc.nextInt();
        if (rating < 1 || rating > 5) {
            System.out.println("Error: rating must be between 1 and 5");
        } else {
            double drinksCost=drinks*drinkp;
            double subtotal=mealPrice +drinksCost;
            double discountRate=0;
            if (student) {
                discountRate=studentdiscount;
            } else if (age>=60) {
                discountRate=odiscount;
            }
            double discount=subtotal* discountRate;
            double tip = 0;
            if (rating == 4 || rating ==5) {
                tip=(subtotal- discount) * rate;
            }
            double finalbill=subtotal-discount+tip;
            int amount = (int) finalbill;
            System.out.println();
            System.out.println("SMART RESTAURANT");
            System.out.println("Customer: "+ name);
            System.out.printf("Meal: ",mealPrice);
            System.out.printf("Drinks:",drinksCost);
            System.out.printf("Discount:",discount);
            System.out.printf("Tip: ",tip);
            System.out.printf("Final bill: ",finalbill);
            System.out.println("Whole amount:"+amount+"$");
        }
    }
}
