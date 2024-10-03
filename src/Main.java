public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(c1.toString());

        c1.setDiscount(8);
        System.out.println(c1.toString());
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("discount is: " + c1.getDiscount());

        Invoice inv1 = new Invoice(101, c1, 888.8);

        inv1.setAmount(999.9);
        System.out.println(inv1.toString());
        System.out.println(" is: " + inv1);
        System.out.println("customer is: " + inv1.getCustomer());
        System.out.println("amount is: " + inv1.getAmount());
        System.out.println(inv1.getCustomerId());
        System.out.println(inv1.getCustomerName());
        System.out.println(inv1.getCustomerDiscount());
        System.out.println("amount after paying is: " + inv1.getAmountAfterDiscount());
    }
}