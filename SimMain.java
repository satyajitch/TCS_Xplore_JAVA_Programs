import java.util.Arrays;
import java.util.Scanner;

public class SimMain {

	public static void main(String[] args) {
		Sim[] s = new Sim[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double rate = sc.nextDouble();
			sc.nextLine();
			String circle = sc.nextLine();
			s[i] = new Sim(id, name, rate, circle);
		}
		// for (Sim r : s) {
		// 	System.out.println(r.getId() + " " + r.getName() + " " + r.getCircle());
		// }
		String iCircle = sc.nextLine();
		double rate = sc.nextDouble();
		sc.nextLine();
		Sim[] result1 = SimMain.getResult(s, iCircle, rate);
		for (Sim r : result1) {
			System.out.println(r.getId() + " " + r.getName() + " " + r.getCircle());
		}
	}

	public static Sim[] getResult(Sim[] sim, String circle, double rate) {
		int count = 0;
		for (Sim s : sim) {
			if (s.getCircle().equalsIgnoreCase(circle) && s.getRate() > rate) {
				count++;
			}
		}

		Sim result[] = new Sim[count];
		int count1 = 0;
		for (Sim s : sim) {
			if (s.getCircle().equalsIgnoreCase(circle) && s.getRate() > rate) {
				result[count1] = s;
				count1++;
			}
		}
		Arrays.sort(result);
		return result;
	}

}

class Sim implements Comparable<Sim> {
	private int id;
	private String name;
	private double rate;
	private String circle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public Sim(int id, String name, double rate, String circle) {
		super();
		this.id = id;
		this.name = name;
		this.rate = rate;
		this.circle = circle;
	}

	public int compareTo(Sim o) {
		int n = (int) (this.rate - o.getRate());
		return n;
	}

}