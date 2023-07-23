import java.util.*;

class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Hotel[] h = new Hotel[4];
        for (int i = 0; i < h.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String dob = sc.nextLine();
            int nob = sc.nextInt();
            sc.nextLine();
            String wf = sc.nextLine();
            double tb = sc.nextDouble();
            sc.nextLine();
            h[i] = new Hotel(id, name, dob, nob, wf, tb);
        }
        String month = sc.nextLine();
        String uwf = sc.nextLine();
        int result = norbgm(h, month);
        Hotel result2 = shbwo(h, uwf);
        if (result == 0) {
            System.out.println("No rooms booked in the given month");
        } else {
            System.out.println(result);
        }
        if (result2 == null) {
            System.out.println("No such option available");
        } else {
            System.out.println(result2.getHId());
        }
    }

    static int norbgm(Hotel[] hotel, String month) {
        int count = 0;
        for (Hotel h : hotel) {
            if (h.getDob().contains(month)) {
                count = count + h.getNob();
            }
        }
        return count;
    }

    static Hotel shbwo(Hotel[] hotel, String uwf) {
        int count = 0;
        Hotel[] result = new Hotel[0];
        for (Hotel h : hotel) {
            if (h.getWf().equalsIgnoreCase(uwf)) {
                count++;
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = h;
            }
        }
        if (count == 0) {
            return null;
        } else if (count == 1) {
            return result[0];
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i].getTb() < result[j].getTb()) {
                    Hotel t = result[i];
                    result[i] = result[j];
                    result[j] = t;
                }
            }
        }
        return result[1];
    }
}

class Hotel {
    private int hId;
    private String hName;
    private String dob;
    private int nob;
    private String wf;
    private double tb;

    public String getDob() {
        return dob;
    }

    public int getNob() {
        return nob;
    }

    public String getWf() {
        return wf;
    }

    public int getHId() {
        return hId;
    }

    public double getTb() {
        return tb;
    }

    public Hotel(int id, String name, String dob, int nob, String wf, double tb) {
        this.hId = id;
        this.hName = name;
        this.dob = dob;
        this.nob = nob;
        this.wf = wf;
        this.tb = tb;
    }
}