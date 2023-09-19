class Faculty extends Staff {
    String facultySpecialization;
    String section;
    int noOfStudents;
    String qualification;

    public Faculty(int adharID, String name, String address, int phone, String profession,
                   String empID, String empRole, String empDept, float empSalary,
                   int empExperience,String facultySpecialization,
                   String section, int noOfStudents, String qualification) {
        super(adharID,name, address, phone, profession,
              empID, empRole,  empDept,  empSalary, empExperience);
        this.facultySpecialization = facultySpecialization;
        this.section = section;
        this.noOfStudents = noOfStudents;
        this.qualification = qualification;
    }

    // Method to teach
    public String teach(String Course) {
        System.out.println(Name + " is teaching " + facultySpecialization + " to " + noOfStudents + " students in section " + section);
        return "Teaching";
    }

    // Method to assess
    public String assess(String StudentGrade) {
        System.out.println(Name + " is assessing the students in section " + section);
        return "Assess";
    }

    // Method to display faculty information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("---------FACULTY DISPLAYINFO-------------");
        System.out.println("Name: " + Name);
        System.out.println("Specialization: " + facultySpecialization);
        System.out.println("Section: " + section);
        System.out.println("Number of Students: " + noOfStudents);
        System.out.println("Qualification: " + qualification);
    }
}
