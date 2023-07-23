import java.util.Scanner;

public class AssociateMain {

	public static void main(String[] args) {
		Associate [] a = new Associate[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			String name = sc.nextLine();
			int id = sc.nextInt();
			sc.nextLine();
			String tech = sc.nextLine();
			int exp = sc.nextInt();
			sc.nextLine();
			
			a[i] = new Associate(name, id, tech, exp);
		}
		
		String pTech = sc.nextLine();
		
		Associate[] result = AssociateMain.associateForGivenTechnology(a, pTech);
		
		for(Associate r : result){
			if(r != null){
				System.out.println(r.getId());
			}
		}
	}
	
	public static Associate[] associateForGivenTechnology(Associate[] associate, String tech) {
		Associate[] result = new Associate[3];
		int j = 0;
		for(Associate a : associate) {
			if(a.getTechnology().equalsIgnoreCase(tech)) {
				if(a.getExperienceInYears() % 5 == 0) {
					result[j++] = a;
				}
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int k = i+1; k < 3; k++) {
				if(result[k] != null)
				if(result[i].getId() > result[k].getId()) {
				Associate temp = result[i];
				result[i] = result[k];
				result[k] = temp;
				}
			}
		}
		return result;
	}

}

class Associate{
	private String name;
	private int id;
	private String Technology;
	private int experienceInYears;
	
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
	public String getTechnology() {
		return Technology;
	}
	public void setTechnology(String technology) {
		Technology = technology;
	}
	public int getExperienceInYears() {
		return experienceInYears;
	}
	public void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}
	public Associate(String name, int id, String technology, int experienceInYears) {
		super();
		this.name = name;
		this.id = id;
		Technology = technology;
		this.experienceInYears = experienceInYears;
	}
	
}
