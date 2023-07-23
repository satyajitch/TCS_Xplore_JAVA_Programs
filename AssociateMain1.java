import java.util.Scanner;
public class AssociateMain1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        Associate associates[] = new Associate[5];
	        
	        for(int i=0; i<5; i++) {
	            String associateName = sc.nextLine();
	            int associateId = sc.nextInt();sc.nextLine();
	            String technology = sc.nextLine();
	            int experienceInYrs = sc.nextInt();sc.nextLine();
	            
	            associates[i] = new Associate(associateName, associateId, technology, experienceInYrs);
	        }
	        
	        String technology = sc.nextLine();
	        
	        Associate answer[] = getAssociatesForGivenTechnoloay(associates,technology);
	        
	        for(Associate ans:answer) {
	            if(ans != null) {
	                System.out.println(ans.getAssociateId()+" "+ans.getAssociateName()+" "+ans.getTechnology()+" "+ans.getExperienceInYrs());
	            }
	        }
	    }
	public static Associate[] getAssociatesForGivenTechnoloay(Associate[] associates, String technology) {
		Associate[] associates2=new Associate[5];
		int j=0;
		for(int i=0;i<associates.length;i++)
		{
			if(associates[i].getTechnology().equals(technology) && associates[i].getExperienceInYrs()%5==0)
				associates2[j++]=associates[i];
		}
		for(int i=0;i<j-1;i++)
		{
			for(int k=0;k<j-i-1;k++)
			{
				if(associates2[k].getAssociateId()>associates2[k+1].getAssociateId())
				{
					Associate temp=associates2[k];
					associates2[k]=associates2[k+1];
					associates2[k+1]=temp;
				}
			}
		}
		return associates2;
	}
}

class Associate {
    private String associateName;
    private int associateId;
    private String technology;
    private int experienceInYrs;

    public Associate(String associateName, int associateId, String technology, int experienceInYrs) {
        this.associateName = associateName;
        this.associateId = associateId;
        this.technology = technology;
        this.experienceInYrs = experienceInYrs;
    }

    public String getAssociateName() {
        return associateName;
    }

    public void setAssociateName(String associateName) {
        this.associateName = associateName;
    }

    public int getAssociateId() {
        return associateId;
    }

    public void setAssociateId(int associateId) {
        this.associateId = associateId;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getExperienceInYrs() {
        return experienceInYrs;
    }

    public void setExperienceInYrs(int experienceInYrs) {
        this.experienceInYrs = experienceInYrs;
    }
}