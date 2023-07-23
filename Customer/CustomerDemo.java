package Customer;

public class CustomerDemo {

    public static int searchCustomerById(Customer[] cust, int id) {
		int count = 0;
		for(Customer c: cust) {
			count++;
			if(c.getId() == id) {
				return count;
			}
		}
		return -1;
	}

    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Satyajit", "06th Jan, 2002", 1000000, "satyajitchinara8@gmail.com", 20);
        Customer c2 = new Customer(2, "Debasis", "13th May, 2002", 1000000, "Debasis@gmail.com", 20);
        Customer c3 = new Customer(3, "Priyaranjan", "26th Sept, 2002", 900000, "Priyaranjan@gmail.com", 20);
        Customer c4 = new Customer(4, "Subhankar", "02nd Feb, 2002", 800000, "Subhankar@gmail.com", 20);
        Customer c5 = new Customer(5, "Pritam", "20th Dec, 2002", 1100000, "Pritam@gmail.com", 20);

        Customer[] c = {c1, c2, c3, c4, c5};
        int pos = searchCustomerById(c, 3);
        System.out.println("Element found at "+pos);
    }
    
}
