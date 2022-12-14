package main;

import data.Customer;

/*Create a class called Customer, which holds the data about customer, this will hold name, address, email,
        mobile and premium membership(yes/ no).
        This class must be properly encapsulated as well as will contain two constructor.

        This class must contain a method called displayCustomer(), which will display customer information.

        Write an implementation, create object1 by calling parameterized constructor, create second object
        by calling no- arguments constructor, display them and change there references means
        object1 should display object2 values and object2 will display object1 values.*/

public class CustomerImpl {

    public static void main(String[] args) {

        Customer object1 = new Customer("Monali", "Pune", "mona153@gmail.com", 9152432649L, true);

        System.out.println("Display details by calling parameterized constructor");
        object1.displayCustomer();

        System.out.println();

        Customer object2 = new Customer();
        System.out.println("Display details by calling no-argument constructor");

        object2.displayCustomer();

        Customer temp = object1;
        object1 = object2;
        object2 = temp;

        System.out.println("\nobject1 display object2 values");

        object1.displayCustomer();


        System.out.println("\nobject2 display object1 values");
        object2.displayCustomer();

    }
}
