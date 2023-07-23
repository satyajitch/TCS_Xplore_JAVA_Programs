import java.util.Scanner;

public class NavalVesselUsedMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NavalVessel[] nv = new NavalVessel[4];
		for(int i = 0;i < 4;i++) {
			int id = sc.nextInt();sc.nextLine();
			String name = sc.nextLine();
			int np = sc.nextInt();
			int nc = sc.nextInt();sc.nextLine();
			String purpose = sc.nextLine();
			nv[i] = new NavalVessel(id, name, np, nc, purpose);
		}
		int percent = sc.nextInt();sc.nextLine();
		String purpose = sc.nextLine();
		sc.close();
		
		int fresult = NavalVesselUsedMain.findAvgVoyagesByPct(nv, percent);
		
		
		NavalVessel fresult1 = NavalVesselUsedMain.findVesselByGrade(purpose, nv);
		if(fresult > 0)
		System.out.println(fresult);
		else {
			System.out.println("There are no voyages completed with this percentage");
		}
		if(fresult1 == null) {
			System.out.println("No Naval Vessel is available with the specified purpose");
		}else {
		System.out.println(fresult1.getVesselName()+"%"+fresult1.getClassification());
		}
	}
	static int findAvgVoyagesByPct(NavalVessel nvessel[], int percent) {
		int sum = 0;
		int avg = 0;
		int count = 0;
		for(NavalVessel nv : nvessel) {
			int cpct = (nv.getNoOfVoyagesCompleted() * 100)/ nv.getNoOfVoyagesPlanned();
			if(cpct >= percent) {
				sum += nv.getNoOfVoyagesCompleted();
				count++;
			}
		}
		if(count != 0) {
			avg = sum/count;
			return avg;
		}
		else {
			return 0;
		}
	}
	static NavalVessel findVesselByGrade(String p, NavalVessel nvessel[]) {
		NavalVessel result = null;
		for(NavalVessel nv : nvessel) {
			if(nv.getPurpose().equalsIgnoreCase(p)) {
				int cpct = (nv.getNoOfVoyagesCompleted() * 100)/ nv.getNoOfVoyagesPlanned();
				if(cpct == 100) {
					nv.setClassification("Star");
				}
				else if(cpct <= 99 && cpct >= 80) {
					nv.setClassification("Leader");
				}
				else if(cpct <= 79 && cpct >= 55) {
					nv.setClassification("Inspirer");
				}
				else {
					nv.setClassification("Striver");
				}
				result = nv;
			}
		}
		return result;
	}
}


class NavalVessel{
	private int vesselId;
	private String vesselName;
	private int noOfVoyagesPlanned;
	private int noOfVoyagesCompleted;
	private String purpose;
	private String classification;
	
	public NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose) {
		this.vesselId = vesselId;
		this.vesselName = vesselName;
		this.noOfVoyagesPlanned = noOfVoyagesPlanned;
		this.noOfVoyagesCompleted = noOfVoyagesCompleted;
		this.purpose = purpose;
	}
	
	public int getVesselId() {
		return vesselId;
	}
	
	public void setVesselId(int id) {
		this.vesselId = id;
	}
	public String getVesselName() {
		return vesselName;
	}
	
	public void setVesselName(String name) {
		this.vesselName = name;
	}
	
	public int getNoOfVoyagesPlanned() {
		return noOfVoyagesPlanned;
	}
	
	public void setNoOfVoyagesPlanned(int nop) {
		this.noOfVoyagesPlanned = nop;
	}
	public int getNoOfVoyagesCompleted() {
		return noOfVoyagesCompleted;
	}
	
	public void setNoOfVoyagesCompleted(int noc) {
		this.noOfVoyagesCompleted = noc;
	}
	
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String str) {
		this.purpose = str;
	}
	
	public String getClassification() {
		return classification;
	}
	public void setClassification(String cls) {
		this.classification = cls;
	}
	
}
