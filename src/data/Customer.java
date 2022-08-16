package data;

public class Customer {

    private String name;
    private String address;
    private String email;
    private long mobileNo;
    private boolean isPremiumMember;

    Customer() {
        String name = null;
        String address = null;
        String email = null;
        long mobileNo = 0;
        boolean isPremiumMember = false;
    }

    Customer(String name, String address, String email, long mobileNo, boolean isPremiumMember) {

        this.name = name;
        this.address = address;
        this.email = email;
        this.mobileNo = mobileNo;
        this.isPremiumMember = isPremiumMember;
    }

    public void displayCustomer() {

        System.out.println("name = " + name);
        System.out.println("address = " + address);
        System.out.println("email = " + email);
        System.out.println("mobileNo = " + mobileNo);
        System.out.println("isPremiumMember = " + isPremiumMember);
    }


}
