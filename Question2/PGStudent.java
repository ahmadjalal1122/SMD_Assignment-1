class PGStudent extends Student {
    String rollNo;
    String specialization;

    public PGStudent(int adharID, String name, String address, int phone, String profession,
                     String studentID, String major, int year, int semester, String college,
                     String rollNo, String specialization,char grade) {
        super(adharID,name, address,phone,profession,
              studentID, major, year, semester, college,grade);
        this.rollNo = rollNo;
        this.specialization = specialization;
    }

    // Method specific to PGStudent
    public void submitThesis() {
        System.out.println(Name + " (Roll No: " + rollNo + ") has submitted their thesis in " + specialization);
    }

    // Method to display PGStudent information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("------------PGSTUDENT DISPLAYINFO------------");
        System.out.println("Name: " + Name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Major: " + major);
        System.out.println("Year: " + year);
        System.out.println("Semester: " + semester);
        System.out.println("College: " + college);
        System.out.println("Grade: " + grade);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Specialization: " + specialization);
    }
}
