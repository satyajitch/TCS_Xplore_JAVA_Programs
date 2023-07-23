import java.util.Scanner;

public class TravelAgenciesDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TravelAgencies[] ta = new TravelAgencies[4];
		for(int i = 0; i < 4 ; i++) {
			int id = sc.nextInt();sc.nextLine();
			String name = sc.nextLine();
			String type = sc.nextLine();
			int price = sc.nextInt();
			boolean flightF = sc.nextBoolean();
			
			ta[i] = new TravelAgencies(id, name, type, price, flightF);
			
		}
		System.out.println("enter regNo:");
		int regNo = sc.nextInt();sc.nextLine();
		System.out.println("packageType:");
		String packageType = sc.nextLine();
		int fPrice = findAgencyWithHighestPackage(ta);
		
		System.out.println(fPrice);
		TravelAgencies tDetails = agencyDetailsForGivenIdAndType(ta, regNo, packageType);
		if(agencyDetailsForGivenIdAndType(ta, regNo, packageType) == null) {
			return;
		}
		else {
			System.out.println(tDetails.getAgencyName() + tDetails.getPrice());
		}
		
	}
	public static int findAgencyWithHighestPackage(TravelAgencies[] travelAgency) {
		int hPackage = travelAgency[0].getPrice();
		for(int i = 1; i < travelAgency.length; i++) {
			if(hPackage < travelAgency[i].getPrice()) {
				hPackage = travelAgency[i].getPrice();
			}
		}
		return hPackage;
	}
	public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] travelAgencies, int regNo, String packageType) {
		for(TravelAgencies tv: travelAgencies) {
			if(tv.getFlightFacility())
			if(tv.getRegNo() == regNo && tv.getPackageType().equalsIgnoreCase(packageType)) {
				return tv;
			}
		}
		return null;
	}

}

class TravelAgencies{
	private int regNo;
	private String agencyName;
	private String packageType;
	private int price;
	private boolean flightFacility;
	
	public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
		super();
		this.regNo = regNo;
		this.agencyName = agencyName;
		this.packageType = packageType;
		this.price = price;
		this.flightFacility = flightFacility;
	}
	
	public int getRegNo() {
		return regNo;
	}
	
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getAgencyName() {
		return agencyName;
	}
	
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	
	public String getPackageType() {
		return packageType;
	}
	
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean getFlightFacility() {
		return flightFacility;
	}
	
	public void setFlightFacility(boolean flightFacility) {
		this.flightFacility = flightFacility;
	}
	
}

