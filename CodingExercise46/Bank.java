import java.util.*;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;
    
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }
    
    public boolean addBranch(String name) {
        Branch branch = findBranch(name);
        if (branch == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }
    
    public boolean addCustomer(String bName, String cName, double initial) {
        Branch branch = findBranch(bName);
        if (branch != null) {
            return branch.newCustomer(cName, initial);
        }
        return false;
    }
    
    public boolean addCustomerTransaction(String bName, String cName, double transaction) {
        Branch branch = findBranch(bName);
        if (branch != null) {
            return branch.addCustomerTransaction(cName, transaction);
        }
        return false;
    }
    
    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }
    
    public boolean listCustomers(String bName, boolean printT) {
        Branch branch = findBranch(bName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> customers = branch.getCustomers();
            for (int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i+1) + "]");
                if (printT) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
