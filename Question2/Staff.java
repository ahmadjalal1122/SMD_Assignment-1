// Concrete class Staff inheriting from Person
class Staff extends Person {
    String empID;
    String empRole;
    String empDept;
    float empSalary;
    int empExperience;

    public Staff(int AdharID , String Name,String Address, int Phone,String Profession,
                 String empID, String empRole,
                 String empDept, float empSalary,
                 int empExperience) {
        super(AdharID,Name,Address,Phone,Profession);
        this.empID = empID;
        this.empRole = empRole;
        this.empDept = empDept;
        this.empSalary = empSalary;
        this.empExperience = empExperience;
    }

    // Methods specific to Staff
    public String Attend(String Duty) {
        System.out.println(Name + " is attending work("+Duty+")in the " + empDept + " department.");
        return "Attended";
    }

    public String getPromotion() {
        System.out.println(Name + " is eligible for a promotion.");
        return "Promoted";
    }

    public float getSalary() {
        System.out.println("Salary of " + Name + " (Employee ID: " + empID + ") is $" + empSalary);
        return empSalary;
    }

    // Method to display staff information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("----------STAFF DISPLAYINFO------------");
        System.out.println("Name: " + Name);
        System.out.println("Employee ID: " + empID);
        System.out.println("Role: " + empRole);
        System.out.println("Department: " + empDept);
        System.out.println("Salary: $" + empSalary);
        System.out.println("Experience: " + empExperience + " years");
    }
}