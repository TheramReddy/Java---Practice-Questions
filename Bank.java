package AutoBoxingandUnboxing.Challange;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    //whether the branch exists
    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    //add the customer transactions
    //if the branch name is not found return null;
    //if not exists add the new customer name , and the intial amount;
    //branch.newCustomer()(customerName , intial amount);
    public boolean addCustomer(String branchName , String customerName , double intialAmount){
        Branch branch = new Branch(branchName);
        if(branch == null){
            return  branch.newCustomer(customerName, intialAmount);
        }
        return false;
    }
    //add customer transactions--> branch name , customer name , amount
    //if the branch is not found return null;
    //if not return the add customer name ; and the amount
    //
    public boolean addCustomerTransaction(String branchName , String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName , amount);
        }
        return false;
    }
    //find branch
    //checking to see whether theres a match with the branch name//return null if not
    //
    private Branch findBranch(String branchName){
        for(int i = 0 ; i<this.branches.size(); i++){
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName,boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch == null) {
            System.out.println("Customer detail;s for branch " +branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i = 0 ; i<branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer : "+branchCustomer.getName()+"["+i+"]");
                if(showTransactions){
                    System.out.println("Transactions");

                    }
                }
            }
            return true;
        }

    }


