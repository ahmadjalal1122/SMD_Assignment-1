public class Driver {
    public static void main(String[] args) {
        Student pgStudent = new PGStudent(4321, "Bob",
                "34 Street Sutton London", 477704011,
                "Engineer", "1305", "CS", 2024,
                7,"FAST","20L1305","ciber Security",'A');
//        pgStudent.displayInfo();

        Staff faculty=new Faculty(4321, "Alice",
                "1234 Street Sutton London", 464402498,
                "Engineering",
                "Fac4567", "Assistant Prof", "Computer Science",
                150000,6,
                "Computer Programming","A,B",
                120,"MS CS");
//        faculty.displayInfo();
        Staff technician=new Technician(4321, "Alice",
                "1234 Street Sutton London", 464402498,
                "Engineering",
                "Fac4567", "Assistant Prof", "Computer Science",
                50000,6,
                "CS Lab expert");
        technician.displayInfo();
    }
}
