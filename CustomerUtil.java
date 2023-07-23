class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private int contactNumber;
    private int accountNumber;
    private String accountType;

    public Customer(int customerId,String customerName, String customerAddress, int contactNumber, int accountNumber,
            String accountType) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.contactNumber = contactNumber;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return this.customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

}

public class CustomerUtil {
    public static boolean customerExistence(Customer[] c, String name) {
        boolean exist = false;
        for (int i = 0; i < c.length; i++) {
            if (c[i].getCustomerName().equals(name)) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    public static int getCountOfAccount(Customer c[], String name) {
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i].getCustomerName().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int updateCustomerId(Customer c[], int customerId, int newId) {
        for (int i = 0; i < c.length; i++) {
            if (c[i].getCustomerId() == customerId) {
                c[i].setCustomerId(newId);
                return 1;
            }
        }
        return 0;
    }

    public static int[] getAccounts(Customer c[], String name){
        int accountArray[] = new int[10];
        int k = 0;
        for (int i = 0; i < c.length; i++) {
            if(c[i].getCustomerName().equals(name)){
                accountArray[k++] = c[i].getAccountNumber();
            }
        }
        return accountArray;
    }
}