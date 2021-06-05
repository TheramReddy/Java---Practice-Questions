package AutoBoxingandUnboxing.Challange;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }
    //add the customer name and return false if the name is not already exists
    public boolean newCustomer(String customerName , double intialAmount){
        if(findCustomer(customerName)==null){
            this.customers.add(new Customer(customerName, intialAmount));
            return true;
        }
        return false;
    }
    //add transactions for the new customer
    //if the name already exists return the record of the customer
    //add the transaction amount to the new customer if the computer already exists.
    public boolean addCustomerTransaction(String customerName , double amount){

        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
    //add the find customer class
    //return the customer and fins the customer name if already exists
    //.size() --> to get through all the record size;
    //and return null if it's false.
    //if a match s there return the customer name
    //
    private Customer findCustomer(String customerName){
        for(int i=0; i<this.customers.size();i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return this.customers.get(i);
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
