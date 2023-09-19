
// Concrete class Student inheriting from Person
class Student extends Person {
    String studentID;
    String major;
    int year;
    int semester;
    String college;
    char grade;

    public Student(int AdharID , String Name,String Address, int Phone,String Profession,
                   String studentID, String major,int year, int semester,
                   String college,char grade) {
        super(AdharID,Name,Address,Phone,Profession);
        this.studentID = studentID;
        this.major = major;
        this.year = year;
        this.semester = semester;
        this.college = college;
        this.grade = grade;
    }

    // Method to register the student for a course
    public String Register(String Course) {
        // Implementation for registration process
        System.out.println(Name + " is registered for the " + major + " program at " + college);
        return "Registered";
    }

    // Method to get the student's grade
    public char getGrade(String Course) {
        // Implementation to fetch and return the student's grade
        return grade;
    }

    // Method to attend a class
    public String attend(String Class) {
        // Implementation for attending a class
        System.out.println(Name + " is attending classes in year " + year + ", semester " + semester);
        return "Attended";
    }

    // Method to learn
    public String learn() {
        // Implementation for the learning process
        System.out.println(Name + " is learning " + major + " at " + college);
        return "Learning";
    }

    // Method to display student information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("---------STUDENT DISPLAYINFO-------------");
        System.out.println("Name: " + Name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Major: " + major);
        System.out.println("Year: " + year);
        System.out.println("Semester: " + semester);
        System.out.println("College: " + college);
        System.out.println("Grade: " + grade);
    }
}