package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class main {

    private Admin[] adminArr = new Admin[4];
    private User[] userArr = new User[100];
    private HashMap<String, ArrayList<Payment>> userPayments = new HashMap<>();
    private ArrayList<BookingDetails> bookingDetailsList = new ArrayList<>();
    private ArrayList<BoothBooking> boothBookingList = new ArrayList<>();
    private ArrayList<Order> tasteOrderList = new ArrayList<>();
    private ArrayList<Order> spicyOrderList = new ArrayList<>();
    private ArrayList<Order> italianOrderList = new ArrayList<>();
    private ArrayList<Order> orientalOrderList = new ArrayList<>();
    private ArrayList<Order> jejaOrderList = new ArrayList<>();
    private ArrayList<Order> seafoodOrderList = new ArrayList<>();
    private ArrayList<Event> eventList = new ArrayList<>();
    private ArrayList<Booking> bookingArr = new ArrayList<>();
    private ArrayList<Order> orderArr = new ArrayList<>();
    private ArrayList<Donation> donationArr = new ArrayList<>();
    private ArrayList<User> userDataArr = new ArrayList<>();
    private Donation donation = new Donation();
    private String loggedInUser;

    public void initialize() {
        adminArr[0] = new Admin("2300971", "J0911", "leexing0911@gmail.com", "John Lee");
        adminArr[1] = new Admin("2300976", "E0704", "eemun0704@gmail.com", "Ee Mun");
        adminArr[2] = new Admin("2300962", "Z2003", "ziqi@gmail.com", "Zi Qi");
        adminArr[3] = new Admin("2300000", "J2003", "justin@gmail.com", "Justin Chan");

        bookingDetailsList.add(new BookingDetails("Game", "Escape Room", "Senator's Little Black Book", 20.0));
        bookingDetailsList.add(new BookingDetails("Game", "Escape Room", "Sunny Zombie Holiday", 20.0));
        bookingDetailsList.add(new BookingDetails("Game", "Escape Room", "Heist to End All Heists", 20.0));
        bookingDetailsList.add(new BookingDetails("Game", "Escape Room", "The Lost Mummy", 20.0));
        bookingDetailsList.add(new BookingDetails("Game", "Escape Room", "Evil Sherlock's secret stash", 20.0));
        bookingDetailsList.add(new BookingDetails("Game", "PS4 Game", "Call of Duty", 15.0));
        bookingDetailsList.add(new BookingDetails("Game", "PS4 Game", "Final Fantasy XIV", 15.0));
        bookingDetailsList.add(new BookingDetails("Game", "PS4 Game", "Crash Team Racing", 15.0));
        bookingDetailsList.add(new BookingDetails("Game", "PS4 Game", "Cyberpunk", 15.0));
        bookingDetailsList.add(new BookingDetails("Game", "PS4 Game", "Far Cry 5", 15.0));
        bookingDetailsList.add(new BookingDetails("Game", "Mystery game", "Murder in Manhattan", 25.5));
        bookingDetailsList.add(new BookingDetails("Game", "Mystery game", "A Pryce in Blood", 25.5));
        bookingDetailsList.add(new BookingDetails("Game", "Mystery game", "Jazz Age Jeopardy", 25.5));
        bookingDetailsList.add(new BookingDetails("Game", "Mystery game", "Casino: Dead Money", 25.5));
        bookingDetailsList.add(new BookingDetails("Game", "Mystery game", "Zombie treasure", 25.5));

        boothBookingList.add(new BoothBooking("10:00am - 11:00am"));
        boothBookingList.add(new BoothBooking("11:00am - 12:00pm"));
        boothBookingList.add(new BoothBooking("12:00pm - 1:00pm"));
        boothBookingList.add(new BoothBooking("2:00pm - 3:00pm"));
        boothBookingList.add(new BoothBooking("3:00pm - 4:00pm"));
        boothBookingList.add(new BoothBooking("4:00pm - 5:00pm"));
        boothBookingList.add(new BoothBooking("5:00pm - 6:00pm"));
        boothBookingList.add(new BoothBooking("6:00pm - 7:00pm"));

        eventList.add(new Event("Community Fundraiser", "March", "Local Community Center", "123 Main Street"));
        eventList.add(new Event("Children's Charity Gala", "April", "Grand Hotel Ballroom", "456 Elm Avenue"));
        eventList.add(new Event("Medical Research Fundraising", "May", "City Convention Center", "789 Oak Street"));
        eventList.add(new Event("Animal Shelter Fundraiser", "June", "Local Park Pavilion", "101 Pine Road"));
        eventList.add(new Event("Education Foundation Charity", "July", "School Auditorium", "222 Maple Lane"));
        eventList.add(new Event("Hunger Relief Drive", "August", "Food Bank Warehouse", "333 Cedar Drive"));

        tasteOrderList.add(new Order("F & B", "Taste Bites", "Beef Taco", 15.9));
        tasteOrderList.add(new Order("F & B", "Taste Bites", "Chicken Taco", 14.5));
        tasteOrderList.add(new Order("F & B", "Taste Bites", "Vegetarian Taco", 16.8));
        tasteOrderList.add(new Order("F & B", "Taste Bites", "Guacamole", 12.9));
        tasteOrderList.add(new Order("F & B", "Taste Bites", "Horchata", 25.9));
        tasteOrderList.add(new Order("F & B", "Taste Bites", "Shrimp Scampi", 13.75));
        tasteOrderList.add(new Order("F & B", "Taste Bites", "Chocolate Cake", 9.99));
        tasteOrderList.add(new Order("F & B", "Taste Bites", "Mango Smoothie", 8.75));
        tasteOrderList.add(new Order("F & B", "Taste Bites", "Margherita Pizza ", 13.9));
        tasteOrderList.add(new Order("F & B", "Taste Bites", "Spicy Ramen", 16.9));
        tasteOrderList.add(new Order("F & B", "Taste Bites", "Sprite", 4.5));
        tasteOrderList.add(new Order("F & B", "Taste Bites", "Watermelon Juice", 6.25));

        spicyOrderList.add(new Order("F & B", "Spicy Masters", "Spicy Beef Noodles", 10.50));
        spicyOrderList.add(new Order("F & B", "Spicy Masters", "Kung Pao Chicken", 13.75));
        spicyOrderList.add(new Order("F & B", "Spicy Masters", "Hot and Sour Soup", 8.99));
        spicyOrderList.add(new Order("F & B", "Spicy Masters", "Spicy Tofu Stir-Fry", 12.50));
        spicyOrderList.add(new Order("F & B", "Spicy Masters", "Szechuan Shrimp", 15.25));
        spicyOrderList.add(new Order("F & B", "Spicy Masters", "Thai Red Curry", 14.90));
        spicyOrderList.add(new Order("F & B", "Spicy Masters", "Chili Chicken", 11.25));
        spicyOrderList.add(new Order("F & B", "Spicy Masters", "Spicy Szechuan Beef", 14.75));
        spicyOrderList.add(new Order("F & B", "Spicy Masters", "Vegetable Spring Rolls", 7.50));
        spicyOrderList.add(new Order("F & B", "Spicy Masters", "Mango Sticky Rice", 9.9));
        spicyOrderList.add(new Order("F & B", "Spicy Masters", "Thai Iced Tea", 5.99));
        spicyOrderList.add(new Order("F & B", "Spicy Masters", "Lychee Soda", 4.75));
        spicyOrderList.add(new Order("F & B", "Spicy Masters", "Ginger Ale", 3.5));

        italianOrderList.add(new Order("F & B", "Italian Delights", "Lasagna", 18.9));
        italianOrderList.add(new Order("F & B", "Italian Delights", "Fettuccine Alfredo", 16.75));
        italianOrderList.add(new Order("F & B", "Italian Delights", "Caprese Salad", 9.5));
        italianOrderList.add(new Order("F & B", "Italian Delights", "Pepperoni Pizza", 14.25));
        italianOrderList.add(new Order("F & B", "Italian Delights", "Tiramisu", 10.99));
        italianOrderList.add(new Order("F & B", "Italian Delights", "Pesto Pasta", 15.5));
        italianOrderList.add(new Order("F & B", "Italian Delights", "Bruschetta", 7.25));
        italianOrderList.add(new Order("F & B", "Italian Delights", "Cannoli", 8.75));
        italianOrderList.add(new Order("F & B", "Italian Delights", "Margherita Pizza", 13.5));
        italianOrderList.add(new Order("F & B", "Italian Delights", "Minestrone Soup", 8.25));
        italianOrderList.add(new Order("F & B", "Italian Delights", "Red Wine", 25.5));
        italianOrderList.add(new Order("F & B", "Italian Delights", "Sparkling Water", 3.99));
        italianOrderList.add(new Order("F & B", "Italian Delights", "Espresso", 4.25));

        orientalOrderList.add(new Order("F & B", "Oriental Eats", "General Tso's Chicken", 14.99));
        orientalOrderList.add(new Order("F & B", "Oriental Eats", "Beef with Broccoli", 15.75));
        orientalOrderList.add(new Order("F & B", "Oriental Eats", "Vegetable Lo Mein", 11.5));
        orientalOrderList.add(new Order("F & B", "Oriental Eats", "Shrimp Fried Rice", 13.25));
        orientalOrderList.add(new Order("F & B", "Oriental Eats", "Sweet and Sour Pork", 12.99));
        orientalOrderList.add(new Order("F & B", "Oriental Eats", "Dim Sum Platter", 16.5));
        orientalOrderList.add(new Order("F & B", "Oriental Eats", "Peking Duck ", 22.99));
        orientalOrderList.add(new Order("F & B", "Oriental Eats", "Wonton Soup", 9.75));
        orientalOrderList.add(new Order("F & B", "Oriental Eats", "Spring Rolls", 7.25));
        orientalOrderList.add(new Order("F & B", "Oriental Eats", "Green Tea Ice Cream", 6.99));
        orientalOrderList.add(new Order("F & B", "Oriental Eats", "Green Tea", 3.75));
        orientalOrderList.add(new Order("F & B", "Oriental Eats", "Lychee Punch", 5.9));
        orientalOrderList.add(new Order("F & B", "Oriental Eats", "Jasmine Tea", 4.5));

        jejaOrderList.add(new Order("F & B", "Jeja Eats", "Gyro Wrap", 12.5));
        jejaOrderList.add(new Order("F & B", "Jeja Eats", "Falafel Plate", 11.99));
        jejaOrderList.add(new Order("F & B", "Jeja Eats", "Hummus and Pita", 8.25));
        jejaOrderList.add(new Order("F & B", "Jeja Eats", "Greek Salad ", 9.75));
        jejaOrderList.add(new Order("F & B", "Jeja Eats", "Shawarma", 13.5));
        jejaOrderList.add(new Order("F & B", "Jeja Eats", "Spanakopita", 10.5));
        jejaOrderList.add(new Order("F & B", "Jeja Eats", "Tabouli Salad ", 7.99));
        jejaOrderList.add(new Order("F & B", "Jeja Eats", "Baklava", 8.99));
        jejaOrderList.add(new Order("F & B", "Jeja Eats", "Tzatziki Sauce", 6.25));
        jejaOrderList.add(new Order("F & B", "Jeja Eats", "Greek Lemon Chicken", 14.75));
        jejaOrderList.add(new Order("F & B", "Jeja Eats", "Greek Yogurt Smoothie", 6.9));
        jejaOrderList.add(new Order("F & B", "Jeja Eats", "Mint Ice TEa", 4.75));
        jejaOrderList.add(new Order("F & B", "Jeja Eats", "Lemonade", 3.25));

        seafoodOrderList.add(new Order("F & B", "Seafood Heaven", "Grilled Salmon", 19.9));
        seafoodOrderList.add(new Order("F & B", "Seafood Heaven", "Lobster Bisque", 15.25));
        seafoodOrderList.add(new Order("F & B", "Seafood Heaven", "Shrimp Scampi", 16.5));
        seafoodOrderList.add(new Order("F & B", "Seafood Heaven", "Clam Chowder", 11.99));
        seafoodOrderList.add(new Order("F & B", "Seafood Heaven", "Crab Cakes", 19.75));
        seafoodOrderList.add(new Order("F & B", "Seafood Heaven", "Tuna Sashimi", 17.5));
        seafoodOrderList.add(new Order("F & B", "Seafood Heaven", "Oysters Rockefeller", 20.9));
        seafoodOrderList.add(new Order("F & B", "Seafood Heaven", "Fish and Chips", 14.25));
        seafoodOrderList.add(new Order("F & B", "Seafood Heaven", "Seafood Paella", 21.5));
        seafoodOrderList.add(new Order("F & B", "Seafood Heaven", "Garlic Butter Shrimp", 13.99));
        seafoodOrderList.add(new Order("F & B", "Seafood Heaven", "White Wine", 22.5));
        seafoodOrderList.add(new Order("F & B", "Seafood Heaven", "Sea Breeze Cocktail", 18.99));
        seafoodOrderList.add(new Order("F & B", "Seafood Heaven", "Blue Lagoon", 19.75));
    }

    public static void displayTastyOrderDetails(ArrayList<Order> tastyOrderList) {
        System.out.println("\n-----------------------------------------------------------------------------");
        System.out.printf("%47s\n", "Taste Bites Menu");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-4s %-32s %-6s\n", "No.", "Food & Beverage Name", "Price");
        for (int i = 0; i < tastyOrderList.size(); i++) {
            Order order = tastyOrderList.get(i);
            System.out.printf(
                    "[%2d] %-32s %-6.2f\n", (i + 1), order.getFoodName(), order.getFoodCost());
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static void displaySpicyOrderDetails(ArrayList<Order> spicyOrderList) {
        System.out.println("\n-----------------------------------------------------------------------------");
        System.out.printf("%47s\n", "Spicy Masters Menu");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-4s %-32s %-6s\n", "No.", "Food & Baverage Name", "Price");
        for (int i = 0; i < spicyOrderList.size(); i++) {
            Order order = spicyOrderList.get(i);
            System.out.printf(
                    "[%2d] %-32s %-6.2f\n", (i + 1), order.getFoodName(), order.getFoodCost());
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static void displayItalianOrderDetails(ArrayList<Order> italianOrderList) {
        System.out.println("\n-----------------------------------------------------------------------------");
        System.out.printf("%47s\n", "Italian Delights Menu");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-4s %-32s %-6s\n", "No.", "Food & Baverage Name", "Price");
        for (int i = 0; i < italianOrderList.size(); i++) {
            Order order = italianOrderList.get(i);
            System.out.printf(
                    "[%2d] %-32s %-6.2f\n", (i + 1), order.getFoodName(), order.getFoodCost());
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static void displayJejaOrderDetails(ArrayList<Order> jejaOrderList) {
        System.out.println("\n-----------------------------------------------------------------------------");
        System.out.printf("%47s\n", "Jeja Eats Menu");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-4s %-32s %-6s\n", "No.", "Food & Baverage Name", "Price");
        for (int i = 0; i < jejaOrderList.size(); i++) {
            Order order = jejaOrderList.get(i);
            System.out.printf(
                    "[%2d] %-32s %-6.2f\n", (i + 1), order.getFoodName(), order.getFoodCost());
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static void displayOrientalOrderDetails(ArrayList<Order> orientalOrderList) {
        System.out.println("\n-----------------------------------------------------------------------------");
        System.out.printf("%47s\n", "Oriental Eats Menu");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-4s %-32s %-6s\n", "No.", "Food & Baverage Name", "Price");
        for (int i = 0; i < orientalOrderList.size(); i++) {
            Order order = orientalOrderList.get(i);
            System.out.printf(
                    "[%2d] %-32s %-6.2f\n", (i + 1), order.getFoodName(), order.getFoodCost());
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static void displaySeafoodOrderDetails(ArrayList<Order> seafoodOrderList) {
        System.out.println("\n-----------------------------------------------------------------------------");
        System.out.printf("%47s\n", "Seafood Heaven Menu");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-4s %-32s %-6s\n", "No.", "Food & Baverage Name", "Price");
        for (int i = 0; i < seafoodOrderList.size(); i++) {
            Order order = seafoodOrderList.get(i);
            System.out.printf(
                    "[%2d] %-32s %-6.2f\n", (i + 1), order.getFoodName(), order.getFoodCost());
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static void displayEventDetails(ArrayList<Event> EventList) {
        System.out.println("\n-----------------------------------------------------------------------------------------");
        System.out.printf("%60s\n", "Upcoming Fundraising & Charity Event");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("%-36s %-10s %-25s %-18s\n", "Event Name", "Month", "Location", "Address");
        for (int i = 0; i < EventList.size(); i++) {
            Event event = EventList.get(i);
            System.out.printf(
                    "[%d]   %-30s %-10s %-25s %-18s\n", (i + 1), event.getName(), event.getMonth(), event.getLocation(), event.getAddress());
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public void displayPaymentsForAllUsers() {
        System.out.println("Payments for All Users:");
        for (String username : userPayments.keySet()) {
            displayPayments(username);
        }
    }

    public void orderPayment(String username, User authenticatedUser, double pendingAmount, Order order) {
        double amount = authenticatedUser.getCouponBalance(username);
        if (amount < pendingAmount) {
            System.err.println("Insufficient coupon, please reload");
            purchaseCoupon(username, authenticatedUser);
        } else {
            authenticatedUser.useCouponBalance(username, pendingAmount);
            double balance = authenticatedUser.getCouponBalance(username);
            String formattedBalance = String.format("%.2f", balance);
            System.out.println("Order successfully placed by " + username + "! Current coupon balance: " + formattedBalance);
            orderArr.add(order);
            authenticatedUser.addOrder(username, order);
            boothBooking(username, authenticatedUser);
        }
    }

    public void boothPayment(String username, User authenticatedUser, double pendingAmount, Booking booking) {
        double amount = authenticatedUser.getCouponBalance(username);
        if (amount < pendingAmount) {
            System.err.println("Insufficient coupon, please reload");
            purchaseCoupon(username, authenticatedUser);
        } else {
            authenticatedUser.useCouponBalance(username, pendingAmount);
            double balance = authenticatedUser.getCouponBalance(username);
            String formattedBalance = String.format("%.2f", balance);
            System.out.println("Game successfully booked by " + username + "! Current coupon balance: " + formattedBalance);
            bookingArr.add(booking);
            authenticatedUser.addBooking(username, booking);
            boothBooking(username, authenticatedUser);
        }
    }

    // Inheritance cards, different validation
    public void makePayment(String username, User authenticatedUser, double pendingAmount, double totalGain) {
        CouponPoint couponPoint = new CouponPoint();

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.print("Select payment method (1 for Credit Card, 2 for E-Wallet): ");
        int paymentMethod = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (paymentMethod) {
            case 1 -> {
                System.out.print("Enter card number: ");
                String cardNumber = scanner.nextLine();

                if (cardNumber.length() == 16 && cardNumber.matches("[0-9]+")) {
                    System.out.print("Enter CVV code: ");
                    int CVV = scanner.nextInt();
                    scanner.nextLine();
                    if (CVV >= 100 && CVV <= 999) {
                        Payment payment = new CreditCard(pendingAmount, cardNumber);
                        userPayments.get(username).add(payment);
                        User user = new User();
                        user.addCouponBalance(username, totalGain);
                        user.addPointBalance(username, totalGain);
                        System.out.println("Coupon added for " + username + ": " + totalGain + " coupons amount");
                        purchaseCoupon(username, authenticatedUser);
                    } else {
                        System.out.println("Invalid CVV code, please try again");
                        makePayment(username, authenticatedUser, pendingAmount, totalGain);
                    }
                } else {
                    System.out.println("Invalid card number, please enter a 16-digit numeric card number");
                    makePayment(username, authenticatedUser, pendingAmount, totalGain);
                }

            }

            case 2 -> {
                System.out.print("Enter E-Wallet ID (same as IC full name): ");
                String eWalletId = scanner.nextLine();
                if (eWalletId.equals(authenticatedUser.getName(username))) {
                    System.out.print("Enter E-Wallet password (same as account password): ");
                    String eWalletPW = scanner.nextLine();
                    if (eWalletPW.equals(authenticatedUser.getPassword(username))) {
                        Payment payment = new EWallet(pendingAmount, eWalletId);
                        userPayments.get(username).add(payment);
                        User user = new User();
                        user.addCouponBalance(username, totalGain);
                        user.addPointBalance(username, totalGain);
                        System.out.println("Coupon added for " + username + ": " + totalGain + " coupons amount");
                    } else {
                        System.err.println("Invalid ID or Password. Please try again");
                        makePayment(username, authenticatedUser, pendingAmount, totalGain);
                    }

                } else {
                    System.err.println("Invalid E-Wallet ID, please try again");
                    makePayment(username, authenticatedUser, pendingAmount, totalGain);
                }
            }

            default -> {
                System.err.println("Invalid payment method.");
                makePayment(username, authenticatedUser, pendingAmount, totalGain);
            }
        }
    }

    public void displayPayments(String username) {
        ArrayList<Payment> payments = userPayments.get(username);

        if (payments == null || payments.isEmpty()) {
            System.out.println("No payments found for " + username);
        } else {
            System.out.println("Payments for " + username + ":");
            for (Payment payment : payments) {
                String paymentType = payment instanceof CreditCard ? "Credit Card" : "E-Wallet";
                System.out.println("- RM" + payment.getAmount() + " (" + paymentType + ")");
            }
        }
    }

    public void adminAcc(String loginID, Admin authenticatedAdmin) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n--------------------------------");
        System.out.println("|                              |");
        System.out.println("|          Admin Menu          |");
        System.out.println("|                              |");
        System.out.println("|  1. Users' Purchase Details  |");
        System.out.println("|  2. Modify Game Booth        |");
        System.out.println("|  3. Modify F&B Booth         |");
        System.out.println("|  4. Modify Event             |");
        System.out.println("|  5. Donations Received       |");
        System.out.println("|  6. Registerd Users          |");
        System.out.println("|  7. Log Out                  |");
        System.out.println("|                              |");
        System.out.println("--------------------------------");
        System.out.print("Enter your selection: ");
        int selection = input.nextInt();
        input.nextLine();

        switch (selection) {
            case 1 -> {
                System.out.println("\n-----------------------------------");
                System.out.println("|                                 |");
                System.out.println("|     Purchases Made By Users     |");
                System.out.println("|                                 |");
                System.out.println("-----------------------------------");
                System.out.println("\nOrders Made");
                System.out.println("-----------");
                System.out.printf("%-9s %-11s %-15s %-30s %-6s %-4s %-10s\n",
                        "Order No", "Booth Type", "Booth Name", "Food and Beverage Name", "Price", "Qty", "Sub Total");
                for (Order order : orderArr) {
                    System.out.println(order); // Assuming Booking has a toString() method
                }

                System.out.println("\nBookings");
                System.out.println("--------");
                System.out.printf("%-11s %-11s %-18s %-11s %-20s %-32s %-6s %-4s %-10s\n",
                        "Booking No", "Date", "Time", "Booth Type", "Booth Name", "Theme", "Price", "Qty", "Total");
                for (Booking booking : bookingArr) {
                    System.out.println(booking); // Assuming Booking has a toString() method
                }
                adminAcc(loginID, authenticatedAdmin);
            }

            case 2 -> {
                System.out.println("1. Remove Booth");
                System.out.println("2. Add Booth");
                System.out.println("3. Edit Booth");
                System.out.print("Enter selection: ");
                int updateChoice = input.nextInt();
                input.nextLine();

                switch (updateChoice) {
                    case 1 -> {
                        displayBookingDetails(bookingDetailsList);
                        //==================REMOVE BOOKING LIST(EVENT MONITORING)====================
                        System.out.print("Booth to remove in numbers: ");
                        int indexToRemove = input.nextInt();
                        input.nextLine();

                        if (indexToRemove >= 0 && indexToRemove <= bookingDetailsList.size()) {
                            bookingDetailsList.remove(indexToRemove - 1);
                            System.out.println("BookingDetails removed successfully.");
                            displayBookingDetails(bookingDetailsList);
                            adminAcc(loginID, authenticatedAdmin);
                        } else {
                            System.err.println("Invalid index. No BookingDetails removed.");
                            adminAcc(loginID, authenticatedAdmin);
                        }
                    }

                    case 2 -> {
                        //==================ADD BOOKING LIST(EVENT MONITORING)====================
                        displayBookingDetails(bookingDetailsList);

                        System.out.print("Add new Booth\n");
                        System.out.print("Enter the booth type: ");
                        String type = input.nextLine();

                        System.out.print("Enter the booth name: ");
                        String name = input.nextLine();

                        System.out.print("Enter the theme: ");
                        String theme = input.nextLine();

                        System.out.print("Enter the cost per booking: ");
                        double cost = input.nextDouble();
                        input.nextLine();

                        // Create a BookingDetails object and add it to the ArrayList
                        BookingDetails bookingDetail = new BookingDetails(type, name, theme, cost);
                        bookingDetailsList.add(bookingDetail);

                        System.out.println("BookingDetails added successfully.");
                        displayBookingDetails(bookingDetailsList);
                        adminAcc(loginID, authenticatedAdmin);
                    }

                    case 3 -> {
                        System.out.println("1. Edit Booth Name");
                        System.out.println("2. Edit Booth Theme");
                        System.out.println("3. Edit Booth Price");
                        System.out.println("4. Exit");
                        System.out.print("Enter selection: ");
                        int editChoice = input.nextInt();
                        input.nextLine();

                        switch (editChoice) {
                            case 1 -> {
                                displayBookingDetails(bookingDetailsList);
                                // Prompt the user to choose an index to edit the price
                                System.out.print("Enter the index of the BookingDetails to edit the name: ");
                                int indexToEdit = input.nextInt();
                                input.nextLine(); // Consume the newline character

                                // Check if the index is valid
                                if (indexToEdit >= 0 && indexToEdit <= bookingDetailsList.size()) {
                                    // Retrieve the BookingDetails object at the specified index

                                    BookingDetails bookingDetail = bookingDetailsList.get(indexToEdit - 1);

                                    // Prompt the user for the new price
                                    System.out.print("Enter the new name: ");
                                    String newName = input.nextLine();

                                    // Update the price attribute of the BookingDetails object
                                    bookingDetail.setBoothName(newName);

                                    System.out.println("Name of BookingDetails at index " + indexToEdit + " edited successfully.");
                                } else {
                                    System.err.println("Invalid index. No BookingDetails name edited.");
                                }

                                // Display the updated BookingDetails in the ArrayList
                                System.out.println("Updated BookingDetails:");
                                displayBookingDetails(bookingDetailsList);
                                adminAcc(loginID, authenticatedAdmin);
                            }

                            case 2 -> {
                                displayBookingDetails(bookingDetailsList);
                                // Prompt the user to choose an index to edit the price
                                System.out.print("Enter the index of the BookingDetails to edit the theme: ");
                                int indexToEdit = input.nextInt();
                                input.nextLine(); // Consume the newline character

                                // Check if the index is valid
                                if (indexToEdit >= 0 && indexToEdit <= bookingDetailsList.size()) {
                                    // Retrieve the BookingDetails object at the specified index

                                    BookingDetails bookingDetail = bookingDetailsList.get(indexToEdit - 1);

                                    // Prompt the user for the new price
                                    System.out.print("Enter the new theme: ");
                                    String newTheme = input.nextLine();

                                    // Update the price attribute of the BookingDetails object
                                    bookingDetail.setTheme(newTheme);

                                    System.out.println("Theme of BookingDetails at index " + indexToEdit + " edited successfully.");
                                } else {
                                    System.err.println("Invalid index. No BookingDetails theme edited.");
                                }

                                // Display the updated BookingDetails in the ArrayList
                                System.out.println("Updated BookingDetails:");
                                displayBookingDetails(bookingDetailsList);
                                adminAcc(loginID, authenticatedAdmin);
                            }

                            case 3 -> {
                                displayBookingDetails(bookingDetailsList);
                                // Prompt the user to choose an index to edit the price
                                System.out.print("Enter the index of the BookingDetails to edit the price: ");
                                int indexToEdit = input.nextInt();
                                input.nextLine(); // Consume the newline character

                                // Check if the index is valid
                                if (indexToEdit >= 0 && indexToEdit <= bookingDetailsList.size()) {
                                    // Retrieve the BookingDetails object at the specified index

                                    BookingDetails bookingDetail = bookingDetailsList.get(indexToEdit - 1);

                                    // Prompt the user for the new price
                                    System.out.print("Enter the new price: ");
                                    double newPrice = input.nextDouble();
                                    input.nextLine(); // Consume the newline character

                                    // Update the price attribute of the BookingDetails object
                                    bookingDetail.setBoothCost(newPrice);

                                    System.out.println("Price of BookingDetails at index " + indexToEdit + " edited successfully.");
                                } else {
                                    System.err.println("Invalid index. No BookingDetails price edited.");
                                }

                                // Display the updated BookingDetails in the ArrayList
                                System.out.println("Updated BookingDetails:");
                                displayBookingDetails(bookingDetailsList);
                                adminAcc(loginID, authenticatedAdmin);
                            }

                            case 4 -> {
                                adminAcc(loginID, authenticatedAdmin);
                            }

                            default -> {
                                System.err.println("Invalid input, please try again");
                                adminAcc(loginID, authenticatedAdmin);
                            }
                        }
                    }

                    default -> {
                        System.err.println("Invalid selection, please try again");
                        adminAcc(loginID, authenticatedAdmin);
                    }
                }
            }

            case 3 -> {
                System.out.println("\n------------------------------------------------");
                System.out.println("|                                              |");
                System.out.println("|            Food & Bavegrage Booth            |");
                System.out.println("|                                              |");
                System.out.println("|  1. Taste Bites          2. Spicy Masters    |");
                System.out.println("|  3. Italian Delights     4. Oriental Eats    |");
                System.out.println("|  5. Jeja Eats            6. Seafood Heaven   |");
                System.out.println("|  7. Exit                                     |");
                System.out.println("|                                              |");
                System.out.println("------------------------------------------------");
                System.out.print("Enter selection: ");
                int foodChoice = input.nextInt();
                input.nextLine();

                switch (foodChoice) {
                    case 1 -> {
                        System.out.println("1. Remove Food");
                        System.out.println("2. Add Food");
                        System.out.println("3. Edit Food");
                        System.out.print("Enter selection: ");
                        int updateChoice = input.nextInt();
                        input.nextLine();

                        switch (updateChoice) {
                            case 1 -> {
                                displayTastyOrderDetails(tasteOrderList);
                                //==================REMOVE BOOKING LIST(EVENT MONITORING)====================
                                System.out.print("Food to remove in numbers: ");
                                int indexToRemove = input.nextInt();
                                input.nextLine();

                                if (indexToRemove >= 0 && indexToRemove <= tasteOrderList.size()) {
                                    tasteOrderList.remove(indexToRemove - 1);
                                    System.out.println("Food removed successfully.");
                                    displayTastyOrderDetails(tasteOrderList);
                                    adminAcc(loginID, authenticatedAdmin);
                                } else {
                                    System.err.println("Invalid index. No food removed.");
                                    adminAcc(loginID, authenticatedAdmin);
                                }
                            }

                            case 2 -> {
                                //==================ADD BOOKING LIST(EVENT MONITORING)====================
                                displayTastyOrderDetails(tasteOrderList);

                                System.out.println("Add new Food");
                                System.out.print("Enter the food name: ");
                                String foodName = input.nextLine();

                                System.out.print("Enter the food price: ");
                                double price = input.nextDouble();
                                input.nextLine();

                                String boothType = "F & B";
                                String boothName = "Taste Bites";
                                // Create a BookingDetails object and add it to the ArrayList
                                Order order = new Order(boothType, boothName, foodName, price);
                                tasteOrderList.add(order);

                                System.out.println("Food added successfully.");
                                displayTastyOrderDetails(tasteOrderList);
                                adminAcc(loginID, authenticatedAdmin);
                            }

                            case 3 -> {
                                System.out.println("1. Edit Food Name");
                                System.out.println("2. Edit Food Price");
                                System.out.println("3. Exit");
                                System.out.print("Enter selection: ");
                                int editChoice = input.nextInt();
                                input.nextLine();

                                switch (editChoice) {
                                    case 1 -> {
                                        displayTastyOrderDetails(tasteOrderList);
                                        // Prompt the user to choose an index to edit the price
                                        System.out.print("Enter the index of the Food to edit the name: ");
                                        int indexToEdit = input.nextInt();
                                        input.nextLine(); // Consume the newline character

                                        // Check if the index is valid
                                        if (indexToEdit >= 0 && indexToEdit <= tasteOrderList.size()) {
                                            // Retrieve the BookingDetails object at the specified index

                                            Order order = tasteOrderList.get(indexToEdit - 1);

                                            // Prompt the user for the new price
                                            System.out.print("Enter the new name: ");
                                            String newName = input.nextLine();

                                            // Update the price attribute of the BookingDetails object
                                            order.setFoodName(newName);

                                            System.out.println("Name of Food at index " + indexToEdit + " edited successfully.");
                                        } else {
                                            System.err.println("Invalid index. No Food name edited.");
                                        }

                                        // Display the updated BookingDetails in the ArrayList
                                        System.out.println("Updated Food:");
                                        displayTastyOrderDetails(tasteOrderList);
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    case 2 -> {
                                        displayTastyOrderDetails(tasteOrderList);
                                        // Prompt the user to choose an index to edit the price
                                        System.out.print("Enter the index of the Food to edit the price: ");
                                        int indexToEdit = input.nextInt();
                                        input.nextLine(); // Consume the newline character

                                        // Check if the index is valid
                                        if (indexToEdit >= 0 && indexToEdit <= tasteOrderList.size()) {
                                            // Retrieve the BookingDetails object at the specified index

                                            Order order = tasteOrderList.get(indexToEdit - 1);

                                            // Prompt the user for the new price
                                            System.out.print("Enter the new price: ");
                                            double newPrice = input.nextDouble();
                                            input.nextLine();

                                            // Update the price attribute of the BookingDetails object
                                            order.setFoodCost(newPrice);

                                            System.out.println("Price of Food at index " + indexToEdit + " edited successfully.");
                                        } else {
                                            System.err.println("Invalid index. No Food price edited.");
                                            adminAcc(loginID, authenticatedAdmin);
                                        }

                                        // Display the updated BookingDetails in the ArrayList
                                        System.out.println("Updated BookingDetails:");
                                        displayTastyOrderDetails(tasteOrderList);
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    case 3 -> {
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    default -> {
                                        System.err.println("Invalid input, please try again");
                                        adminAcc(loginID, authenticatedAdmin);
                                    }
                                }
                            }

                            default -> {
                                System.err.println("Invalid selection, please try again");
                                adminAcc(loginID, authenticatedAdmin);
                            }
                        }
                    }

                    case 2 -> {
                        System.out.println("1. Remove Food");
                        System.out.println("2. Add Food");
                        System.out.println("3. Edit Food");
                        System.out.print("Enter selection: ");
                        int updateChoice = input.nextInt();
                        input.nextLine();

                        switch (updateChoice) {
                            case 1 -> {
                                displaySpicyOrderDetails(spicyOrderList);
                                //==================REMOVE BOOKING LIST(EVENT MONITORING)====================
                                System.out.print("Food to remove in numbers: ");
                                int indexToRemove = input.nextInt();
                                input.nextLine();

                                if (indexToRemove >= 0 && indexToRemove <= spicyOrderList.size()) {
                                    spicyOrderList.remove(indexToRemove - 1);
                                    System.out.println("Food removed successfully.");
                                    displaySpicyOrderDetails(spicyOrderList);
                                    adminAcc(loginID, authenticatedAdmin);
                                } else {
                                    System.err.println("Invalid index. No food removed.");
                                    adminAcc(loginID, authenticatedAdmin);
                                }
                            }

                            case 2 -> {
                                //==================ADD BOOKING LIST(EVENT MONITORING)====================
                                displaySpicyOrderDetails(spicyOrderList);

                                System.out.println("Add new Food");
                                System.out.print("Enter the food name: ");
                                String foodName = input.nextLine();

                                System.out.print("Enter the food price: ");
                                double price = input.nextDouble();
                                input.nextLine();

                                String boothType = "F & B";
                                String boothName = "Taste Bites";
                                // Create a BookingDetails object and add it to the ArrayList
                                Order order = new Order(boothType, boothName, foodName, price);
                                spicyOrderList.add(order);

                                System.out.println("Food added successfully.");
                                displaySpicyOrderDetails(spicyOrderList);
                                adminAcc(loginID, authenticatedAdmin);
                            }

                            case 3 -> {
                                System.out.println("1. Edit Food Name");
                                System.out.println("2. Edit Food Price");
                                System.out.println("3. Exit");
                                System.out.print("Enter selection: ");
                                int editChoice = input.nextInt();
                                input.nextLine();

                                switch (editChoice) {
                                    case 1 -> {
                                        displaySpicyOrderDetails(spicyOrderList);
                                        // Prompt the user to choose an index to edit the price
                                        System.out.print("Enter the index of the Food to edit the name: ");
                                        int indexToEdit = input.nextInt();
                                        input.nextLine(); // Consume the newline character

                                        // Check if the index is valid
                                        if (indexToEdit >= 0 && indexToEdit <= spicyOrderList.size()) {
                                            // Retrieve the BookingDetails object at the specified index

                                            Order order = spicyOrderList.get(indexToEdit - 1);

                                            // Prompt the user for the new price
                                            System.out.print("Enter the new name: ");
                                            String newName = input.nextLine();

                                            // Update the price attribute of the BookingDetails object
                                            order.setFoodName(newName);

                                            System.out.println("Name of Food at index " + indexToEdit + " edited successfully.");
                                        } else {
                                            System.err.println("Invalid index. No Food name edited.");
                                        }

                                        // Display the updated BookingDetails in the ArrayList
                                        System.out.println("Updated Food:");
                                        displayTastyOrderDetails(spicyOrderList);
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    case 2 -> {
                                        displaySpicyOrderDetails(spicyOrderList);
                                        // Prompt the user to choose an index to edit the price
                                        System.out.print("Enter the index of the Food to edit the price: ");
                                        int indexToEdit = input.nextInt();
                                        input.nextLine(); // Consume the newline character

                                        // Check if the index is valid
                                        if (indexToEdit >= 0 && indexToEdit <= spicyOrderList.size()) {
                                            // Retrieve the BookingDetails object at the specified index

                                            Order order = spicyOrderList.get(indexToEdit - 1);

                                            // Prompt the user for the new price
                                            System.out.print("Enter the new price: ");
                                            double newPrice = input.nextDouble();
                                            input.nextLine();

                                            // Update the price attribute of the BookingDetails object
                                            order.setFoodCost(newPrice);

                                            System.out.println("Price of Food at index " + indexToEdit + " edited successfully.");
                                        } else {
                                            System.err.println("Invalid index. No Food price edited.");
                                            adminAcc(loginID, authenticatedAdmin);
                                        }

                                        // Display the updated BookingDetails in the ArrayList
                                        System.out.println("Updated BookingDetails:");
                                        displayTastyOrderDetails(spicyOrderList);
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    case 3 -> {
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    default -> {
                                        System.err.println("Invalid input, please try again");
                                        adminAcc(loginID, authenticatedAdmin);
                                    }
                                }
                            }

                            default -> {
                                System.err.println("Invalid selection, please try again");
                                adminAcc(loginID, authenticatedAdmin);
                            }
                        }
                    }

                    case 3 -> {
                        System.out.println("1. Remove Food");
                        System.out.println("2. Add Food");
                        System.out.println("3. Edit Food");
                        System.out.print("Enter selection: ");
                        int updateChoice = input.nextInt();
                        input.nextLine();

                        switch (updateChoice) {
                            case 1 -> {
                                displayItalianOrderDetails(italianOrderList);
                                //==================REMOVE BOOKING LIST(EVENT MONITORING)====================
                                System.out.print("Food to remove in numbers: ");
                                int indexToRemove = input.nextInt();
                                input.nextLine();

                                if (indexToRemove >= 0 && indexToRemove <= italianOrderList.size()) {
                                    italianOrderList.remove(indexToRemove - 1);
                                    System.out.println("Food removed successfully.");
                                    displayItalianOrderDetails(italianOrderList);
                                    adminAcc(loginID, authenticatedAdmin);
                                } else {
                                    System.err.println("Invalid index. No food removed.");
                                    adminAcc(loginID, authenticatedAdmin);
                                }
                            }

                            case 2 -> {
                                //==================ADD BOOKING LIST(EVENT MONITORING)====================
                                displayItalianOrderDetails(italianOrderList);

                                System.out.println("Add new Food");
                                System.out.print("Enter the food name: ");
                                String foodName = input.nextLine();

                                System.out.print("Enter the food price: ");
                                double price = input.nextDouble();
                                input.nextLine();

                                String boothType = "F & B";
                                String boothName = "Taste Bites";
                                // Create a BookingDetails object and add it to the ArrayList
                                Order order = new Order(boothType, boothName, foodName, price);
                                italianOrderList.add(order);

                                System.out.println("Food added successfully.");
                                displayItalianOrderDetails(italianOrderList);
                                adminAcc(loginID, authenticatedAdmin);
                            }

                            case 3 -> {
                                System.out.println("1. Edit Food Name");
                                System.out.println("2. Edit Food Price");
                                System.out.println("3. Exit");
                                System.out.print("Enter selection: ");
                                int editChoice = input.nextInt();
                                input.nextLine();

                                switch (editChoice) {
                                    case 1 -> {
                                        displayItalianOrderDetails(italianOrderList);
                                        // Prompt the user to choose an index to edit the price
                                        System.out.print("Enter the index of the Food to edit the name: ");
                                        int indexToEdit = input.nextInt();
                                        input.nextLine(); // Consume the newline character

                                        // Check if the index is valid
                                        if (indexToEdit >= 0 && indexToEdit <= italianOrderList.size()) {
                                            // Retrieve the BookingDetails object at the specified index

                                            Order order = italianOrderList.get(indexToEdit - 1);

                                            // Prompt the user for the new price
                                            System.out.print("Enter the new name: ");
                                            String newName = input.nextLine();

                                            // Update the price attribute of the BookingDetails object
                                            order.setFoodName(newName);

                                            System.out.println("Name of Food at index " + indexToEdit + " edited successfully.");
                                        } else {
                                            System.err.println("Invalid index. No Food name edited.");
                                        }

                                        // Display the updated BookingDetails in the ArrayList
                                        System.out.println("Updated Food:");
                                        displayItalianOrderDetails(italianOrderList);
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    case 2 -> {
                                        displayItalianOrderDetails(italianOrderList);
                                        // Prompt the user to choose an index to edit the price
                                        System.out.print("Enter the index of the Food to edit the price: ");
                                        int indexToEdit = input.nextInt();
                                        input.nextLine(); // Consume the newline character

                                        // Check if the index is valid
                                        if (indexToEdit >= 0 && indexToEdit <= italianOrderList.size()) {
                                            // Retrieve the BookingDetails object at the specified index

                                            Order order = italianOrderList.get(indexToEdit - 1);

                                            // Prompt the user for the new price
                                            System.out.print("Enter the new price: ");
                                            double newPrice = input.nextDouble();
                                            input.nextLine();

                                            // Update the price attribute of the BookingDetails object
                                            order.setFoodCost(newPrice);

                                            System.out.println("Price of Food at index " + indexToEdit + " edited successfully.");
                                        } else {
                                            System.err.println("Invalid index. No Food price edited.");
                                            adminAcc(loginID, authenticatedAdmin);
                                        }

                                        // Display the updated BookingDetails in the ArrayList
                                        System.out.println("Updated BookingDetails:");
                                        displayItalianOrderDetails(italianOrderList);
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    case 3 -> {
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    default -> {
                                        System.err.println("Invalid input, please try again");
                                        adminAcc(loginID, authenticatedAdmin);
                                    }
                                }
                            }

                            default -> {
                                System.err.println("Invalid selection, please try again");
                                adminAcc(loginID, authenticatedAdmin);
                            }
                        }
                    }

                    case 4 -> {
                        System.out.println("1. Remove Food");
                        System.out.println("2. Add Food");
                        System.out.println("3. Edit Food");
                        System.out.print("Enter selection: ");
                        int updateChoice = input.nextInt();
                        input.nextLine();

                        switch (updateChoice) {
                            case 1 -> {
                                displayOrientalOrderDetails(orientalOrderList);
                                //==================REMOVE BOOKING LIST(EVENT MONITORING)====================
                                System.out.print("Food to remove in numbers: ");
                                int indexToRemove = input.nextInt();
                                input.nextLine();

                                if (indexToRemove >= 0 && indexToRemove <= orientalOrderList.size()) {
                                    orientalOrderList.remove(indexToRemove - 1);
                                    System.out.println("Food removed successfully.");
                                    displayOrientalOrderDetails(orientalOrderList);
                                    adminAcc(loginID, authenticatedAdmin);
                                } else {
                                    System.err.println("Invalid index. No food removed.");
                                    adminAcc(loginID, authenticatedAdmin);
                                }
                            }

                            case 2 -> {
                                //==================ADD BOOKING LIST(EVENT MONITORING)====================
                                displayOrientalOrderDetails(orientalOrderList);

                                System.out.println("Add new Food");
                                System.out.print("Enter the food name: ");
                                String foodName = input.nextLine();

                                System.out.print("Enter the food price: ");
                                double price = input.nextDouble();
                                input.nextLine();

                                String boothType = "F & B";
                                String boothName = "Taste Bites";
                                // Create a BookingDetails object and add it to the ArrayList
                                Order order = new Order(boothType, boothName, foodName, price);
                                orientalOrderList.add(order);

                                System.out.println("Food added successfully.");
                                displayOrientalOrderDetails(orientalOrderList);
                                adminAcc(loginID, authenticatedAdmin);
                            }

                            case 3 -> {
                                System.out.println("1. Edit Food Name");
                                System.out.println("2. Edit Food Price");
                                System.out.println("3. Exit");
                                System.out.print("Enter selection: ");
                                int editChoice = input.nextInt();
                                input.nextLine();

                                switch (editChoice) {
                                    case 1 -> {
                                        displayOrientalOrderDetails(orientalOrderList);
                                        // Prompt the user to choose an index to edit the price
                                        System.out.print("Enter the index of the Food to edit the name: ");
                                        int indexToEdit = input.nextInt();
                                        input.nextLine(); // Consume the newline character

                                        // Check if the index is valid
                                        if (indexToEdit >= 0 && indexToEdit <= orientalOrderList.size()) {
                                            // Retrieve the BookingDetails object at the specified index

                                            Order order = orientalOrderList.get(indexToEdit - 1);

                                            // Prompt the user for the new price
                                            System.out.print("Enter the new name: ");
                                            String newName = input.nextLine();

                                            // Update the price attribute of the BookingDetails object
                                            order.setFoodName(newName);

                                            System.out.println("Name of Food at index " + indexToEdit + " edited successfully.");
                                        } else {
                                            System.err.println("Invalid index. No Food name edited.");
                                        }

                                        // Display the updated BookingDetails in the ArrayList
                                        System.out.println("Updated Food:");
                                        displayOrientalOrderDetails(orientalOrderList);
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    case 2 -> {
                                        displayOrientalOrderDetails(orientalOrderList);
                                        // Prompt the user to choose an index to edit the price
                                        System.out.print("Enter the index of the Food to edit the price: ");
                                        int indexToEdit = input.nextInt();
                                        input.nextLine(); // Consume the newline character

                                        // Check if the index is valid
                                        if (indexToEdit >= 0 && indexToEdit <= orientalOrderList.size()) {
                                            // Retrieve the BookingDetails object at the specified index

                                            Order order = orientalOrderList.get(indexToEdit - 1);

                                            // Prompt the user for the new price
                                            System.out.print("Enter the new price: ");
                                            double newPrice = input.nextDouble();
                                            input.nextLine();

                                            // Update the price attribute of the BookingDetails object
                                            order.setFoodCost(newPrice);

                                            System.out.println("Price of Food at index " + indexToEdit + " edited successfully.");
                                        } else {
                                            System.err.println("Invalid index. No Food price edited.");
                                            adminAcc(loginID, authenticatedAdmin);
                                        }

                                        // Display the updated BookingDetails in the ArrayList
                                        System.out.println("Updated BookingDetails:");
                                        displayOrientalOrderDetails(orientalOrderList);
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    case 3 -> {
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    default -> {
                                        System.err.println("Invalid input, please try again");
                                        adminAcc(loginID, authenticatedAdmin);
                                    }
                                }
                            }

                            default -> {
                                System.err.println("Invalid selection, please try again");
                                adminAcc(loginID, authenticatedAdmin);
                            }
                        }
                    }

                    case 5 -> {
                        System.out.println("1. Remove Food");
                        System.out.println("2. Add Food");
                        System.out.println("3. Edit Food");
                        System.out.print("Enter selection: ");
                        int updateChoice = input.nextInt();
                        input.nextLine();

                        switch (updateChoice) {
                            case 1 -> {
                                displayJejaOrderDetails(jejaOrderList);
                                //==================REMOVE BOOKING LIST(EVENT MONITORING)====================
                                System.out.print("Food to remove in numbers: ");
                                int indexToRemove = input.nextInt();
                                input.nextLine();

                                if (indexToRemove >= 0 && indexToRemove <= jejaOrderList.size()) {
                                    jejaOrderList.remove(indexToRemove - 1);
                                    System.out.println("Food removed successfully.");
                                    displayJejaOrderDetails(jejaOrderList);
                                    adminAcc(loginID, authenticatedAdmin);
                                } else {
                                    System.err.println("Invalid index. No food removed.");
                                    adminAcc(loginID, authenticatedAdmin);
                                }
                            }

                            case 2 -> {
                                //==================ADD BOOKING LIST(EVENT MONITORING)====================
                                displayJejaOrderDetails(jejaOrderList);

                                System.out.println("Add new Food");
                                System.out.print("Enter the food name: ");
                                String foodName = input.nextLine();

                                System.out.print("Enter the food price: ");
                                double price = input.nextDouble();
                                input.nextLine();

                                String boothType = "F & B";
                                String boothName = "Taste Bites";
                                // Create a BookingDetails object and add it to the ArrayList
                                Order order = new Order(boothType, boothName, foodName, price);
                                jejaOrderList.add(order);

                                System.out.println("Food added successfully.");
                                displayJejaOrderDetails(jejaOrderList);
                                adminAcc(loginID, authenticatedAdmin);
                            }

                            case 3 -> {
                                System.out.println("1. Edit Food Name");
                                System.out.println("2. Edit Food Price");
                                System.out.println("3. Exit");
                                System.out.print("Enter selection: ");
                                int editChoice = input.nextInt();
                                input.nextLine();

                                switch (editChoice) {
                                    case 1 -> {
                                        displayJejaOrderDetails(jejaOrderList);
                                        // Prompt the user to choose an index to edit the price
                                        System.out.print("Enter the index of the Food to edit the name: ");
                                        int indexToEdit = input.nextInt();
                                        input.nextLine(); // Consume the newline character

                                        // Check if the index is valid
                                        if (indexToEdit >= 0 && indexToEdit <= jejaOrderList.size()) {
                                            // Retrieve the BookingDetails object at the specified index

                                            Order order = jejaOrderList.get(indexToEdit - 1);

                                            // Prompt the user for the new price
                                            System.out.print("Enter the new name: ");
                                            String newName = input.nextLine();

                                            // Update the price attribute of the BookingDetails object
                                            order.setFoodName(newName);

                                            System.out.println("Name of Food at index " + indexToEdit + " edited successfully.");
                                        } else {
                                            System.err.println("Invalid index. No Food name edited.");
                                        }

                                        // Display the updated BookingDetails in the ArrayList
                                        System.out.println("Updated Food:");
                                        displayJejaOrderDetails(jejaOrderList);
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    case 2 -> {
                                        displayJejaOrderDetails(jejaOrderList);
                                        // Prompt the user to choose an index to edit the price
                                        System.out.print("Enter the index of the Food to edit the price: ");
                                        int indexToEdit = input.nextInt();
                                        input.nextLine(); // Consume the newline character

                                        // Check if the index is valid
                                        if (indexToEdit >= 0 && indexToEdit <= jejaOrderList.size()) {
                                            // Retrieve the BookingDetails object at the specified index

                                            Order order = jejaOrderList.get(indexToEdit - 1);

                                            // Prompt the user for the new price
                                            System.out.print("Enter the new price: ");
                                            double newPrice = input.nextDouble();
                                            input.nextLine();

                                            // Update the price attribute of the BookingDetails object
                                            order.setFoodCost(newPrice);

                                            System.out.println("Price of Food at index " + indexToEdit + " edited successfully.");
                                        } else {
                                            System.err.println("Invalid index. No Food price edited.");
                                            adminAcc(loginID, authenticatedAdmin);
                                        }

                                        // Display the updated BookingDetails in the ArrayList
                                        System.out.println("Updated BookingDetails:");
                                        displayJejaOrderDetails(jejaOrderList);
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    case 3 -> {
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    default -> {
                                        System.err.println("Invalid input, please try again");
                                        adminAcc(loginID, authenticatedAdmin);
                                    }
                                }
                            }

                            default -> {
                                System.err.println("Invalid selection, please try again");
                                adminAcc(loginID, authenticatedAdmin);
                            }
                        }
                    }

                    case 6 -> {
                        System.out.println("1. Remove Food");
                        System.out.println("2. Add Food");
                        System.out.println("3. Edit Food");
                        System.out.print("Enter selection: ");
                        int updateChoice = input.nextInt();
                        input.nextLine();

                        switch (updateChoice) {
                            case 1 -> {
                                displaySeafoodOrderDetails(seafoodOrderList);
                                //==================REMOVE BOOKING LIST(EVENT MONITORING)====================
                                System.out.print("Food to remove in numbers: ");
                                int indexToRemove = input.nextInt();
                                input.nextLine();

                                if (indexToRemove >= 0 && indexToRemove <= seafoodOrderList.size()) {
                                    seafoodOrderList.remove(indexToRemove - 1);
                                    System.out.println("Food removed successfully.");
                                    displaySeafoodOrderDetails(seafoodOrderList);
                                    adminAcc(loginID, authenticatedAdmin);
                                } else {
                                    System.err.println("Invalid index. No food removed.");
                                    adminAcc(loginID, authenticatedAdmin);
                                }
                            }

                            case 2 -> {
                                //==================ADD BOOKING LIST(EVENT MONITORING)====================
                                displaySeafoodOrderDetails(seafoodOrderList);

                                System.out.println("Add new Food");
                                System.out.print("Enter the food name: ");
                                String foodName = input.nextLine();

                                System.out.print("Enter the food price: ");
                                double price = input.nextDouble();
                                input.nextLine();

                                String boothType = "F & B";
                                String boothName = "Taste Bites";
                                // Create a BookingDetails object and add it to the ArrayList
                                Order order = new Order(boothType, boothName, foodName, price);
                                seafoodOrderList.add(order);

                                System.out.println("Food added successfully.");
                                displaySeafoodOrderDetails(seafoodOrderList);
                                adminAcc(loginID, authenticatedAdmin);
                            }

                            case 3 -> {
                                System.out.println("1. Edit Food Name");
                                System.out.println("2. Edit Food Price");
                                System.out.println("3. Exit");
                                System.out.print("Enter selection: ");
                                int editChoice = input.nextInt();
                                input.nextLine();

                                switch (editChoice) {
                                    case 1 -> {
                                        displaySeafoodOrderDetails(seafoodOrderList);
                                        // Prompt the user to choose an index to edit the price
                                        System.out.print("Enter the index of the Food to edit the name: ");
                                        int indexToEdit = input.nextInt();
                                        input.nextLine(); // Consume the newline character

                                        // Check if the index is valid
                                        if (indexToEdit >= 0 && indexToEdit <= seafoodOrderList.size()) {
                                            // Retrieve the BookingDetails object at the specified index

                                            Order order = seafoodOrderList.get(indexToEdit - 1);

                                            // Prompt the user for the new price
                                            System.out.print("Enter the new name: ");
                                            String newName = input.nextLine();

                                            // Update the price attribute of the BookingDetails object
                                            order.setFoodName(newName);

                                            System.out.println("Name of Food at index " + indexToEdit + " edited successfully.");
                                        } else {
                                            System.err.println("Invalid index. No Food name edited.");
                                        }

                                        // Display the updated BookingDetails in the ArrayList
                                        System.out.println("Updated Food:");
                                        displaySeafoodOrderDetails(seafoodOrderList);
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    case 2 -> {
                                        displaySeafoodOrderDetails(seafoodOrderList);
                                        // Prompt the user to choose an index to edit the price
                                        System.out.print("Enter the index of the Food to edit the price: ");
                                        int indexToEdit = input.nextInt();
                                        input.nextLine(); // Consume the newline character

                                        // Check if the index is valid
                                        if (indexToEdit >= 0 && indexToEdit <= seafoodOrderList.size()) {
                                            // Retrieve the BookingDetails object at the specified index

                                            Order order = seafoodOrderList.get(indexToEdit - 1);

                                            // Prompt the user for the new price
                                            System.out.print("Enter the new price: ");
                                            double newPrice = input.nextDouble();
                                            input.nextLine();

                                            // Update the price attribute of the BookingDetails object
                                            order.setFoodCost(newPrice);

                                            System.out.println("Price of Food at index " + indexToEdit + " edited successfully.");
                                        } else {
                                            System.err.println("Invalid index. No Food price edited.");
                                            adminAcc(loginID, authenticatedAdmin);
                                        }

                                        // Display the updated BookingDetails in the ArrayList
                                        System.out.println("Updated BookingDetails:");
                                        displaySeafoodOrderDetails(seafoodOrderList);
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    case 3 -> {
                                        adminAcc(loginID, authenticatedAdmin);
                                    }

                                    default -> {
                                        System.err.println("Invalid input, please try again");
                                        adminAcc(loginID, authenticatedAdmin);
                                    }
                                }
                            }

                            default -> {
                                System.err.println("Invalid selection, please try again");
                                adminAcc(loginID, authenticatedAdmin);
                            }
                        }
                    }

                    case 7 -> {
                        adminAcc(loginID, authenticatedAdmin);
                    }
                }
            }

            case 4 -> {
                System.out.println("1. Remove Event");
                System.out.println("2. Add Event");
                System.out.println("3. Edit Event");
                System.out.println("4. Exit");
                System.out.print("Enter selection: ");
                int eventChoice = input.nextInt();
                input.nextLine();

                switch (eventChoice) {

                    case 1 -> {
                        displayEventDetails(eventList);
                        //==================REMOVE BOOKING LIST(EVENT MONITORING)====================
                        System.out.print("Event to remove in numbers: ");
                        int indexToRemove = input.nextInt();
                        input.nextLine();

                        if (indexToRemove >= 0 && indexToRemove <= eventList.size()) {
                            eventList.remove(indexToRemove - 1);
                            System.out.println("Event removed successfully.");
                            displayEventDetails(eventList);
                            adminAcc(loginID, authenticatedAdmin);
                        } else {
                            System.err.println("Invalid index. No Event removed.");
                            adminAcc(loginID, authenticatedAdmin);
                        }
                    }

                    case 2 -> {
                        //==================ADD BOOKING LIST(EVENT MONITORING)====================
                        displayEventDetails(eventList);

                        System.out.println("Add new Event");
                        System.out.print("Enter the event name: ");
                        String name = input.nextLine();

                        System.out.print("Enter the month: ");
                        String month = input.nextLine();

                        System.out.print("Enter the location: ");
                        String location = input.nextLine();

                        System.out.print("Enter the address: ");
                        String address = input.nextLine();

                        // Create a BookingDetails object and add it to the ArrayList
                        Event event = new Event(name, month, location, address);
                        eventList.add(event);

                        System.out.println("Event added successfully.");
                        displayEventDetails(eventList);
                        adminAcc(loginID, authenticatedAdmin);
                    }

                    case 3 -> {
                        System.out.println("1. Edit Event Name");
                        System.out.println("2. Edit Event Location");
                        System.out.println("3. Edit Event Month");
                        System.out.println("4. Edit Event Address");
                        System.out.println("5. Exit");
                        System.out.print("Enter selection: ");
                        int editChoice = input.nextInt();
                        input.nextLine();

                        switch (editChoice) {
                            case 1 -> {
                                displayEventDetails(eventList);
                                // Prompt the user to choose an index to edit the price
                                System.out.print("Enter the index of the Event to edit the name: ");
                                int indexToEdit = input.nextInt();
                                input.nextLine(); // Consume the newline character

                                // Check if the index is valid
                                if (indexToEdit >= 0 && indexToEdit <= eventList.size()) {
                                    // Retrieve the BookingDetails object at the specified index

                                    Event event = eventList.get(indexToEdit - 1);

                                    // Prompt the user for the new price
                                    System.out.print("Enter the new name: ");
                                    String newName = input.nextLine();

                                    // Update the price attribute of the BookingDetails object
                                    event.setEventName(newName);

                                    System.out.println("Name of Event at index " + indexToEdit + " edited successfully.");
                                } else {
                                    System.err.println("Invalid index. No Event name edited.");
                                }

                                // Display the updated BookingDetails in the ArrayList
                                System.out.println("Updated Event:");
                                displayEventDetails(eventList);
                                adminAcc(loginID, authenticatedAdmin);
                            }

                            case 2 -> {
                                displayEventDetails(eventList);
                                // Prompt the user to choose an index to edit the price
                                System.out.print("Enter the index of the Event to edit the location: ");
                                int indexToEdit = input.nextInt();
                                input.nextLine(); // Consume the newline character

                                // Check if the index is valid
                                if (indexToEdit >= 0 && indexToEdit <= eventList.size()) {
                                    // Retrieve the BookingDetails object at the specified index

                                    Event event = eventList.get(indexToEdit - 1);

                                    // Prompt the user for the new price
                                    System.out.print("Enter the new location: ");
                                    String newLocation = input.nextLine();

                                    // Update the price attribute of the BookingDetails object
                                    event.setEventLocation(newLocation);

                                    System.out.println("Location of Event at index " + indexToEdit + " edited successfully.");
                                } else {
                                    System.err.println("Invalid index. No Event location edited.");
                                }

                                // Display the updated BookingDetails in the ArrayList
                                System.out.println("Updated Event:");
                                displayEventDetails(eventList);
                                adminAcc(loginID, authenticatedAdmin);
                            }

                            case 3 -> {
                                displayEventDetails(eventList);
                                // Prompt the user to choose an index to edit the price
                                System.out.print("Enter the index of the Event to edit the month: ");
                                int indexToEdit = input.nextInt();
                                input.nextLine(); // Consume the newline character

                                // Check if the index is valid
                                if (indexToEdit >= 0 && indexToEdit <= eventList.size()) {
                                    // Retrieve the BookingDetails object at the specified index

                                    Event event = eventList.get(indexToEdit - 1);

                                    // Prompt the user for the new price
                                    System.out.print("Enter the new month: ");
                                    String newMonth = input.nextLine();

                                    // Update the price attribute of the BookingDetails object
                                    event.setEventMonth(newMonth);

                                    System.out.println("Month of Event at index " + indexToEdit + " edited successfully.");
                                } else {
                                    System.err.println("Invalid index. No Event month edited.");
                                }

                                // Display the updated BookingDetails in the ArrayList
                                System.out.println("Updated Event:");
                                displayEventDetails(eventList);
                                adminAcc(loginID, authenticatedAdmin);
                            }

                            default -> {
                                System.err.println("Invalid input, please try again");
                                adminAcc(loginID, authenticatedAdmin);
                            }
                        }
                    }

                    case 4 -> {
                        displayEventDetails(eventList);
                        // Prompt the user to choose an index to edit the price
                        System.out.print("Enter the index of the Event to edit the address: ");
                        int indexToEdit = input.nextInt();
                        input.nextLine(); // Consume the newline character

                        // Check if the index is valid
                        if (indexToEdit >= 0 && indexToEdit <= eventList.size()) {
                            // Retrieve the BookingDetails object at the specified index

                            Event event = eventList.get(indexToEdit - 1);

                            // Prompt the user for the new price
                            System.out.print("Enter the new address: ");
                            String newAddress = input.nextLine();

                            // Update the price attribute of the BookingDetails object
                            event.setEventAddress(newAddress);

                            System.out.println("Address of Event at index " + indexToEdit + " edited successfully.");
                        } else {
                            System.err.println("Invalid index. No Event address edited.");
                        }

                        // Display the updated BookingDetails in the ArrayList
                        System.out.println("Updated Event:");
                        displayEventDetails(eventList);
                        adminAcc(loginID, authenticatedAdmin);
                    }

                    case 5 -> {
                        adminAcc(loginID, authenticatedAdmin);
                    }

                    default -> {
                        System.err.println("Invalid selection. Please try again");
                        adminAcc(loginID, authenticatedAdmin);
                    }
                }
            }

            case 5 -> {
                System.out.println("\n-----------------------------------");
                System.out.println("|                                 |");
                System.out.println("|     Total Donation Received     |");
                System.out.println("|                                 |");
                System.out.println("-----------------------------------");
                for (Donation donation : donationArr) {
                    System.out.println(donation); // Assuming Booking has a toString() method
                }
                adminAcc(loginID, authenticatedAdmin);
            }

            case 6 -> {
                System.out.println("Registered User");
                System.out.println("---------------");
                System.out.printf("%-10s %-20s %-20s\n",
                        "ID", "Name", "Email");
                for (User user : userDataArr) {
                    System.out.println(user); // Assuming Booking has a toString() method
                }
                adminAcc(loginID, authenticatedAdmin);
            }

            case 7 -> {
                loggedInUser = null;
                processMenu();
            }

            default -> {
                System.err.println("Invalid selection, please try again");
            }
        }
    }

    public void purchaseCoupon(String loginID, User authenticatedUser) {
        Scanner input = new Scanner(System.in);
        CouponPoint couponPoint = new CouponPoint();

        while (true) {
            System.out.println("\n-----------------------------------------------------");
            System.out.println("|                                                   |");
            System.out.println("|                  Purchase Coupon                  |");
            System.out.println("|                                                   |");
            System.out.println("|  1. RM 1 ->  1 Coupons     2. RM 5 ->  7 Coupons  |");
            System.out.println("|  3. RM10 -> 15 Coupons     4. RM15 -> 25 Coupons  |");
            System.out.println("|  5. RM30 -> 45 Coupons     6. RM50 -> 70 Coupons  |");
            System.out.println("|  7. Exit                                          |");
            System.out.println("|                                                   |");
            System.out.println("-----------------------------------------------------");
            System.out.print("Which package of coupon value would you like to buy: ");
            int selection = input.nextInt();
            input.nextLine();

            boolean continueBuying = true;
            switch (selection) {
                case 1 -> {
                    System.out.print("Enter the quantity you would like to buy for RM 1 package: ");
                    int p1 = input.nextInt();
                    input.nextLine();
                    couponPoint.addP1(p1);
                    while (continueBuying) {
                        System.out.print("Did you wish to buy more coupon? (Y/N): ");
                        String choice = input.nextLine();
                        if (choice.equalsIgnoreCase("Y")) {
                            continueBuying = false;
                        } else if (choice.equalsIgnoreCase("N")) {
                            System.out.print("Checkout for RM" + couponPoint.totalNeedPay() + ", are you confirm? (Y/N): ");
                            String confirmation = input.nextLine();
                            if (confirmation.equalsIgnoreCase("Y")) {
                                double pendingAmount = couponPoint.totalNeedPay();
                                double totalGain = couponPoint.totalCouponGain();
                                makePayment(loginID, authenticatedUser, pendingAmount, totalGain);
                            } else {
                                couponPoint = new CouponPoint(0, 0, 0, 0, 0, 0);
                            }
                            continueBuying = false;
                        } else {
                            System.err.println("Invalid input, please answer Y or N");
                        }
                    }
                }

                case 2 -> {
                    System.out.print("Enter the quantity you would like to buy for RM 5 package: ");
                    int p2 = input.nextInt();
                    input.nextLine();
                    couponPoint.addP2(p2);
                    while (continueBuying) {
                        System.out.print("Did you wish to buy more coupon? (Y/N): ");
                        String choice = input.nextLine();
                        if (choice.equalsIgnoreCase("Y")) {
                            continueBuying = false;
                        } else if (choice.equalsIgnoreCase("N")) {
                            System.out.print("Checkout for RM" + couponPoint.totalNeedPay() + ", are you confirm? (Y/N): ");
                            String confirmation = input.nextLine();
                            if (confirmation.equalsIgnoreCase("Y")) {
                                double pendingAmount = couponPoint.totalNeedPay();
                                double totalGain = couponPoint.totalCouponGain();
                                makePayment(loginID, authenticatedUser, pendingAmount, totalGain);
                            } else {
                                couponPoint = new CouponPoint(0, 0, 0, 0, 0, 0);
                            }
                            continueBuying = false;
                        } else {
                            System.err.println("Invalid input, please answer Y or N");
                        }
                    }
                }

                case 3 -> {
                    System.out.print("Enter the quantity you would like to buy for RM10 package: ");
                    int p3 = input.nextInt();
                    input.nextLine();
                    couponPoint.addP3(p3);
                    while (continueBuying) {
                        System.out.print("Did you wish to buy more coupon? (Y/N): ");
                        String choice = input.nextLine();
                        if (choice.equalsIgnoreCase("Y")) {
                            continueBuying = false;
                        } else if (choice.equalsIgnoreCase("N")) {
                            System.out.print("Checkout for RM" + couponPoint.totalNeedPay() + ", are you confirm? (Y/N): ");
                            String confirmation = input.nextLine();
                            if (confirmation.equalsIgnoreCase("Y")) {
                                double pendingAmount = couponPoint.totalNeedPay();
                                double totalGain = couponPoint.totalCouponGain();
                                makePayment(loginID, authenticatedUser, pendingAmount, totalGain);
                            } else {
                                couponPoint = new CouponPoint(0, 0, 0, 0, 0, 0);
                            }
                            continueBuying = false;
                        } else {
                            System.err.println("Invalid input, please answer Y or N");
                        }
                    }
                }

                case 4 -> {
                    System.out.print("Enter the quantity you would like to buy for RM15 package: ");
                    int p4 = input.nextInt();
                    input.nextLine();
                    couponPoint.addP4(p4);
                    while (continueBuying) {
                        System.out.print("Did you wish to buy more coupon? (Y/N): ");
                        String choice = input.nextLine();
                        if (choice.equalsIgnoreCase("Y")) {
                            continueBuying = false;
                        } else if (choice.equalsIgnoreCase("N")) {
                            System.out.print("Checkout for RM" + couponPoint.totalNeedPay() + ", are you confirm? (Y/N): ");
                            String confirmation = input.nextLine();
                            if (confirmation.equalsIgnoreCase("Y")) {
                                double pendingAmount = couponPoint.totalNeedPay();
                                double totalGain = couponPoint.totalCouponGain();
                                makePayment(loginID, authenticatedUser, pendingAmount, totalGain);
                            } else {
                                couponPoint = new CouponPoint(0, 0, 0, 0, 0, 0);
                            }
                            continueBuying = false;
                        } else {
                            System.err.println("Invalid input, please answer Y or N");
                        }
                    }
                }

                case 5 -> {
                    System.out.print("Enter the quantity you would like to buy for RM30 package: ");
                    int p5 = input.nextInt();
                    input.nextLine();
                    couponPoint.addP5(p5);
                    while (continueBuying) {
                        System.out.print("Did you wish to buy more coupon? (Y/N): ");
                        String choice = input.nextLine();
                        if (choice.equalsIgnoreCase("Y")) {
                            continueBuying = false;
                        } else if (choice.equalsIgnoreCase("N")) {
                            System.out.print("Checkout for RM" + couponPoint.totalNeedPay() + ", are you confirm? (Y/N): ");
                            String confirmation = input.nextLine();
                            if (confirmation.equalsIgnoreCase("Y")) {
                                double pendingAmount = couponPoint.totalNeedPay();
                                double totalGain = couponPoint.totalCouponGain();
                                makePayment(loginID, authenticatedUser, pendingAmount, totalGain);
                            } else {
                                couponPoint = new CouponPoint(0, 0, 0, 0, 0, 0);
                            }
                            continueBuying = false;
                        } else {
                            System.err.println("Invalid input, please answer Y or N");
                        }
                    }
                }

                case 6 -> {
                    System.out.print("Enter the quantity you would like to buy for RM50 package: ");
                    int p6 = input.nextInt();
                    input.nextLine();
                    couponPoint.addP6(p6);
                    while (continueBuying) {
                        System.out.print("Did you wish to buy more coupon? (Y/N): ");
                        String choice = input.nextLine();
                        if (choice.equalsIgnoreCase("Y")) {
                            continueBuying = false;
                        } else if (choice.equalsIgnoreCase("N")) {
                            System.out.print("Checkout for RM" + couponPoint.totalNeedPay() + ", are you confirm? (Y/N): ");
                            String confirmation = input.nextLine();
                            if (confirmation.equalsIgnoreCase("Y")) {
                                double pendingAmount = couponPoint.totalNeedPay();
                                double totalGain = couponPoint.totalCouponGain();
                                makePayment(loginID, authenticatedUser, pendingAmount, totalGain);
                            } else {
                                couponPoint = new CouponPoint(0, 0, 0, 0, 0, 0);
                            }
                            continueBuying = false;
                        } else {
                            System.err.println("Invalid input, please answer Y or N");
                        }
                    }
                }

                case 7 -> {
                    userAcc(loginID, authenticatedUser);
                }

                default -> {
                    System.err.println("Invalid selection, please try again");
                    purchaseCoupon(loginID, authenticatedUser);
                }
            }
        }
    }

    public void donation(String loginID, User authenticatedUser) {
        String organization;
        Scanner input = new Scanner(System.in);
        System.out.println("\n-----------------------------------------------------");
        System.out.println("|                                                   |");
        System.out.println("|               Donation For The Poor               |");
        System.out.println("|                                                   |");
        System.out.println("|  1. Orphanages             2. Homeless Shelters   |");
        System.out.println("|  3. Food Banks             4. Medical Charities   |");
        System.out.println("|  5. Education Programs     6. Animal Shelters     |");
        System.out.println("|  7. Eldery Care            0. Exit                |");
        System.out.println("|                                                   |");
        System.out.println("-----------------------------------------------------");
        System.out.print("Donate Amount (0 to exit): RM");
        double amount = input.nextDouble();
        input.nextLine();
        if (amount == 0) {
            userAcc(loginID, authenticatedUser);
        } else if (amount > 0) {
            CouponPoint couponPoint = new CouponPoint();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Select payment method (1 for Credit Card, 2 for E-Wallet): ");
            int paymentMethod = scanner.nextInt();
            scanner.nextLine();

            switch (paymentMethod) {
                case 1 -> {
                    System.out.print("Enter card number: ");
                    String cardNumber = scanner.nextLine();

                    if (cardNumber.length() == 16 && cardNumber.matches("[0-9]+")) {
                        System.out.print("Enter CVV code: ");
                        int CVV = scanner.nextInt();
                        scanner.nextLine();
                        if (CVV >= 100 && CVV <= 999) {
                            System.out.print("Choose the organizations to donate to: ");
                            int selection = input.nextInt();
                            input.nextLine();
                            switch (selection) {
                                case 1 -> {
                                    organization = "Orhpanages";
                                    Payment payment = new CreditCard(amount, cardNumber);
                                    userPayments.get(loginID).add(payment);
                                    User user = new User();
                                    user.addCouponBalance(loginID, amount);
                                    user.addPointBalance(loginID, amount);
                                    System.out.println("Donation to " + organization + " successfully, thanks for your donation!");
                                    Donation donation = new Donation(loginID, user.getName(loginID), organization, amount);
                                    donationArr.add(donation);
                                    System.out.println("Coupon added for " + loginID + ": " + amount + " coupons amount");
                                    donation(loginID, authenticatedUser);
                                }

                                case 2 -> {
                                    organization = "Homeless Shelters";
                                    Payment payment = new CreditCard(amount, cardNumber);
                                    userPayments.get(loginID).add(payment);
                                    User user = new User();
                                    user.addCouponBalance(loginID, amount);
                                    user.addPointBalance(loginID, amount);
                                    System.out.println("Donation to " + organization + " successfully, thanks for your donation!");
                                    Donation donation = new Donation(loginID, user.getName(loginID), organization, amount);
                                    donationArr.add(donation);
                                    System.out.println("Coupon added for " + loginID + ": " + amount + " coupons amount");
                                    donation(loginID, authenticatedUser);
                                }

                                case 3 -> {
                                    organization = "Food Banks";
                                    Payment payment = new CreditCard(amount, cardNumber);
                                    userPayments.get(loginID).add(payment);
                                    User user = new User();
                                    user.addCouponBalance(loginID, amount);
                                    user.addPointBalance(loginID, amount);
                                    System.out.println("Donation to " + organization + " successfully, thanks for your donation!");
                                    Donation donation = new Donation(loginID, user.getName(loginID), organization, amount);
                                    donationArr.add(donation);
                                    System.out.println("Coupon added for " + loginID + ": " + amount + " coupons amount");
                                    donation(loginID, authenticatedUser);
                                }

                                case 4 -> {
                                    organization = "Medical Charities";
                                    Payment payment = new CreditCard(amount, cardNumber);
                                    userPayments.get(loginID).add(payment);
                                    User user = new User();
                                    user.addCouponBalance(loginID, amount);
                                    user.addPointBalance(loginID, amount);
                                    System.out.println("Donation to " + organization + " successfully, thanks for your donation!");
                                    Donation donation = new Donation(loginID, user.getName(loginID), organization, amount);
                                    donationArr.add(donation);
                                    System.out.println("Coupon added for " + loginID + ": " + amount + " coupons amount");
                                    donation(loginID, authenticatedUser);
                                }

                                case 5 -> {
                                    organization = "Educational Programs";
                                    Payment payment = new CreditCard(amount, cardNumber);
                                    userPayments.get(loginID).add(payment);
                                    User user = new User();
                                    user.addCouponBalance(loginID, amount);
                                    user.addPointBalance(loginID, amount);
                                    System.out.println("Donation to " + organization + " successfully, thanks for your donation!");
                                    Donation donation = new Donation(loginID, user.getName(loginID), organization, amount);
                                    donationArr.add(donation);
                                    System.out.println("Coupon added for " + loginID + ": " + amount + " coupons amount");
                                    donation(loginID, authenticatedUser);
                                }

                                case 6 -> {
                                    organization = "Animal Shelters";
                                    Payment payment = new CreditCard(amount, cardNumber);
                                    userPayments.get(loginID).add(payment);
                                    User user = new User();
                                    user.addCouponBalance(loginID, amount);
                                    user.addPointBalance(loginID, amount);
                                    System.out.println("Donation to " + organization + " successfully, thanks for your donation!");
                                    Donation donation = new Donation(loginID, user.getName(loginID), organization, amount);
                                    donationArr.add(donation);
                                    System.out.println("Coupon added for " + loginID + ": " + amount + " coupons amount");
                                    donation(loginID, authenticatedUser);
                                }

                                case 7 -> {
                                    organization = "Eldery Care";
                                    Payment payment = new CreditCard(amount, cardNumber);
                                    userPayments.get(loginID).add(payment);
                                    User user = new User();
                                    user.addCouponBalance(loginID, amount);
                                    user.addPointBalance(loginID, amount);
                                    System.out.println("Donation to " + organization + " successfully, thanks for your donation!");
                                    Donation donation = new Donation(loginID, user.getName(loginID), organization, amount);
                                    donationArr.add(donation);
                                    System.out.println("Coupon added for " + loginID + ": " + amount + " coupons amount");
                                    donation(loginID, authenticatedUser);
                                }

                                case 8 -> {
                                    userAcc(loginID, authenticatedUser);
                                }

                                default -> {
                                    System.out.println("Invalid selection, please try again");
                                    donation(loginID, authenticatedUser);
                                }
                            }
                        } else {
                            System.out.println("Invalid CVV code, please try again");
                            donation(loginID, authenticatedUser);
                        }
                    } else {
                        System.out.println("Invalid card number, please enter a 16-digit numeric card number");
                        donation(loginID, authenticatedUser);
                    }

                }

                case 2 -> {
                    System.out.print("Enter E-Wallet ID (same as IC full name): ");
                    String eWalletId = scanner.nextLine();
                    if(eWalletId.equals(authenticatedUser.getName(loginID))){
                        System.out.print("Enter E-Wallet password (same as account password): ");
                        String eWalletPW = scanner.nextLine();
                        if (eWalletPW.equals(authenticatedUser.getPassword(loginID))) {
                            System.out.print("Choose the organizations to donate to: ");
                            int selection = input.nextInt();
                            input.nextLine();
                            switch (selection) {
                                case 1 -> {
                                    organization = "Orhpanages";
                                    Payment payment = new EWallet(amount, eWalletId);
                                    userPayments.get(loginID).add(payment);
                                    User user = new User();
                                    user.addCouponBalance(loginID, amount);
                                    user.addPointBalance(loginID, amount);
                                    System.out.println("Donation to " + organization + " successfully, thanks for your donation!");
                                    Donation donation = new Donation(loginID, user.getName(loginID), organization, amount);
                                    donationArr.add(donation);
                                    System.out.println("Coupon added for " + loginID + ": " + amount + " coupons amount");
                                    donation(loginID, authenticatedUser);
                                }

                                case 2 -> {
                                    organization = "Homeless Shelters";
                                    Payment payment = new EWallet(amount, eWalletId);
                                    userPayments.get(loginID).add(payment);
                                    User user = new User();
                                    user.addCouponBalance(loginID, amount);
                                    user.addPointBalance(loginID, amount);
                                    System.out.println("Donation to " + organization + " successfully, thanks for your donation!");
                                    Donation donation = new Donation(loginID, user.getName(loginID), organization, amount);
                                    donationArr.add(donation);
                                    System.out.println("Coupon added for " + loginID + ": " + amount + " coupons amount");
                                    donation(loginID, authenticatedUser);
                                }

                                case 3 -> {
                                    organization = "Food Banks";
                                    Payment payment = new EWallet(amount, eWalletId);
                                    userPayments.get(loginID).add(payment);
                                    User user = new User();
                                    user.addCouponBalance(loginID, amount);
                                    user.addPointBalance(loginID, amount);
                                    System.out.println("Donation to " + organization + " successfully, thanks for your donation!");
                                    Donation donation = new Donation(loginID, user.getName(loginID), organization, amount);
                                    donationArr.add(donation);
                                    System.out.println("Coupon added for " + loginID + ": " + amount + " coupons amount");
                                    donation(loginID, authenticatedUser);
                                }

                                case 4 -> {
                                    organization = "Medical Charities";
                                    Payment payment = new EWallet(amount, eWalletId);
                                    userPayments.get(loginID).add(payment);
                                    User user = new User();
                                    user.addCouponBalance(loginID, amount);
                                    user.addPointBalance(loginID, amount);
                                    System.out.println("Donation to " + organization + " successfully, thanks for your donation!");
                                    Donation donation = new Donation(loginID, user.getName(loginID), organization, amount);
                                    donationArr.add(donation);
                                    System.out.println("Coupon added for " + loginID + ": " + amount + " coupons amount");
                                    donation(loginID, authenticatedUser);
                                }

                                case 5 -> {
                                    organization = "Educational Programs";
                                    Payment payment = new EWallet(amount, eWalletId);
                                    userPayments.get(loginID).add(payment);
                                    User user = new User();
                                    user.addCouponBalance(loginID, amount);
                                    user.addPointBalance(loginID, amount);
                                    System.out.println("Donation to " + organization + " successfully, thanks for your donation!");
                                    Donation donation = new Donation(loginID, user.getName(loginID), organization, amount);
                                    donationArr.add(donation);
                                    System.out.println("Coupon added for " + loginID + ": " + amount + " coupons amount");
                                    donation(loginID, authenticatedUser);
                                }

                                case 6 -> {
                                    organization = "Animal Shelters";
                                    Payment payment = new EWallet(amount, eWalletId);
                                    userPayments.get(loginID).add(payment);
                                    User user = new User();
                                    user.addCouponBalance(loginID, amount);
                                    user.addPointBalance(loginID, amount);
                                    System.out.println("Donation to " + organization + " successfully, thanks for your donation!");
                                    Donation donation = new Donation(loginID, user.getName(loginID), organization, amount);
                                    donationArr.add(donation);
                                    System.out.println("Coupon added for " + loginID + ": " + amount + " coupons amount");
                                    donation(loginID, authenticatedUser);
                                }

                                case 7 -> {
                                    organization = "Eldery Care";
                                    Payment payment = new EWallet(amount, eWalletId);
                                    userPayments.get(loginID).add(payment);
                                    User user = new User();
                                    user.addCouponBalance(loginID, amount);
                                    user.addPointBalance(loginID, amount);
                                    System.out.println("Donation to " + organization + " successfully, thanks for your donation!");
                                    Donation donation = new Donation(loginID, user.getName(loginID), organization, amount);
                                    donationArr.add(donation);
                                    System.out.println("Coupon added for " + loginID + ": " + amount + " coupons amount");
                                    donation(loginID, authenticatedUser);
                                }

                                case 8 -> {
                                    userAcc(loginID, authenticatedUser);
                                }

                                default -> {
                                    System.out.println("Invalid selection, please try again");
                                    donation(loginID, authenticatedUser);
                                }
                            }

                            System.out.println("Donation successfully, thankls for your donation!");
                            System.out.println("Coupon added for " + loginID + ": " + amount + " coupons amount");
                        } else {
                            System.out.println("Invalid eWallet password, please enter a 6-digit numeric password");
                            donation(loginID, authenticatedUser);
                        }

                    }
                    else{
                        System.err.println("Invalid ID or password. Please try again");
                        donation(loginID, authenticatedUser);
                    }
                }

                default -> {
                    System.out.println("Invalid payment method.");
                    donation(loginID, authenticatedUser);
                }
            }
        }

    }

    public void redemption(String loginID, User authenticatedUser) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n-----------------------------------");
        System.out.println("|                                 |");
        System.out.println("|         Redemption Page         |");
        System.out.println("|                                 |");
        System.out.println("|  1. Smartphones (200 points)    |");
        System.out.println("|  2. Tablets (500 points)        |");
        System.out.println("|  3. Coffee Makers (700 points)  |");
        System.out.println("|  4. Blenders (100 points)       |");
        System.out.println("|  5. Gift Baskets (50 points)    |");
        System.out.println("|  6. Children Toys (20 points)   |");
        System.out.println("|  7. Spa Treatments (100 points) |");
        System.out.println("|  8. Exit                        |");
        System.out.println("|                                 |");
        System.out.println("-----------------------------------");
        System.out.println("Your current redemption points balance: " + authenticatedUser.getPointBalance(loginID));
        System.out.print("Enter your selection: ");
        int selection = input.nextInt();
        input.nextLine();

        switch (selection) {
            case 1 -> {
                if (authenticatedUser.getPointBalance(loginID) < 200) {
                    System.err.println("Insufficent redemption points, please redeem other prizes");
                    redemption(loginID, authenticatedUser);
                } else {
                    authenticatedUser.usePointBalance(loginID, 200);
                    System.out.println("Smartphone redeemed successfully! ");
                    System.out.println("Your current redemption points balance: " + authenticatedUser.getPointBalance(loginID));
                    redemption(loginID, authenticatedUser);
                }
            }

            case 2 -> {
                if (authenticatedUser.getPointBalance(loginID) < 500) {
                    System.err.println("Insufficent redemption points, please redeem other prizes");
                    redemption(loginID, authenticatedUser);
                } else {
                    authenticatedUser.usePointBalance(loginID, 500);
                    System.out.println("Tablet redeemed successfully! ");
                    System.out.println("Your current redemption points balance: " + authenticatedUser.getPointBalance(loginID));
                    redemption(loginID, authenticatedUser);
                }
            }

            case 3 -> {
                if (authenticatedUser.getPointBalance(loginID) < 700) {
                    System.err.println("Insufficent redemption points, please redeem other prizes");
                    redemption(loginID, authenticatedUser);
                } else {
                    authenticatedUser.usePointBalance(loginID, 700);
                    System.out.println("Coffee Maker redeemed successfully! ");
                    System.out.println("Your current redemption points balance: " + authenticatedUser.getPointBalance(loginID));
                    redemption(loginID, authenticatedUser);
                }
            }

            case 4 -> {
                if (authenticatedUser.getPointBalance(loginID) < 100) {
                    System.err.println("Insufficent redemption points, please redeem other prizes");
                    redemption(loginID, authenticatedUser);
                } else {
                    authenticatedUser.usePointBalance(loginID, 100);
                    System.out.println("Blender redeemed successfully! ");
                    System.out.println("Your current redemption points balance: " + authenticatedUser.getPointBalance(loginID));
                    redemption(loginID, authenticatedUser);
                }
            }

            case 5 -> {
                if (authenticatedUser.getPointBalance(loginID) < 50) {
                    System.err.println("Insufficent redemption points, please redeem other prizes");
                    redemption(loginID, authenticatedUser);
                } else {
                    authenticatedUser.usePointBalance(loginID, 50);
                    System.out.println("Gift Basket redeemed successfully! ");
                    System.out.println("Your current redemption points balance: " + authenticatedUser.getPointBalance(loginID));
                    redemption(loginID, authenticatedUser);
                }
            }

            case 6 -> {
                if (authenticatedUser.getPointBalance(loginID) < 20) {
                    System.err.println("Insufficent redemption points, please redeem other prizes");
                    redemption(loginID, authenticatedUser);
                } else {
                    authenticatedUser.usePointBalance(loginID, 20);
                    System.err.println("Children Toys redeemed successfully! ");
                    System.out.println("Your current redemption points balance: " + authenticatedUser.getPointBalance(loginID));
                    redemption(loginID, authenticatedUser);
                }
            }

            case 7 -> {
                if (authenticatedUser.getPointBalance(loginID) < 100) {
                    System.err.println("Insufficent redemption points, please redeem other prizes");
                    redemption(loginID, authenticatedUser);
                } else {
                    authenticatedUser.usePointBalance(loginID, 100);
                    System.out.println("Spa Treatment redeemed successfully! ");
                    System.out.println("Your current redemption points balance: " + authenticatedUser.getPointBalance(loginID));
                    redemption(loginID, authenticatedUser);
                }
            }

            case 8 -> {
                userAcc(loginID, authenticatedUser);
            }

            default -> {
                System.err.println("Invalid selection, please try again");
                redemption(loginID, authenticatedUser);
            }
        }
    }

    public static void displayBookingDetails(ArrayList<BookingDetails> bookingDetailsList) {
        System.out.println("\n-----------------------------------------------------------------------------");
        System.out.printf("%47s\n", "Booking Details");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-4s %-11s %-20s %-32s %-6s\n", "No.", "Booth Type", "Booth Name", "Theme", "Price");
        for (int i = 0; i < bookingDetailsList.size(); i++) {
            BookingDetails bookingDetail = bookingDetailsList.get(i);
            System.out.printf(
                    "[%2d] %-11s %-20s %-32s %-6.2f\n", (i + 1), bookingDetail.getBoothType(), bookingDetail.getBoothName(), bookingDetail.getTheme(), bookingDetail.getBoothCost());
        }
    }

    public void boothBooking(String loginID, User authenticatedUser) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n-----------------------------------------------");
        System.out.println("|                       |                     |");
        System.out.println("|     Booth Booking     |     Order Booth     |");
        System.out.println("|                       |                     |");
        System.out.println("|  1. Booth Booking     |  3. Menu            |");
        System.out.println("|  2. Booking Details   |  4. Order Details   |");
        System.out.println("|  5. Exit              |  5. Exit            |");
        System.out.println("|                       |                     |");
        System.out.println("-----------------------------------------------");
        System.out.print("Enter selection: ");
        int selection = input.nextInt();
        input.nextLine();

        switch (selection) {
            case 1 -> {
                String date = "0";
                boolean validDate = false;

                while (!validDate) {
                    System.out.print("Enter the booking date between 24/09/2023 - 07/10/2023 in dd/mm/yyyy (0 to exit): ");
                    date = input.nextLine();

                    if ("24/09/2023".equals(date) || "25/09/2023".equals(date) || "26/09/2023".equals(date)
                            || "27/09/2023".equals(date) || "28/09/2023".equals(date) || "29/09/2023".equals(date)
                            || "30/09/2023".equals(date) || "01/10/2023".equals(date) || "02/10/2023".equals(date)
                            || "03/10/2023".equals(date) || "04/10/2023".equals(date) || "05/10/2023".equals(date)
                            || "06/10/2023".equals(date) || "07/10/2023".equals(date)) {
                        System.out.println("Booking date valid");
                        validDate = true; // Set the flag to true to exit the loop
                    } else if ("0".equals(date)) {
                        boothBooking(loginID, authenticatedUser);
                    } else {
                        System.err.println("Invalid booking date.");
                        System.out.println("Please enter a valid date again:");
                    }
                }

                System.out.println("-----------------------");

                System.out.printf("%5s", "Game Time Slot\n");
                System.out.println("-----------------------");
                for (int i = 0; i < boothBookingList.size(); i++) {
                    BoothBooking boothBooking = boothBookingList.get(i);
                    System.out.printf("[%d] %s\n", (i + 1), boothBooking.getTime());
                }
                System.out.println("-----------------------");

                int inputTime = 0;
                while (true) {
                    try {
                        System.out.print("Book a time slot: ");
                        inputTime = Integer.parseInt(input.nextLine());
                        String stringInputTime = Integer.toString(inputTime);
                        BoothBooking inputTimeTest = new BoothBooking(stringInputTime);

                        if (inputTime > 0 && inputTime <= boothBookingList.size()) {
                            System.out.println("You have choosen your Booking date and time!");
                            break;
                        } else {
                            System.err.println("Invalid time slot index. Please choose a valid slot.");
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid input! Please enter a valid integer!");
                    }
                }
                displayBookingDetails(bookingDetailsList);

                System.out.print("Enter the game you want to book (0 to exit): ");
                int gameChoosen = input.nextInt();
                input.nextLine();

                if (gameChoosen > 0 && gameChoosen <= bookingDetailsList.size()) {
                    BookingDetails selectedGameBooking = bookingDetailsList.get(gameChoosen - 1);
                    int noOfPax = 0;
                    boolean validInput = false;
                    while (!validInput) {
                        try {
                            System.out.print("Enter the number of pax: ");
                            noOfPax = input.nextInt();
                            input.nextLine();
                            validInput = selectedGameBooking.setNumberOfPeople(noOfPax);

                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }

                    }
                    double subTotal = selectedGameBooking.calculateSubtotal();

                    BookingDetails bookingDetails = new BookingDetails(
                            selectedGameBooking.getBoothType(),
                            selectedGameBooking.getBoothName(),
                            selectedGameBooking.getTheme(),
                            selectedGameBooking.getBoothCost(),
                            noOfPax,
                            subTotal);

                    BoothBooking chosenTime = boothBookingList.get(inputTime - 1);
                    System.out.println("\nBooking Details:");
                    System.out.printf("%-11s %-11s %-18s %-11s %-20s %-32s %-6s %-4s %-10s\n",
                            "Booking No", "Date", "Time", "Booth Type", "Booth Name", "Theme", "Price", "Qty", "Total");
                    BoothBooking boothBooking = new BoothBooking(date, chosenTime.getTime(), bookingDetails);
                    Booking booking = new Booking(boothBooking);
                    System.out.println(booking);
                    System.out.print("Confirm Booking? (Y/N): ");
                    String answer = input.nextLine();
                    if (answer.equalsIgnoreCase("N")) {
                        boothBooking(loginID, authenticatedUser);
                    } else {
                        System.out.println("Number of Pax: " + selectedGameBooking.getNumberOfPeople());
                        System.out.println("Total: " + selectedGameBooking.calculateSubtotal());
                        System.out.println("Booking Payment (Pay by coupon)");
                        boothPayment(loginID, authenticatedUser, selectedGameBooking.calculateSubtotal(), booking);
                    }
                } else if (gameChoosen == 0) {
                    boothBooking(loginID, authenticatedUser);
                } else {
                    System.err.println("Invalid booking choice. No booking made.");
                    boothBooking(loginID, authenticatedUser);
                }

            }

            case 2 -> {
                ArrayList<Booking> userBookingArr = User.userBooking.getOrDefault(loginID, new ArrayList<>());
                if (userBookingArr.isEmpty()) {
                    System.out.println("No bookings found for this user.");
                } else {
                    System.out.println("Booking Details for User: " + authenticatedUser.getName());
                    System.out.printf("%-11s %-11s %-18s %-11s %-20s %-32s %-6s %-4s %-10s\n",
                            "Booking No", "Date", "Time", "Booth Type", "Booth Name", "Theme", "Price", "Qty", "Total");
                    for (int i = 0; i < userBookingArr.size(); i++) {
                        System.out.println(userBookingArr.get(i));
                    }
                }
                boothBooking(loginID, authenticatedUser);
            }

            case 3 -> {
                System.out.println("\n------------------------------------------------");
                System.out.println("|                                              |");
                System.out.println("|            Food & Bavegrage Booth            |");
                System.out.println("|                                              |");
                System.out.println("|  1. Taste Bites          2. Spicy Masters    |");
                System.out.println("|  3. Italian Delights     4. Oriental Eats    |");
                System.out.println("|  5. Jeja Eats            6. Seafood Heaven   |");
                System.out.println("|  7. Exit                                     |");
                System.out.println("|                                              |");
                System.out.println("------------------------------------------------");
                System.out.print("Enter selection: ");
                int foodBoothChoice = input.nextInt();
                input.nextLine();

                switch (foodBoothChoice) {
                    case 1 -> {
                        displayTastyOrderDetails(tasteOrderList);
                        System.out.print("Enter the food you want to order (0 to exit): ");
                        int foodChoosen = input.nextInt();
                        input.nextLine();
                        if (foodChoosen > 0 && foodChoosen <= tasteOrderList.size()) {
                            Order selectedTastyOrderList = tasteOrderList.get(foodChoosen - 1);
                            int quantity = 0;
                            boolean validInput = false;
                            while (!validInput) {
                                try {
                                    System.out.print("Enter quantity: ");
                                    quantity = input.nextInt();
                                    input.nextLine();
                                    validInput = selectedTastyOrderList.setQuantity(quantity);

                                } catch (Exception e) {
                                    System.err.println(e.getMessage());
                                }

                            }
                            double subTotal = selectedTastyOrderList.calculateSubtotal();

                            Order orderDetails = new Order(
                                    selectedTastyOrderList.getBoothType(),
                                    selectedTastyOrderList.getBoothName(),
                                    selectedTastyOrderList.getFoodName(),
                                    selectedTastyOrderList.getFoodCost(),
                                    quantity,
                                    subTotal);

                            System.out.printf("%-9s %-11s %-15s %-30s %-6s %-4s %-10s\n",
                                    "Order No", "Booth Type", "Booth Name", "Food and Beverage Name", "Price", "Qty", "Sub Total");
                            System.out.println(orderDetails);
                            System.out.print("Confirm Order? (Y/N): ");
                            String answer = input.nextLine();

                            if (answer.equalsIgnoreCase("N")) {
                                boothBooking(loginID, authenticatedUser);
                            } else {
                                System.out.println("Booth: " + selectedTastyOrderList.getBoothName());
                                System.out.println("Food Name: " + selectedTastyOrderList.getFoodName());
                                System.out.println("Total: " + selectedTastyOrderList.calculateSubtotal());
                                System.out.println("Booking Payment (Pay by coupon)");
                                orderPayment(loginID, authenticatedUser, subTotal, orderDetails);
                            }
                        } else if (foodChoosen == 0) {
                            boothBooking(loginID, authenticatedUser);
                        } else {
                            System.err.println("Invalid order choice. No order made.");
                            boothBooking(loginID, authenticatedUser);
                        }
                    }

                    case 2 -> {
                        displaySpicyOrderDetails(spicyOrderList);
                        System.out.print("Enter the food you want to order (0 to exit): ");
                        int foodChoosen = input.nextInt();
                        input.nextLine();
                        if (foodChoosen > 0 && foodChoosen <= spicyOrderList.size()) {
                            Order selectedSpicyOrderList = spicyOrderList.get(foodChoosen - 1);
                            int quantity = 0;
                            boolean validInput = false;
                            while (!validInput) {
                                try {
                                    System.out.print("Enter quantity: ");
                                    quantity = input.nextInt();
                                    input.nextLine();
                                    validInput = selectedSpicyOrderList.setQuantity(quantity);

                                } catch (Exception e) {
                                    System.err.println(e.getMessage());
                                }

                            }
                            double subTotal = selectedSpicyOrderList.calculateSubtotal();

                            Order orderDetails = new Order(
                                    selectedSpicyOrderList.getBoothType(),
                                    selectedSpicyOrderList.getBoothName(),
                                    selectedSpicyOrderList.getFoodName(),
                                    selectedSpicyOrderList.getFoodCost(),
                                    quantity,
                                    subTotal);

                            System.out.printf("%-9s %-11s %-15s %-30s %-6s %-4s %-10s\n",
                                    "Order No", "Booth Type", "Booth Name", "Food and Beverage Name", "Price", "Qty", "Sub Total");
                            System.out.println(orderDetails);
                            System.out.print("Confirm Order? (Y/N): ");
                            String answer = input.nextLine();

                            if (answer.equalsIgnoreCase("N")) {
                                boothBooking(loginID, authenticatedUser);
                            } else {
                                System.out.println("Booth: " + selectedSpicyOrderList.getBoothName());
                                System.out.println("Food Name: " + selectedSpicyOrderList.getFoodName());
                                System.out.println("Total: " + selectedSpicyOrderList.calculateSubtotal());
                                System.out.println("Booking Payment (Pay by coupon)");
                                orderPayment(loginID, authenticatedUser, subTotal, orderDetails);
                            }
                        } else if (foodChoosen == 0) {
                            boothBooking(loginID, authenticatedUser);
                        } else {
                            System.err.println("Invalid order choice. No order made.");
                            boothBooking(loginID, authenticatedUser);
                        }
                    }

                    case 3 -> {
                        displayItalianOrderDetails(italianOrderList);
                        System.out.print("Enter the food you want to order (0 to exit): ");
                        int foodChoosen = input.nextInt();
                        input.nextLine();
                        if (foodChoosen > 0 && foodChoosen <= italianOrderList.size()) {
                            Order selectedItalianOrderList = italianOrderList.get(foodChoosen - 1);
                            int quantity = 0;
                            boolean validInput = false;
                            while (!validInput) {
                                try {
                                    System.out.print("Enter quantity: ");
                                    quantity = input.nextInt();
                                    input.nextLine();
                                    validInput = selectedItalianOrderList.setQuantity(quantity);

                                } catch (Exception e) {
                                    System.err.println(e.getMessage());
                                }

                            }
                            double subTotal = selectedItalianOrderList.calculateSubtotal();

                            Order orderDetails = new Order(
                                    selectedItalianOrderList.getBoothType(),
                                    selectedItalianOrderList.getBoothName(),
                                    selectedItalianOrderList.getFoodName(),
                                    selectedItalianOrderList.getFoodCost(),
                                    quantity,
                                    subTotal);

                            System.out.printf("%-9s %-11s %-15s %-30s %-6s %-4s %-10s\n",
                                    "Order No", "Booth Type", "Booth Name", "Food and Beverage Name", "Price", "Qty", "Sub Total");
                            System.out.println(orderDetails);
                            System.out.print("Confirm Order? (Y/N): ");
                            String answer = input.nextLine();

                            if (answer.equalsIgnoreCase("N")) {
                                boothBooking(loginID, authenticatedUser);
                            } else {
                                System.out.println("Booth: " + selectedItalianOrderList.getBoothName());
                                System.out.println("Food Name: " + selectedItalianOrderList.getFoodName());
                                System.out.println("Total: " + selectedItalianOrderList.calculateSubtotal());
                                System.out.println("Booking Payment (Pay by coupon)");
                                orderPayment(loginID, authenticatedUser, subTotal, orderDetails);
                            }
                        } else if (foodChoosen == 0) {
                            boothBooking(loginID, authenticatedUser);
                        } else {
                            System.err.println("Invalid order choice. No order made.");
                        }
                    }

                    case 4 -> {
                        displayOrientalOrderDetails(orientalOrderList);
                        System.out.print("Enter the food you want to order (0 to exit): ");
                        int foodChoosen = input.nextInt();
                        input.nextLine();
                        if (foodChoosen > 0 && foodChoosen <= orientalOrderList.size()) {
                            Order selectedOrientalOrderList = orientalOrderList.get(foodChoosen - 1);
                            int quantity = 0;
                            boolean validInput = false;
                            while (!validInput) {
                                try {
                                    System.out.print("Enter quantity: ");
                                    quantity = input.nextInt();
                                    input.nextLine();
                                    validInput = selectedOrientalOrderList.setQuantity(quantity);

                                } catch (Exception e) {
                                    System.err.println(e.getMessage());
                                }

                            }
                            double subTotal = selectedOrientalOrderList.calculateSubtotal();

                            Order orderDetails = new Order(
                                    selectedOrientalOrderList.getBoothType(),
                                    selectedOrientalOrderList.getBoothName(),
                                    selectedOrientalOrderList.getFoodName(),
                                    selectedOrientalOrderList.getFoodCost(),
                                    quantity,
                                    subTotal);

                            System.out.printf("%-9s %-11s %-15s %-30s %-6s %-4s %-10s\n",
                                    "Order No", "Booth Type", "Booth Name", "Food and Beverage Name", "Price", "Qty", "Sub Total");
                            System.out.println(orderDetails);
                            System.out.print("Confirm Order? (Y/N): ");
                            String answer = input.nextLine();

                            if (answer.equalsIgnoreCase("N")) {
                                boothBooking(loginID, authenticatedUser);
                            } else {
                                System.out.println("Booth: " + selectedOrientalOrderList.getBoothName());
                                System.out.println("Food Name: " + selectedOrientalOrderList.getFoodName());
                                System.out.println("Total: " + selectedOrientalOrderList.calculateSubtotal());
                                System.out.println("Booking Payment (Pay by coupon)");
                                orderPayment(loginID, authenticatedUser, subTotal, orderDetails);
                            }
                        } else if (foodChoosen == 0) {
                            boothBooking(loginID, authenticatedUser);
                        } else {
                            System.err.println("Invalid order choice. No order made.");
                        }
                    }

                    case 5 -> {
                        displayJejaOrderDetails(jejaOrderList);
                        System.out.print("Enter the food you want to order (0 to exit): ");
                        int foodChoosen = input.nextInt();
                        input.nextLine();
                        if (foodChoosen > 0 && foodChoosen <= jejaOrderList.size()) {
                            Order selectedJejaOrderList = jejaOrderList.get(foodChoosen - 1);
                            int quantity = 0;
                            boolean validInput = false;
                            while (!validInput) {
                                try {
                                    System.out.print("Enter quantity: ");
                                    quantity = input.nextInt();
                                    input.nextLine();
                                    validInput = selectedJejaOrderList.setQuantity(quantity);

                                } catch (Exception e) {
                                    System.err.println(e.getMessage());
                                }

                            }
                            double subTotal = selectedJejaOrderList.calculateSubtotal();

                            Order orderDetails = new Order(
                                    selectedJejaOrderList.getBoothType(),
                                    selectedJejaOrderList.getBoothName(),
                                    selectedJejaOrderList.getFoodName(),
                                    selectedJejaOrderList.getFoodCost(),
                                    quantity,
                                    subTotal);

                            System.out.printf("%-9s %-11s %-15s %-30s %-6s %-4s %-10s\n",
                                    "Order No", "Booth Type", "Booth Name", "Food and Beverage Name", "Price", "Qty", "Sub Total");
                            System.out.println(orderDetails);
                            System.out.print("Confirm Order? (Y/N): ");
                            String answer = input.nextLine();

                            if (answer.equalsIgnoreCase("N")) {
                                boothBooking(loginID, authenticatedUser);
                            } else {
                                System.out.println("Booth: " + selectedJejaOrderList.getBoothName());
                                System.out.println("Food Name: " + selectedJejaOrderList.getFoodName());
                                System.out.println("Total: " + selectedJejaOrderList.calculateSubtotal());
                                System.out.println("Booking Payment (Pay by coupon)");
                                orderPayment(loginID, authenticatedUser, subTotal, orderDetails);
                            }
                        } else if (foodChoosen == 0) {
                            boothBooking(loginID, authenticatedUser);
                        } else {
                            System.err.println("Invalid order choice. No order made.");
                        }
                    }

                    case 6 -> {
                        displaySeafoodOrderDetails(seafoodOrderList);
                        System.out.print("Enter the food you want to order (0 to exit): ");
                        int foodChoosen = input.nextInt();
                        input.nextLine();
                        if (foodChoosen > 0 && foodChoosen <= seafoodOrderList.size()) {
                            Order selectedSeafoodOrderList = seafoodOrderList.get(foodChoosen - 1);
                            int quantity = 0;
                            boolean validInput = false;
                            while (!validInput) {
                                try {
                                    System.out.print("Enter quantity: ");
                                    quantity = input.nextInt();
                                    input.nextLine();
                                    validInput = selectedSeafoodOrderList.setQuantity(quantity);

                                } catch (Exception e) {
                                    System.err.println(e.getMessage());
                                }

                            }
                            double subTotal = selectedSeafoodOrderList.calculateSubtotal();

                            Order orderDetails = new Order(
                                    selectedSeafoodOrderList.getBoothType(),
                                    selectedSeafoodOrderList.getBoothName(),
                                    selectedSeafoodOrderList.getFoodName(),
                                    selectedSeafoodOrderList.getFoodCost(),
                                    quantity,
                                    subTotal);

                            System.out.printf("%-9s %-11s %-15s %-30s %-6s %-4s %-10s\n",
                                    "Order No", "Booth Type", "Booth Name", "Food and Beverage Name", "Price", "Qty", "Sub Total");
                            System.out.println(orderDetails);
                            System.out.print("Confirm Order? (Y/N): ");
                            String answer = input.nextLine();

                            if (answer.equalsIgnoreCase("N")) {
                                boothBooking(loginID, authenticatedUser);
                            } else {
                                System.out.println("Booth: " + selectedSeafoodOrderList.getBoothName());
                                System.out.println("Food Name: " + selectedSeafoodOrderList.getFoodName());
                                System.out.println("Total: " + selectedSeafoodOrderList.calculateSubtotal());
                                System.out.println("Booking Payment (Pay by coupon)");
                                orderPayment(loginID, authenticatedUser, subTotal, orderDetails);
                            }
                        } else if (foodChoosen == 0) {
                            boothBooking(loginID, authenticatedUser);
                        } else {
                            System.err.println("Invalid order choice. No order made.");
                        }
                    }

                    case 7 -> {
                        boothBooking(loginID, authenticatedUser);
                    }
                }
            }

            case 4 -> {
                ArrayList<Order> userOrderArr = User.userOrder.getOrDefault(loginID, new ArrayList<>());
                if (userOrderArr.isEmpty()) {
                    System.out.println("No orders found for this user.");
                } else {
                    System.out.println("Order Details for User: " + authenticatedUser.getName());
                    System.out.printf("%-9s %-11s %-15s %-30s %-6s %-4s %-10s\n",
                            "Order No", "Booth Type", "Booth Name", "Food and Beverage Name", "Price", "Qty", "Sub Total");
                    for (int i = 0; i < userOrderArr.size(); i++) {
                        System.out.println(userOrderArr.get(i));
                    }
                }
                boothBooking(loginID, authenticatedUser);
            }

            case 5 -> {
                userAcc(loginID, authenticatedUser);
            }

            default -> {
                System.err.println("Invalid selection, please try again");
                boothBooking(loginID, authenticatedUser);
            }
        }
    }

    public void userAcc(String loginID, User authenticatedUser) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n---------------------");
        System.out.println("|                   |");
        System.out.println("|     User Menu     |");
        System.out.println("|                   |");
        System.out.println("---------------------");
        System.out.println("Welcome " + authenticatedUser.getName(loginID));
        System.out.println("Your current coupon balance = " + authenticatedUser.getCouponBalance(loginID)); // balance function
        System.out.println("Your current redemption point = " + authenticatedUser.getPointBalance(loginID)); // redemption point balance function
        System.out.println("Do you wish to: ");
        System.out.println("1. Purchase Coupon");
        System.out.println("2. Donate For The Poor");
        System.out.println("3. Visit Our Booth");
        System.out.println("4. Redempt Your Point");
        System.out.println("5. Upcoming Fundraising & Charity Event");
        System.out.println("6. Sign Out");
        System.out.print("Enter your selection: ");
        int selection = input.nextInt();

        switch (selection) {
            case 1 -> {
                purchaseCoupon(loginID, authenticatedUser);
            }

            case 2 -> {
                donation(loginID, authenticatedUser);
            }

            case 3 -> {
                boothBooking(loginID, authenticatedUser);
            }

            case 4 -> {
                redemption(loginID, authenticatedUser);
            }

            case 5 -> {
                displayEventDetails(eventList);
                userAcc(loginID, authenticatedUser);
            }

            case 6 -> {
                loggedInUser = null;
                System.out.println("You have been signed out");
                processMenu();
            }

            default -> {
                System.err.println("Invalid selection, please try again");
                userAcc(loginID, authenticatedUser);
            }
        }

    }

    public void processMenu() {

        Scanner input = new Scanner(System.in);
        System.out.println("\n------------------------------------------");
        System.out.println("|                                        |");
        System.out.println("|     Welcome to JLAB Fund & Charity     |");
        System.out.println("|                                        |");
        System.out.println("------------------------------------------");
        System.out.println("1. Sign Up \n2. Log In \n3. Exit");
        System.out.print("Enter your selection: ");
        int selection = input.nextInt();
        input.nextLine();

        switch (selection) {
            case 1 -> {
                System.out.print("Enter your ID: ");
                String ID = input.nextLine();

                System.out.print("Enter your password: ");
                String password = input.nextLine();

                System.out.print("Enter your name: ");
                String name = input.nextLine();
                if (name.matches("[0-9]+")) {
                    System.err.println("Invalid input, name only contain apphabet");
                    processMenu();
                }
                System.out.print("Enter your email: ");
                String email = input.nextLine();

                try {
                    User user = new User(ID, password, name, email, 0, 0);
                    User userData = new User(ID, name, email);
                    userPayments.put(ID, new ArrayList<>());
                    userDataArr.add(userData);
                    loggedInUser = ID;
                    System.out.println("Account created successfully. You can now login");
                    processMenu();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage());
                    processMenu();
                }

            }

            case 2 -> {
                System.out.print("Enter your ID: ");
                String loginID = input.nextLine();

                System.out.print("Enter your password: ");
                String loginPassword = input.nextLine();

                Admin authenticatedAdmin = Admin.authenticate(loginID, loginPassword);

                if (authenticatedAdmin != null) {
                    loggedInUser = loginID;
                    adminAcc(loginID, authenticatedAdmin);
                } else {
                    User authenticatedUser = User.authenticate(loginID, loginPassword);
                    if (authenticatedUser != null) {
                        loggedInUser = loginID;
                        userAcc(loginID, authenticatedUser);
                    } else {
                        System.err.println("Invalid ID or password");
                        processMenu();
                    }
                }
            }

            case 3 -> {
                loggedInUser = null;
                System.out.println("Exiting the program");
                System.exit(0);
            }

            default -> {
                System.err.println("Invalid selection, please try again");
                processMenu();
            }
        }
    }

    public main() {
        initialize();
        processMenu();
    }

    public static void main(String[] args) {
        new main();
    }

}
