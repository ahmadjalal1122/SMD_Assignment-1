public class Technician extends Staff{
    public String techType;

    public Technician(int adharID, String name, String address, int phone, String profession,
                      String empID, String empRole, String empDept, float empSalary,
                      int empExperience,String techType) {
        super(adharID,name, address, phone, profession,
              empID, empRole,  empDept,  empSalary, empExperience);
        this.techType = techType;

    }
    public String Maintain(String Lab)
    {
        System.out.println("The Maintainence is going on with techtype"+techType);
        return "Maintain";
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("---------Technician DISPLAYINFO-------------");
        System.out.println("Name:"+Name);
        System.out.println("TechType: " + techType);

    }
}
