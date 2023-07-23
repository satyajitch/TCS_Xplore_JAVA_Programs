import java.util.Scanner;

public class Myclass1 {
    public static void main(String[] args) {
        Laptop[] l = new Laptop[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < l.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            String osType = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            int rating = sc.nextInt();
            sc.nextLine();
            l[i] = new Laptop(id, brand, osType, price, rating);
        }
        String uBrand = sc.nextLine();
        String uOs = sc.nextLine();
        int result1 = countOfLaptopByBrand(l, uBrand);
        Laptop[] result2 = searchLaptopByOsType(l, uOs);
        if (result1 > 0) {
            System.out.println(result1);
        } else {
            System.out.println("The given brand is not available");
        }
        if (result2 == null) {
            System.out.println("The given os is not available");
        } else {
            for (int i = 0; i < result2.length; i++) {
                System.out.println(result2[i].getLaptopId());
                System.out.println(result2[i].getRating());
            }
        }
    }

    static int countOfLaptopByBrand(Laptop[] laptop, String brand) {
        int count = 0;
        for (Laptop l : laptop) {
            if (l.getBrand().equalsIgnoreCase(brand)) {
                count++;
            }
        }
        return count;
    }

    static Laptop[] searchLaptopByOsType(Laptop[] laptop, String osType) {
        int count = 0;
        Laptop[] result = null;
        for (Laptop l : laptop) {
            if (l.getOsType().equalsIgnoreCase(osType)) {
                count++;
            }
        }
        if (count == 0) {
            return result;
        }
        result = new Laptop[count];
        int count1 = 0;
        for (Laptop l : laptop) {
            if (l.getOsType().equalsIgnoreCase(osType)) {
                result[count1++] = l;
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i].getLaptopId() < result[j].getLaptopId()) {
                    Laptop temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
}

class Laptop {
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int id) {
        this.laptopId = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int r) {
        this.rating = r;
    }

    public Laptop(int id, String brand, String osType, double price, int rating) {
        this.laptopId = id;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }
}