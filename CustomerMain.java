public class CustomerMain {
    public static void main(String[] args) {
        Customer c[] = new Customer[5];
        c[0] = new Customer(1,"Satyajit", "BBN", 1234567890, 123, "Saving");
        c[1] = new Customer(2,"Debasis", "Dasapalla", 533476367, 987, "Saving");
        c[2] = new Customer(3, "Priayaranjan", "Nayagarh", 434794434, 847, "Current");
        c[3] = new Customer(4, "Satyajit", "Chandikhol", 256512737, 453, "Saving");
        c[4] = new Customer(5, "Shakti", "Bariada", 684368648, 432, "Current");

        System.out.println(CustomerUtil.customerExistence(c, "Satyajit"));

        System.out.println(CustomerUtil.getCountOfAccount(c, "Satyajit"));

        int[] accountss = CustomerUtil.getAccounts(c, "Satyajit");
        for (int i = 0; i < accountss.length; i++) {
            if(accountss[i]!= 0){
                System.out.println(accountss[i]);
            }
        }
        
    }
}
