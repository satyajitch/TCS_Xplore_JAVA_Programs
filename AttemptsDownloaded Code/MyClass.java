import java.util.*;

class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Player[] p = new Player[4];
        for (int i = 0; i < p.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int runs = sc.nextInt();
            sc.nextLine();
            String ptype = sc.nextLine();
            String mtype = sc.nextLine();
            p[i] = new Player(id, name, runs, ptype, mtype);
        }
        String uptype = sc.nextLine();
        String umtype = sc.nextLine();
        int result1 = fplr(p, uptype);
        Player[] result2 = fpmt(p, umtype);
        if (result1 == 0) {
            System.out.println("No such player");
        } else {
            System.out.println(result1);
        }
        if (result2 == null) {
            System.out.println("No Player with given matchType");
        } else {
            for (int i = 0; i < result2.length; i++) {
                System.out.println(result2[i].getId());
            }
        }
    }

    static int fplr(Player[] player, String uptype) {
        int lowest = Integer.MAX_VALUE;
        int count = 0;
        for (Player p : player) {
            if (p.getPtype().equalsIgnoreCase(uptype)) {
                if (lowest > p.getRuns()) {
                    count++;
                    lowest = p.getRuns();
                }
            }
        }
        if (count == 0) {
            return 0;
        }
        return lowest;
    }

    static Player[] fpmt(Player[] player, String umtype) {
        Player[] result = new Player[0];
        int count = 0;
        for (Player p : player) {
            if (p.getMtype().equalsIgnoreCase(umtype)) {
                count++;
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = p;
            }
        }
        if (count == 0) {
            return null;
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i].getId() < result[j].getId()) {
                    Player temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
}

class Player {
    private int id;
    private String name;
    private int runs;
    private String ptype;
    private String mtype;

    public Player(int id, String name, int runs, String ptype, String mtype) {
        this.id = id;
        this.name = name;
        this.runs = runs;
        this.ptype = ptype;
        this.mtype = mtype;
    }

    public int getId() {
        return id;
    }

    public int getRuns() {
        return runs;
    }

    public String getPtype() {
        return ptype;
    }

    public String getMtype() {
        return mtype;
    }
}
